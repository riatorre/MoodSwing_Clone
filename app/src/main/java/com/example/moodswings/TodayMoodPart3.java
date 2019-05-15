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
        survey = (Survey) getIntent().getSerializableExtra("survey");
        EditText editText = (EditText) findViewById(R.id.diaryentry);
        String value = editText.getText().toString();
        survey.setDiaryEntry(value);

        //Set title entry
        Survey survey = new Survey();
        String title = survey.getDiaryDate();
        TextView err = (TextView)findViewById(R.id.diary_title);
        err.setText(title);

    }

    public void onClickDone(View view) {
        db.addSurvey(survey);
        Intent goToSurveypart2 = new Intent(getApplicationContext(),MainActivity.class);
        goToSurveypart2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToSurveypart2);
    }
}
