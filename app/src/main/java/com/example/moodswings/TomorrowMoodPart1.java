package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TomorrowMoodPart1 extends AppCompatActivity {

    private Survey survey;

    private DBAdapter db = new DBAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomorrow_mood_part1);

        //survey.setActivities(2);
    }

    public void onClickDone_Tomorrow_1(View view) {
        Intent goToSurveypart1_Tomorrow_1 = new Intent(getApplicationContext(), MainActivity.class);
        goToSurveypart1_Tomorrow_1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToSurveypart1_Tomorrow_1);
    }
}
