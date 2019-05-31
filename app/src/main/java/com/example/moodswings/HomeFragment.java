package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.EventLogTags;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class HomeFragment extends Fragment {
    BarChart barchart;
    private Task<QuerySnapshot> retrieveSurveys;
    private ArrayList<Survey> mySurveys = new ArrayList<Survey>();
    private String TAG = "HomeFragment";
    private LineGraphSeries<DataPoint> series;
    private Task<DocumentSnapshot> retrieveSurvey;
    Survey survey = new Survey();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container,false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final DBAdapter db = new DBAdapter(getActivity());

        final Button today_button = (Button) view.findViewById(R.id.TodayMoodBtnID_2);
        final Button tomorrow_button = (Button) view.findViewById(R.id.TodayMoodBtnID_3);

        barchart = (BarChart) view.findViewById(R.id.moodgraph);
        final ArrayList<BarEntry> barEntries = new ArrayList<>();

        today_button.setBackgroundResource(R.drawable.noinput);
        tomorrow_button.setBackgroundResource(R.drawable.noinput);


        //DateFormat format = new SimpleDateFormat("MM/dd/yyyy");


        retrieveSurvey = db.getSurvey(survey.getTodaysDate());
        retrieveSurvey.addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot document) {
                survey = null;
                if (document.exists()) {
                    survey = document.toObject(Survey.class);
                   // mySurveys.add(survey);
                    int mood = survey.getMood();
                    Log.d("HERE", String.valueOf(survey.getMood()));
                    if(mood != 0){
                        if(mood == 1){
                            today_button.setBackgroundResource(R.drawable.circle_toggle_angry);
                        }
                        if(mood == 2){
                            today_button.setBackgroundResource(R.drawable.circle_toggle_misery);
                        }
                        if(mood == 3){
                            today_button.setBackgroundResource(R.drawable.circle_toggle_sad);
                        }
                        if(mood == 4){
                            today_button.setBackgroundResource(R.drawable.circle_toggle_okay);
                        }
                        if(mood == 5){
                            today_button.setBackgroundResource(R.drawable.circle_good);
                        }
                        if(mood == 6){
                            today_button.setBackgroundResource(R.drawable.circle_toggle_happy2);
                        }

                        tomorrow_button.setBackgroundResource(R.drawable.circle_toggle_angry);
                    }
                    Log.d("HERE", "DocumentSnapshot data: " + document.getData());

                } else {
                    Log.d("HERE", "No such document");
                }
            }
        });

//        retrieveSurveys = db.getSurvey(survey.getTomorrowsDate());
//        retrieveSurveys.addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//            @Override
//            public void onComplete(DocumentSnapshot document) {
//                survey = null;
//                if (document.exists()) {
//                    survey = document.toObject(Survey.class);
//                    // mySurveys.add(survey);
//                    int mood = survey.getMood();
//                    Log.d("HERE", String.valueOf(survey.getMood()));
//                    if(mood != 0){
//                        if(mood == 1){
//                            tomorrow_button.setBackgroundResource(R.drawable.circle_toggle_angry);
//                        }
//                        if(mood == 2){
//                            tomorrow_button.setBackgroundResource(R.drawable.circle_toggle_misery);
//                        }
//                        if(mood == 3){
//                            tomorrow_button.setBackgroundResource(R.drawable.circle_toggle_sad);
//                        }
//                        if(mood == 4){
//                            tomorrow_button.setBackgroundResource(R.drawable.circle_toggle_okay);
//                        }
//                        if(mood == 5){
//                            tomorrow_button.setBackgroundResource(R.drawable.circle_good);
//                        }
//                        if(mood == 6){
//                            tomorrow_button.setBackgroundResource(R.drawable.circle_toggle_happy2);
//                        }
//
//                    }
//                    Log.d("HERE", "DocumentSnapshot data: " + document.getData());
//
//                } else {
//                    Log.d("HERE", "No such document");
//                }
//            }
//        });


        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK,-6);
        final ArrayList<String> days = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            final int finalI = i;
            String date = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
            String date5 = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()) +
                    ", " + calendar.get(Calendar.DATE) + "/"
                    + (calendar.get(Calendar.MONTH) + 1) + "/"
                    + calendar.get(Calendar.YEAR);
            Log.d("DATE", date5);
            calendar.add(Calendar.DAY_OF_WEEK, 1);


            days.add(date);

            retrieveSurvey = db.getSurvey(date5);
            retrieveSurvey.addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                @Override
                public void onSuccess(DocumentSnapshot document) {
                    survey = null;
                    Survey temp = null;
                    if (document.exists()) {
                        survey = document.toObject(Survey.class);
                        String diaryDate = document.getString("diaryDate");
                        Integer moodEnum = document.getDouble("mood").intValue();
                        String diaryEntry = document.getString("diaryEntry");
                        Integer activities = document.getDouble("activities").intValue();
                        temp = new Survey(moodEnum,diaryEntry,activities,diaryDate);
                        int mood = temp.getMood();
                        mySurveys.add(temp);
                            if (mood == 1) {
                                barEntries.add(new BarEntry(1f, finalI));
                                Log.d("I HERE", String.valueOf(finalI));
                            }
                            if (mood == 2) {
                                barEntries.add(new BarEntry(2f, finalI));
                                Log.d("I HERE", String.valueOf(finalI));
                            }
                            if (mood == 3) {
                                barEntries.add(new BarEntry(3f, finalI));
                                Log.d("I HERE", String.valueOf(finalI));
                            }
                            if (mood == 4) {
                                barEntries.add(new BarEntry(4f, finalI));
                                Log.d("I HERE", String.valueOf(finalI));
                            }
                            if (mood == 5) {
                                barEntries.add(new BarEntry(5f, finalI));
                                Log.d("I HERE", String.valueOf(finalI));
                            }
                            if (mood == 6) {
                                barEntries.add(new BarEntry(6f, finalI));
                                Log.d("I HERE", String.valueOf(finalI));
                            }
                            if (mood == 0) {
                                barEntries.add(new BarEntry(0f, finalI));
                                Log.d("I HERE", String.valueOf(finalI));
                            }
                            Log.d("MOOD", String.valueOf(survey.getMood()));
                            BarDataSet barDataSet = new BarDataSet(barEntries, "Dates");

                            barchart.invalidate();
                            barchart.setDescription(null);
                            BarData theData = new BarData(days, barDataSet);
                            barchart.setData(theData);
                            barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
                            barchart.setTouchEnabled(true);
                            barchart.setDragEnabled(true);
                            barchart.setScaleEnabled(true);
                            Log.d("HERE", "DocumentSnapshot data: " + document.getData());

                            SurveyAdapter surveyAdapter = new SurveyAdapter(getActivity(), mySurveys);
                            Log.d("MYSURVEY", String.valueOf(mySurveys));
                            ListView surveysList = view.findViewById(R.id.list_home);
                            surveysList.setAdapter(surveyAdapter);

                        } else {
                            Log.d("HERE", "No such document");
                        }

                    }

            });

        }

    }

    private void sign_out(){
        FirebaseAuth.getInstance().signOut();
        Intent authIntent = new Intent(getActivity(), LoginActivity.class);
        startActivity(authIntent);
        getActivity().finish();
    }
}
