package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TodayMoodPart3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part3);

        Survey survey = new Survey();
        String title = survey.getDiaryDate();
        TextView err = (TextView)findViewById(R.id.diary_title);
        err.setText(title);

    }

    public void onClickDone(View view) {
        Intent goToSurveypart2 = new Intent(getApplicationContext(),MainActivity.class);
        goToSurveypart2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToSurveypart2);
    }
}
