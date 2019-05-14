package com.example.moodswings;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class DBAdapter {
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String uid = user.getUid();
    private FirebaseFirestore db;
    private String TAG = "Firebase_FireStore";
    private Survey surveyResult;
    private ArrayList<Survey> surveyResults;
    public DBAdapter(){
        db = FirebaseFirestore.getInstance();
    }

    public void addSurvey(Survey survey){
        db.collection("surveys/" + uid).document(survey.getDiaryDate()).set(survey).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d(TAG, "DocumentSnapshot successfully written!");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "Error writing document", e);
            }
        });
    }
    public void getSurvey(String date){
        db.collection("surveys" + uid).document(date).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                surveyResult = null;
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        surveyResult = document.toObject(Survey.class);
                        Log.d(TAG, "DocumentSnapshot data: " + document.getData());
                    } else {
                        Log.d(TAG, "No such document");
                    }
                } else {
                    Log.d(TAG, "get failed with ", task.getException());
                }
            }
        });
    }
    public void getTodaysSurvey(){
        this.getSurvey(surveyResult.getTodaysDate());
    }
    public void getSurveys(){
        db.collection("surveys" + uid).get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                surveyResults = null;
                if (task.isSuccessful()) {
                    for(QueryDocumentSnapshot document : task.getResult()){
                        surveyResults.add(document.toObject(Survey.class));
                        Log.d(TAG, document.getId() + " => " + document.getData());
                    }
                } else {
                    Log.d(TAG, "get failed with ", task.getException());
                }
            }
        });
    }
}
