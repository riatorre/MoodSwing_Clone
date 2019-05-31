package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TomorrowMoodPart1 extends AppCompatActivity {

    private Survey survey = new Survey();

    boolean pressed_workID = false;
    boolean pressed_gymID = false;
    boolean pressed_schoolID = false;
    boolean pressed_dateID = false;
    boolean pressed_FriendTimeID = false;
    boolean pressed_GoodFoodID = false;
    boolean pressed_hiking = false;
    boolean pressed_exerciseID = false;
    boolean pressed_badSleepID = false;
    boolean pressed_BadFoodID = false;
    boolean pressed_ReadingID = false;
    boolean pressed_GoodSleepID = false;


    private String TAG = "TomorrowMoodPart1";
    private DBAdapter db = new DBAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomorrow_mood_part1);

        survey.setActivities(2);
        survey.updateDiaryDate(survey.getTomorrowsDate());
        Log.d(TAG, survey.toString());

        final Button workID = findViewById(R.id.workID_Tomorrow_1);
        final Button gymID = findViewById(R.id.gymID_Tomorrow_1);
        final Button schoolID = findViewById(R.id.schoolID_Tomorrow_1);
        final Button dateID = findViewById(R.id.dateID_Tomorrow_1);
        final Button FriendTimeID = findViewById(R.id.FriendTimeID_Tomorrow_1);
        final Button GoodFoodID = findViewById(R.id.GoodFoodID_Tomorrow_1);
        final Button hiking = findViewById(R.id.hiking_Tomorrow_1);
        final Button exerciseID = findViewById(R.id.exerciseID_Tomorrow_1);
        final Button badSleepID = findViewById(R.id.badSleepID_Tomorrow_1);
        final Button BadFoodID = findViewById(R.id.BadFoodID_Tomorrow_1);
        final Button ReadingID = findViewById(R.id.ReadingID_Tomorrow_1);
        final Button GoodSleepID = findViewById(R.id.GoodSleepID_Tomorrow_1);

        workID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_workID = true;
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });

        gymID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gymID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_gymID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        schoolID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                schoolID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_schoolID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        dateID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_dateID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID =false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        FriendTimeID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FriendTimeID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_FriendTimeID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        GoodFoodID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoodFoodID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_GoodFoodID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        hiking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hiking.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_hiking = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID =false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });

        exerciseID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exerciseID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_exerciseID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        badSleepID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badSleepID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_badSleepID =true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        BadFoodID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BadFoodID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_BadFoodID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });
        ReadingID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReadingID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_ReadingID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_GoodSleepID){
                    GoodSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodSleepID = false;
                }
            }
        });

        GoodSleepID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoodSleepID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_GoodSleepID = true;
                if(pressed_workID){
                    workID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_workID = false;
                }
                if(pressed_gymID){
                    gymID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_gymID = false;
                }
                if(pressed_schoolID){
                    schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_schoolID = false;
                }
                if(pressed_dateID){
                    dateID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_dateID = false;
                }
                if(pressed_FriendTimeID){
                    FriendTimeID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_FriendTimeID = false;
                }
                if(pressed_GoodFoodID){
                    GoodFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_GoodFoodID = false;
                }
                if(pressed_hiking){
                    hiking.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hiking = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_badSleepID){
                    badSleepID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_badSleepID = false;
                }
                if(pressed_BadFoodID){
                    BadFoodID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_BadFoodID = false;
                }
                if(pressed_ReadingID){
                    ReadingID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_ReadingID = false;
                }
            }
        });
    }

    public void onClickDone_Tomorrow_1(View view) {
        Intent goToSurveypart1_Tomorrow_1 = new Intent(getApplicationContext(), MainActivity.class);
        goToSurveypart1_Tomorrow_1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToSurveypart1_Tomorrow_1);
    }
}
