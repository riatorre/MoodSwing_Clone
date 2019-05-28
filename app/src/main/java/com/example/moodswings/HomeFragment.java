package com.example.moodswings;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class HomeFragment extends Fragment {
    BarChart barchart;

    private LineGraphSeries<DataPoint> series;
    private Task<DocumentSnapshot> retrieveSurvey;
    Survey survey = new Survey();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DBAdapter db = new DBAdapter(getActivity());

        final Button today_button = view.findViewById(R.id.TodayMoodBtnID_2);
        final Button tomorrow_button = view.findViewById(R.id.TodayMoodBtnID_3);

        barchart = view.findViewById(R.id.moodgraph);
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1f,0));
        barEntries.add(new BarEntry(5f,1));
        barEntries.add(new BarEntry(3f,2));
        barEntries.add(new BarEntry(2f,3));
        barEntries.add(new BarEntry(6f,4));
        barEntries.add(new BarEntry(4f,5));
        barEntries.add(new BarEntry(5f,6));
        BarDataSet barDataSet = new BarDataSet(barEntries, "Dates");


        //DateFormat format = new SimpleDateFormat("MM/dd/yyyy");


        retrieveSurvey = db.getSurvey(survey.getTodaysDate());
        retrieveSurvey.addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot document) {
                survey = null;
                if (document.exists()) {
                    survey = document.toObject(Survey.class);
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
                            today_button.setBackgroundResource(R.drawable.circle_toggle_happy);
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

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK,-7);
        ArrayList<String> days = new ArrayList<>();
        for (int i = 0; i < 7; i++)
        {
            String date5 = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()) +
                    ", " + calendar.get(Calendar.DATE) + "/"
                    + (calendar.get(Calendar.MONTH)+1) + "/"
                    + calendar.get(Calendar.YEAR);
            calendar.add(Calendar.DAY_OF_WEEK, 1);

            String  date = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
            days.add(date);
            db.getSurvey(date5);

        }


        BarData theData = new BarData(days, barDataSet);
        barchart.setData(theData);
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        barchart.setTouchEnabled(true);
        barchart.setDragEnabled(true);
        barchart.setScaleEnabled(true);
    }
}
