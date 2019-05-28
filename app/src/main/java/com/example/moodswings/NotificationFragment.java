package com.example.moodswings;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;


public class NotificationFragment extends Fragment {
    private DBAdapter db = new DBAdapter(getActivity());
    private Task<QuerySnapshot> retrieveSurveys;
    private ArrayList<Survey> mySurveys = new ArrayList<Survey>();
    private String TAG = "NotificationFragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        retrieveSurveys = db.getSurveys();
        retrieveSurveys.addOnCompleteListener(getActivity(),
                new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete( @NonNull Task<QuerySnapshot> task) {
                        mySurveys.clear();
                        if (task.isSuccessful()) {
                            for(QueryDocumentSnapshot document : task.getResult()){
                                Survey temp = document.toObject(Survey.class);
                                mySurveys.add(temp);
                                Log.d(TAG, document.getId() + " => " + document.getData());
                            }
                        } else {
                            Message.message(getActivity(),
                                    "Unable to retrieve your Surveys");
                            Log.d(TAG, "get failed with ", task.getException());
                        }
                        Log.d(TAG,mySurveys.toString());
                    }
                });
        return inflater.inflate(R.layout.fragment_notification,container,false);
    }
}
