package com.example.moodswings;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


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

        double mood = 0, day;
        GraphView moodGraph = (GraphView) getView().findViewById(R.id.moodgraph);
        series = new LineGraphSeries<>();

        int numDataPoints = 500;
        for( int i = 0; i < numDataPoints; i ++){
            //filler
            mood = mood + .01;
            day = Math.sin(mood);
            series.appendData(new DataPoint(mood, day), true, numDataPoints);

        }
        moodGraph.addSeries(series);
    }

}



