package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TomorrowMoodPart1 extends AppCompatActivity {

    private Survey survey;

    private DBAdapter db = new DBAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomorrow_mood_part1);

        //get Survey Data
        survey = (Survey) getIntent().getExtras().getParcelable("survey_Tomorrow_1");

    }

    public void fragment_OK_button_ID_Tomorrow_1(View view) {
//        EditText editText = (EditText) findViewById(R.id.diaryentry);
//        String value = editText.getText().toString();
//        survey.setDiaryEntry(value);
        db.addSurvey(survey);

        Intent goToSurveypart1_Tomorrow_1 = new Intent(getApplicationContext(),MainActivity.class);
 //       goToSurveypart1_Tomorrow_1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToSurveypart1_Tomorrow_1);
    }

    public void onClickDone_Tomorrow_1(View view) {
        Intent goToSurveypart1_Tomorrow_1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(goToSurveypart1_Tomorrow_1);
    }


}
