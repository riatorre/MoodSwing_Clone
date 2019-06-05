package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class TodayMoodPart3 extends AppCompatActivity {
    /*initialize object survey in order to put diary entry in survey object*/
    private Survey survey;

    /*Initialize a new database adapter, to put survey object into Firebase*/
    private DBAdapter db = new DBAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part3);

        /*Get Survey Data*/
        survey = Objects.requireNonNull(getIntent().getExtras()).getParcelable("survey");

        /*Set title entry to current date
        *Survey survey = new Survey();*/
        assert survey != null;
        String title = survey.getDiaryDate();
        TextView err = findViewById(R.id.diary_title);
        err.setText(title);

    }

    /*Get text from diaryentry and initialize to Survey Object
    *Submit the Today's Survey to Firebase*/
    public void onClickDone(View view) {
        EditText editText = findViewById(R.id.diaryentry);
        String value = editText.getText().toString();
        survey.setDiaryEntry(value);
        db.addSurvey(survey);
        Intent goToSurveypart2 = new Intent(getApplicationContext(),MainActivity.class);
        goToSurveypart2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToSurveypart2);
    }
}
