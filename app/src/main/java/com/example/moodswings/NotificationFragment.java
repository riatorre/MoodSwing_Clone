package com.example.moodswings;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Objects;


public class NotificationFragment extends Fragment {
    private DBAdapter db = new DBAdapter(getActivity());
    private ArrayList<Survey> mySurveys = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_notification,container,false);
        Task<QuerySnapshot> retrieveSurveys = db.getSurveys();
        retrieveSurveys.addOnCompleteListener(Objects.requireNonNull(getActivity()),
                new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete( @NonNull Task<QuerySnapshot> task) {
                        mySurveys.clear();
                        if (task.isSuccessful()) {
                            for(QueryDocumentSnapshot document : Objects.requireNonNull(task.getResult())){
                                String diaryDate = document.getString("diaryDate");
                                Integer moodEnum = Objects.requireNonNull(document.getDouble("mood")).intValue();
                                String diaryEntry = document.getString("diaryEntry");
                                Integer activities = Objects.requireNonNull(document.getDouble("activities")).intValue();
                                Survey temp = new Survey(moodEnum,diaryEntry,activities,diaryDate);
                                mySurveys.add(temp);
                            }
                            if(mySurveys != null) {
                                SurveyAdapter surveyAdapter = new SurveyAdapter(getActivity(), mySurveys);
                                ListView surveysList = view.findViewById(R.id.surveysList);
                                surveysList.setAdapter(surveyAdapter);
                            }
                        } else {
                            Message.message(getActivity(),
                                    "Unable to retrieve your Surveys");
                        }
                    }
                });
        return view;
    }
}
