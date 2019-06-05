package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class TodayMoodPart1 extends AppCompatActivity {
    /*initialize object survey in order to put moods in survey object*/
    final Survey survey = new Survey();

    /*initialize Mood Radio Buttons*/
    private RadioButton mood_1;
    private RadioButton mood_2;
    private RadioButton mood_3;
    private RadioButton mood_4;
    private RadioButton mood_5;
    private RadioButton mood_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part1);

        /*initialize Mood Radio Buttons to correlating buttons on activity_today_mood_part1*/
        mood_1 = findViewById(R.id.TodayMoodBtnID0);
        mood_2 = findViewById(R.id.TodayMoodBtnID1);
        mood_3 = findViewById(R.id.TodayMoodBtnID2);
        mood_4 = findViewById(R.id.TodayMoodBtnID3);
        mood_5 = findViewById(R.id.TodayMoodBtnID4);
        mood_6 = findViewById(R.id.TodayMoodBtnID5);

        /*Create setOnClickListeners for every Radio Button
        * If a certain Radio Button is pressed, go to function handleClick(view)*/
        mood_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        mood_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        mood_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        mood_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        mood_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        mood_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
    }

    /*if "Next" button is clicked:
    * if no mood was pressed, send a message saying please choose a mood
    * else create a new Intent and go to next Survey page*/
    public void onClickSurveypage1(View view) {
        if(survey.getMood()==0){
            Message.message(this, "Please choose a mood.");
        }else{
            Intent goToSurveypart2 = new Intent(getApplicationContext(), TodayMoodPart2.class);
            goToSurveypart2.putExtra("survey", survey);
            startActivity(goToSurveypart2);
        }
    }

    /*Toggles mood Radio Buttons to a different color if clicked
     * goes to resetRadioBtns() to untoggle mood buttons*/
    private void handleClick(View view){
        int id = view.getId();
        resetRadioBtns();
        switch(id) {
            case R.id.TodayMoodBtnID0:
                mood_1.setBackgroundResource(R.drawable.circle_angry_toggle);
                survey.setMood(1);
                break;
            case R.id.TodayMoodBtnID1:
                mood_2.setBackgroundResource(R.drawable.circle_misery_toggle);
                survey.setMood(2);
                break;
            case R.id.TodayMoodBtnID2:
                mood_3.setBackgroundResource(R.drawable.circle_sad_toggle);
                survey.setMood(3);
                break;
            case R.id.TodayMoodBtnID3:
                mood_4.setBackgroundResource(R.drawable.circle_okay_toggle);
                survey.setMood(4);
                break;
            case R.id.TodayMoodBtnID4:
                mood_5.setBackgroundResource(R.drawable.circle_good_toggle);
                survey.setMood(5);
                break;
            case R.id.TodayMoodBtnID5:
                mood_6.setBackgroundResource(R.drawable.circle_happy_toggle);
                survey.setMood(6);
                break;
            default:
                survey.setMood(0);
        }
    }

    /*untoggles mood Radio Buttons*/
    private void resetRadioBtns(){
        mood_1.setBackgroundResource(R.drawable.circle_angry);
        mood_2.setBackgroundResource(R.drawable.circle_misery);
        mood_3.setBackgroundResource(R.drawable.circle_sad);
        mood_4.setBackgroundResource(R.drawable.circle_okay);
        mood_5.setBackgroundResource(R.drawable.circle_good);
        mood_6.setBackgroundResource(R.drawable.circle_happy);
    }
}
