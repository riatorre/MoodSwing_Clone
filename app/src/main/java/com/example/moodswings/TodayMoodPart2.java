package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TodayMoodPart2 extends AppCompatActivity {

    private Survey survey;

    boolean pressed_work_schoolID = false;
    boolean pressed_exerciseID = false;
    boolean pressed_hobbiesID = false;
    boolean pressed_leisureID = false;
    boolean pressed_errandsID = false;
    boolean pressed_socialID = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part2);
        survey = getIntent().getExtras().getParcelable("survey");
        survey.setActivities(2);



        final Button work_schoolID = findViewById(R.id.Work_SchoolID);
        final Button exerciseID = findViewById(R.id.ExericseID);
        final Button hobbiesID = findViewById(R.id.HobbiesID);
        final Button leisureID = findViewById(R.id.LeisureTimeID);
        final Button errandsID = findViewById(R.id.ErrandsID);
        final Button socialID = findViewById(R.id.SocialEventID);


        work_schoolID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                work_schoolID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_work_schoolID = true;
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_hobbiesID){
                    hobbiesID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hobbiesID = false;
                }
                if(pressed_leisureID){
                    leisureID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_leisureID = false;
                }
                if(pressed_errandsID){
                    errandsID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_errandsID = false;
                }
                if(pressed_socialID){
                    socialID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_socialID = false;
                }
            }
        });

        exerciseID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exerciseID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_exerciseID = true;
                if(pressed_work_schoolID){
                    work_schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_work_schoolID = false;
                }
                if(pressed_hobbiesID){
                    hobbiesID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hobbiesID = false;
                }
                if(pressed_leisureID){
                    leisureID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_leisureID = false;
                }
                if(pressed_errandsID){
                    errandsID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_errandsID = false;
                }
                if(pressed_socialID){
                    socialID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_socialID = false;
                }
            }
        });
        hobbiesID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hobbiesID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_hobbiesID = true;
                if(pressed_work_schoolID){
                    work_schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_work_schoolID = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_leisureID){
                    leisureID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_leisureID = false;
                }
                if(pressed_errandsID){
                    errandsID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_errandsID = false;
                }
                if(pressed_socialID){
                    socialID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_socialID = false;
                }
            }
        });
        leisureID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leisureID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_leisureID = true;
                if(pressed_work_schoolID){
                    work_schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_work_schoolID = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_hobbiesID){
                    hobbiesID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hobbiesID = false;
                }
                if(pressed_errandsID){
                    errandsID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_errandsID = false;
                }
                if(pressed_socialID){
                    socialID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_socialID = false;
                }
            }
        });
        errandsID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                errandsID.setBackgroundResource(R.drawable.roundedbuttonpressed);
                pressed_errandsID = true;
                if(pressed_work_schoolID){
                    work_schoolID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_work_schoolID = false;
                }
                if(pressed_exerciseID){
                    exerciseID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_exerciseID = false;
                }
                if(pressed_hobbiesID){
                    hobbiesID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_hobbiesID = false;
                }
                if(pressed_leisureID){
                    leisureID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_leisureID = false;
                }
                if(pressed_socialID){
                    socialID.setBackgroundResource(R.drawable.rounded_button);
                    pressed_socialID = false;
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

    public void onClickNextPart2(View view) {
        Intent goToSurveypart3 = new Intent(getApplicationContext(),TodayMoodPart3.class);
        goToSurveypart3.putExtra("survey", survey);
        startActivity(goToSurveypart3);
    }
}
