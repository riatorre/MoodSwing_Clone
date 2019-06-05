package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class TomorrowMoodPart1 extends AppCompatActivity {

        final Survey survey = new Survey();

        private DBAdapter db = new DBAdapter(this);
        private RadioButton t_work_schoolID;
        private RadioButton t_exerciseID;
        private RadioButton t_hobbiesID;
        private RadioButton t_leisureID;
        private RadioButton t_errandsID;
        private RadioButton t_socialID;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tomorrow_mood_part1);
            t_work_schoolID = findViewById(R.id.tomorrow_Work_SchoolID);
            t_exerciseID = findViewById(R.id.tomorrow_ExericseID);
            t_hobbiesID = findViewById(R.id.tomorrow_HobbiesID);
            t_leisureID = findViewById(R.id.tomorrow_LeisureTimeID);
            t_errandsID = findViewById(R.id.tomorrow_ErrandsID);
            t_socialID = findViewById(R.id.tomorrow_SocialEventID);

            t_work_schoolID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleClick(v);
                }
            });
            t_exerciseID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleClick(v);
                }
            });
            t_hobbiesID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleClick(v);
                }
            });
            t_leisureID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleClick(v);
                }
            });
            t_errandsID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleClick(v);
                }
            });
            t_socialID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleClick(v);
                }
            });
        }

        public void onClickDone_Tomorrow_1(View view){
            if(survey.getActivities()==0){
                Message.message(this, "Please choose an activity.");
            }else{
                String date = survey.tomorrowsDate();
                survey.updateDiaryDate(date);
                survey.setTomorrowsSurvey(true);
                db.addSurvey(survey);
                Intent goToSurveypart1_Tomorrow_1 = new Intent(getApplicationContext(), MainActivity.class);
                goToSurveypart1_Tomorrow_1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(goToSurveypart1_Tomorrow_1);
            }
        }

        private void handleClick(View view){
            int id = view.getId();
            resetRadioBtns();
            switch(id) {
                case R.id.tomorrow_Work_SchoolID:
                    t_work_schoolID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                    survey.setActivities(1);
                    break;
                case R.id.tomorrow_ExericseID:
                    t_exerciseID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                    survey.setActivities(2);
                    break;
                case R.id.tomorrow_HobbiesID:
                    t_hobbiesID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                    survey.setActivities(3);
                    break;
                case R.id.tomorrow_LeisureTimeID:
                    t_leisureID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                    survey.setActivities(4);
                    break;
                case R.id.tomorrow_ErrandsID:
                    t_errandsID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                    survey.setActivities(5);
                    break;
                case R.id.tomorrow_SocialEventID:
                    t_socialID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                    survey.setActivities(6);
                    break;
                default:
                    survey.setActivities(0);
            }
        }
        private void resetRadioBtns(){
            t_work_schoolID.setBackgroundResource(R.drawable.rounded_button);
            t_exerciseID.setBackgroundResource(R.drawable.rounded_button);
            t_hobbiesID.setBackgroundResource(R.drawable.rounded_button);
            t_leisureID.setBackgroundResource(R.drawable.rounded_button);
            t_errandsID.setBackgroundResource(R.drawable.rounded_button);
            t_socialID.setBackgroundResource(R.drawable.rounded_button);
        }
    }
