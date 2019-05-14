package com.example.moodswings;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.DateAsXAxisLabelFormatter;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class HomeFragment extends Fragment {

    private LineGraphSeries<DataPoint> series;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        GraphView moodGraph = (GraphView) view.findViewById(R.id.moodgraph);
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


        series.setColor(getResources().getColor(R.color.colorPrimary));
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
        moodGraph.getViewport().setXAxisBoundsManual(true);


    }

}



