package com.example.moodswings;

import android.content.Intent;
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
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.firebase.auth.FirebaseAuth;
import com.google.type.Color;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.DateAsXAxisLabelFormatter;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class HomeFragment extends Fragment {
    BarChart barchart;

    private LineGraphSeries<DataPoint> series;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        barchart = (BarChart) view.findViewById(R.id.moodgraph);
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1f,0));
        barEntries.add(new BarEntry(5f,1));
        barEntries.add(new BarEntry(3f,2));
        barEntries.add(new BarEntry(2f,3));
        barEntries.add(new BarEntry(6f,4));
        barEntries.add(new BarEntry(4f,5));
        barEntries.add(new BarEntry(5f,6));
        BarDataSet barDataSet = new BarDataSet(barEntries, "Dates");

        ArrayList<String> labels = new ArrayList<>();
        labels.add("Sunday");
        labels.add("Monday");
        labels.add("Tuesday");
        labels.add("Wednesday");
        labels.add("Thursday");
        labels.add("Friday");
        labels.add("Saturday");


        BarData theData = new BarData(labels, barDataSet);
        barchart.setData(theData);
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        barchart.setTouchEnabled(true);
        barchart.setDragEnabled(true);
        barchart.setScaleEnabled(true);




        //Button signIn = view.findViewById(R.id.signOutBtn);
        //signIn.setOnClickListener(new View.OnClickListener(){
        //    @Override
        //    public void onClick(View view){
        //        sign_out();
        //    }
        //});

      /*  GraphView moodGraph = (GraphView) view.findViewById(R.id.moodgraph);
        series = new LineGraphSeries<>();


        series.setDrawDataPoints(true);
        series.setDataPointsRadius(10);
        moodGraph.getGridLabelRenderer().setVerticalAxisTitleTextSize(30);
        moodGraph.getGridLabelRenderer().setVerticalAxisTitle("MOOD");
        moodGraph.getGridLabelRenderer().setHorizontalLabelsVisible(true);



        //Below two lines change the label color
        moodGraph.getGridLabelRenderer().setVerticalLabelsColor(Color.BLACK);
        moodGraph.getGridLabelRenderer().setHorizontalLabelsColor(Color.BLACK);
        moodGraph.getGridLabelRenderer().setVerticalAxisTitleColor(Color.BLACK);
        moodGraph.getGridLabelRenderer().setHorizontalAxisTitleColor(Color.BLACK);
        moodGraph.getGridLabelRenderer().reloadStyles();


        series.setColor(getResources().getColor(R.color.melloworange));
        // generate Dates
        Calendar calendar = Calendar.getInstance();
        Date d1 = calendar.getTime();
        calendar.add(Calendar.DATE, 1);
        Date d2 = calendar.getTime();
        calendar.add(Calendar.DATE, 1);
        Date d3 = calendar.getTime();

        // you can directly pass Date objects to DataPoint-Constructor
        // this will convert the Date to double via Date#getTime()
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(d1, 1),
                new DataPoint(d2, 5),
                new DataPoint(d3, 0)
        });
        moodGraph.addSeries(series);

        // set date label formatter
        moodGraph.getGridLabelRenderer().setLabelFormatter(new DateAsXAxisLabelFormatter(getActivity()));
        moodGraph.getGridLabelRenderer().setNumHorizontalLabels(3); // only 4 because of the space
        moodGraph.getGridLabelRenderer().setNumVerticalLabels(6);

        // set manual x bounds to have nice steps
        moodGraph.getViewport().setMinX(d1.getTime());
        moodGraph.getViewport().setMaxX(d3.getTime());
        moodGraph.getViewport().setXAxisBoundsManual(true);*/


    }

    private void sign_out(){
        FirebaseAuth.getInstance().signOut();
        Intent authIntent = new Intent(getActivity(), LoginActivity.class);
        startActivity(authIntent);
        getActivity().finish();
    }
}



