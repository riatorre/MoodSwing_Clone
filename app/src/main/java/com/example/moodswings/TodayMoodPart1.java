package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodayMoodPart1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part1);
    }

    public void onClickSurveypage1(View view) {
        Intent goToSurveypart2 = new Intent(getApplicationContext(),TodayMoodPart2.class);
        startActivity(goToSurveypart2);
    }
}
