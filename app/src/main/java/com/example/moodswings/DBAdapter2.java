package com.example.moodswings;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

class DBAdapter2 {
    private FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    private String uid = user.getUid();
    private FirebaseFirestore db;
    private Context mContext;

    private String TAG = "Firebase_FireStore";
    private String surveyStorePath = "surveys/users/"+uid;

    Survey2 surveyResult;

    DBAdapter2(Context mContext){
        this.mContext = mContext;
        db = FirebaseFirestore.getInstance();
    }


//    void addSurvey2(Survey2 survey){
//        db.collection(surveyStorePath)
//                .document(survey.getDiaryDate().replace("/","_"))
//                .set(survey)
//                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//                        Message.message( mContext, "Today's Survey successfully stored");
//                        Log.d(TAG, "DocumentSnapshot successfully written!");
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Message.message( mContext, "Failed to store Today's Survey");
//                Log.w(TAG, "Error writing document", e);
//            }
//        });
//    }

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
                            surveyResult = document.toObject(Survey2.class);
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
    Task<QuerySnapshot> getSurveys(){
        return db.collection(surveyStorePath).get();
    }
}
