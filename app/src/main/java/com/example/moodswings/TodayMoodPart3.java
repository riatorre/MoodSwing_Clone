package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TodayMoodPart3 extends AppCompatActivity {
    private Survey survey;
    private DBAdapter db = new DBAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part3);

        //get Survey Data
        survey = getIntent().getExtras().getParcelable("survey");

        //Set title entry
        //Survey survey = new Survey();
        String title = survey.getDiaryDate();

        TextView err = findViewById(R.id.diary_title);
        err.setText(title);

    }

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
