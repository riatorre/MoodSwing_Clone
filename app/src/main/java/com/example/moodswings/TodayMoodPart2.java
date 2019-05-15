package com.example.moodswings;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodayMoodPart2 extends AppCompatActivity {

    private Survey survey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part2);
        survey = (Survey) getIntent().getExtras().getParcelable("survey");
        survey.setActivities(2);
    }

    public void onClickNextPart2(View view) {
        Intent goToSurveypart3 = new Intent(getApplicationContext(),TodayMoodPart3.class);
        goToSurveypart3.putExtra("survey", (Parcelable) survey);
        startActivity(goToSurveypart3);
    }
}
