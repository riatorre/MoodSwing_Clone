package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

public class TodayMoodPart1 extends AppCompatActivity {
    final Survey survey = new Survey();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part1);
    }

    public void onClickSurveypage1(View view) {
        RadioGroup radioGroup = findViewById(R.id.MoodRadioGroup);
        int selectedMood = radioGroup.getCheckedRadioButtonId();
        switch (selectedMood){
            case R.id.TodayMoodBtnID0:
                survey.setMood(1);
                break;
            case R.id.TodayMoodBtnID1:
                survey.setMood(2);
                break;
            case R.id.TodayMoodBtnID2:
                survey.setMood(3);
                break;
            case R.id.TodayMoodBtnID3:
                survey.setMood(4);
                break;
            case R.id.TodayMoodBtnID4:
                survey.setMood(5);
                break;
            case R.id.TodayMoodBtnID5:
                survey.setMood(6);
                break;
            default:
                survey.setMood(0);
        }
        if(survey.getMood()==0){
            Message.message(this, "Please choose a mood.");
        }else{
            Intent goToSurveypart2 = new Intent(getApplicationContext(), TodayMoodPart2.class);
            goToSurveypart2.putExtra("survey", survey);
            startActivity(goToSurveypart2);
        }
    }
}
