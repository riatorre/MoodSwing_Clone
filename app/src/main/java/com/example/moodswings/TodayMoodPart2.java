package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodayMoodPart2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part2);
        Survey survey = (Survey) getIntent().getSerializableExtra("survey");
        survey.setActivities(2);
    }

    public void onClickNextPart2(View view) {
        Intent goToSurveypart2 = new Intent(getApplicationContext(),TodayMoodPart3.class);
        startActivity(goToSurveypart2);
    }
}
