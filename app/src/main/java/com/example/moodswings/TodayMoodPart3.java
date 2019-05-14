package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodayMoodPart3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part3);
    }

    public void onClickDone(View view) {
        Intent goToSurveypart2 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(goToSurveypart2);
    }
}
