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
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class DBAdapter {
    private FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    private String uid = user.getUid();
    private FirebaseFirestore db;
    private Context mContext;

    private String TAG = "Firebase_FireStore";
    private String surveyStorePath = "surveys/users/"+uid;

    Survey surveyResult;

    DBAdapter(Context mContext){
        this.mContext = mContext;
        db = FirebaseFirestore.getInstance();
    }

    void addSurvey(Survey survey){
        db.collection(surveyStorePath)
                .document(survey.getDiaryDate().replace("/","_"))
                .set(survey)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Message.message( mContext, "Today's Survey successfully stored");
                        Log.d(TAG, "DocumentSnapshot successfully written!");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Message.message( mContext, "Failed to store Today's Survey");
                        Log.w(TAG, "Error writing document", e);
                    }
                });
    }

    public Task<DocumentSnapshot> getSurvey(String date){
        return db.collection(surveyStorePath)
                .document(date.replace("/","_"))
                .get()

                //Successful Execution
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot document) {
                        surveyResult = null;
                        if (document.exists()) {
                            surveyResult = document.toObject(Survey.class);
                            Log.d(TAG, "DocumentSnapshot data: " + document.getData());
                        } else {
                            Log.d(TAG, "No such document");
                        }
                    }
                })/**/
                //Unsuccessful Execution
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Message.message(mContext, "Unable to retrieve Survey");
                        Log.w(TAG, "Error Retrieving Survey: ", e);
                    }
                });
    }

    public Task<QuerySnapshot> getSurveys(){
        return db.collection(surveyStorePath).get();
    }
    public Task<QuerySnapshot> getLatestSurveyForActivity(Integer activity){
        return db.collection(surveyStorePath)
            .whereEqualTo("activities", activity)
            .orderBy("diaryDate", Query.Direction.DESCENDING)
            .limit(1)
            .get()
            .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                @Override
                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                    if(task.isSuccessful()) {
                        for(QueryDocumentSnapshot document : task.getResult()){
                            Log.d(TAG, document.getId() + " => " + document.getData());
                        }
                    } else {
                        Message.message(mContext,
                                "Unable to retrieve surveys with activity");
                        Log.d(TAG, "get failed with ", task.getException());
                    }
                }
            }
        );
    }
}
