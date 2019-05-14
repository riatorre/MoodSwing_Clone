package com.example.moodswings;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TodayMoodPart1 extends AppCompatActivity {
    final Survey survey = new Survey();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part1);
        final DBAdapter db = new DBAdapter(this);
        Button mood_1 = findViewById(R.id.todayMoodBtnID1);
        mood_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    survey.setMood(1);
            }
        });

        Button mood_2 = findViewById(R.id.todayMoodBtnID);
        mood_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(2);
            }
        });

        Button mood_3 = findViewById(R.id.todayMoodBtnID2);
        mood_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(3);
            }
        });

        Button mood_4 = findViewById(R.id.TodayMoodBtnID);
        mood_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(4);
            }
        });

        Button mood_5 = findViewById(R.id.todayMoodBtnID4);
        mood_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(5);
            }
        });

        Button mood_6 = findViewById(R.id.todayMoodBtnID5);
        mood_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(6);
            }
        });
    }

    public void onClickSurveypage1(View view) {
        Intent goToSurveypart2 = new Intent(getApplicationContext(), TodayMoodPart2.class);
        goToSurveypart2.putExtra("survey", (Parcelable) survey);
        startActivity(goToSurveypart2);
    }

}
