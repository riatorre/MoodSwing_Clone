/*
 *  DBAdapter.java
 *  Adapter for DB Implementation.
 *
 *  Utilizes Firebase FireStore.
 *
 *  Survey CRUD
 *  C - addSurvey(Survey S)
 *  R - getSurvey(String dateKey), getTodaysSurvey(), getSurveys()
 *  U - addSurvey(Survey S)
 *  D - NULL
 *      Where S = new Survey()
 *            dateKey = MM_DD_YYYY
 *  getSurvey() && getTodaysSurvey() returns result to this.surveyResult; will be null if it can't
 *      find one.
 *  getSurveys() returns result to this.surveyResults; will be null if none are found, returns an
 *      ArrayList of Surveys
 *
 */

package com.example.moodswings;

import android.content.Context;
import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

class DBAdapter {
    private FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    private String uid = Objects.requireNonNull(user).getUid();
    private FirebaseFirestore db;
    private Context mContext;

    private String surveyStorePath = "surveys/users/userSurveys";

    DBAdapter(Context mContext){
        this.mContext = mContext;
        db = FirebaseFirestore.getInstance();
    }

    void addSurvey(Survey survey){
        survey.setUID(uid);
        db.collection(surveyStorePath)
                .document(survey.getDiaryDate().replace("/","_")+"_"+uid)
                .set(survey)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Message.message( mContext, "Survey successfully stored");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Message.message( mContext, "Failed to store Survey");
                    }
                });
    }

    Task<QuerySnapshot> getSurvey(String date){
        return db.collection(surveyStorePath)
                .whereEqualTo(FieldPath.documentId(), date.replace("/","_")+"_"+uid)
                .whereEqualTo("uid", uid)
                .get();
    }

    Task<QuerySnapshot> getSurveys(){
        return db.collection(surveyStorePath)
                .whereEqualTo("uid", uid)
                .orderBy("todaysDate", Query.Direction.DESCENDING)
                .get();
    }
    Task<QuerySnapshot> getLatestSurveyForActivity(Integer activity){
        return db.collection(surveyStorePath)
                .whereEqualTo("uid", uid)
                .whereEqualTo("activities", activity)
                .whereLessThan("todaysDate", new Date())
                .orderBy("todaysDate", Query.Direction.DESCENDING)
                .limit(1)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(!task.isSuccessful()) {
                            Message.message(mContext,
                                    "Unable to retrieve surveys with activity");
                        }
                    }
                }
        );
    }
    Task<QuerySnapshot> getWeekSurveys(){
        Calendar calendar = Calendar.getInstance();
        Date upperBound = calendar.getTime();
        calendar.add(Calendar.DATE, -6);
        Date lowerBound = calendar.getTime();
        return db.collection(surveyStorePath)
                .whereEqualTo("uid", uid)
                .whereGreaterThanOrEqualTo("todaysDate", lowerBound)
                .whereLessThanOrEqualTo("todaysDate", upperBound)
                .orderBy("todaysDate", Query.Direction.DESCENDING)
                .limit(7)
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(!task.isSuccessful()) {
                            Message.message(mContext,
                                    "Unable to retrieve surveys for the week");
                        }
                    }
                });
    }
}
