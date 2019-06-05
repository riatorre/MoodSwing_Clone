package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import java.util.Objects;

public class TodayMoodPart2 extends AppCompatActivity {
    /*initialize object survey in order to put activities in survey object*/
    private Survey survey;

    /*initialize Activity Radio Buttons*/
    private RadioButton work_schoolID;
    private RadioButton exerciseID;
    private RadioButton hobbiesID;
    private RadioButton leisureID;
    private RadioButton errandsID;
    private RadioButton socialID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part2);

        /*initialize Activity Radio Buttons to correlating buttons on activity_today_mood_part2*/
        work_schoolID = findViewById(R.id.Work_SchoolID);
        exerciseID = findViewById(R.id.ExericseID);
        hobbiesID = findViewById(R.id.HobbiesID);
        leisureID = findViewById(R.id.LeisureTimeID);
        errandsID = findViewById(R.id.ErrandsID);
        socialID = findViewById(R.id.SocialEventID);

        /*Get Survey Data*/
        survey = Objects.requireNonNull(getIntent().getExtras()).getParcelable("survey");

        /*Create setOnClickListeners for every Radio Button
         * If a certain Radio Button is pressed, go to function handleClick(view)*/
        work_schoolID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        exerciseID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        hobbiesID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        leisureID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        errandsID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
        socialID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick(v);
            }
        });
    }

    /*if "Next" button is clicked:
     * if no activity was pressed, send a message saying please choose a activity
     * else create a new Intent and go to final Survey page*/
    public void onClickSurveypage2(View view) {
        if(survey.getActivities()==0){
            Message.message(this, "Please choose an activity.");
        }else{
            Intent goToSurveypart3 = new Intent(getApplicationContext(),TodayMoodPart3.class);
            goToSurveypart3.putExtra("survey", survey);
            startActivity(goToSurveypart3);
        }
    }

    /*Toggles mood Radio Buttons to a darker color if clicked
     * goes to resetRadioBtns() to untoggle activity buttons*/
    private void handleClick(View view){
        int id = view.getId();
        resetRadioBtns();
        switch(id) {
            case R.id.Work_SchoolID:
                work_schoolID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                survey.setActivities(1);
                break;
            case R.id.ExericseID:
                exerciseID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                survey.setActivities(2);
                break;
            case R.id.HobbiesID:
                hobbiesID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                survey.setActivities(3);
                break;
            case R.id.LeisureTimeID:
                leisureID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                survey.setActivities(4);
                break;
            case R.id.ErrandsID:
                errandsID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                survey.setActivities(5);
                break;
            case R.id.SocialEventID:
                socialID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                survey.setActivities(6);
                break;
            default:
                survey.setActivities(0);
        }
    }

    /*untoggles mood Radio Buttons*/
    private void resetRadioBtns(){
        work_schoolID.setBackgroundResource(R.drawable.rounded_button);
        exerciseID.setBackgroundResource(R.drawable.rounded_button);
        hobbiesID.setBackgroundResource(R.drawable.rounded_button);
        leisureID.setBackgroundResource(R.drawable.rounded_button);
        errandsID.setBackgroundResource(R.drawable.rounded_button);
        socialID.setBackgroundResource(R.drawable.rounded_button);
    }
}
