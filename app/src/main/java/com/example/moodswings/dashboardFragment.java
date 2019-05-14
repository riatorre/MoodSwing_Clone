package com.example.moodswings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
        Button OkButton = (Button) view.findViewById(R.id.fragment_OK_button_ID);
        OkButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent goTOActivity = new Intent(getActivity(),TodayMoodPart1.class);
                startActivity(goTOActivity);
            }
        });

        return view;
    }
}
