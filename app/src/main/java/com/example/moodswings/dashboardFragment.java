package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class dashboardFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_dashboard,container,false);
//        final Button OkButton = (Button) view.findViewById(R.id.fragment_OK_button_ID);
        final Button survey_tomorrow = (Button) view.findViewById(R.id.fragment_OK_button_ID_Tomorrow_1);



//        OkButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                OkButton.setBackgroundResource((R.drawable.circl_button_large_pressed));
//                Intent goTOActivity = new Intent(getActivity(),TodayMoodPart1.class);
//                startActivity(goTOActivity);
//                Handler handler = new Handler();
//                handler.postDelayed(new Runnable() {
//                    public void run() {
//                        OkButton.setBackgroundResource((R.drawable.circle_button_small));
//                    }
//                }, 50);
//            }
//        });

        survey_tomorrow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                survey_tomorrow.setBackgroundResource((R.drawable.circle_button_small_pressed));
                Intent goTOActivity = new Intent(getActivity(),TomorrowMoodPart1.class);
                startActivity(goTOActivity);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        survey_tomorrow.setBackgroundResource((R.drawable.circle_button));
                    }
                }, 100);
            }
        });
        return view;
    }
}
