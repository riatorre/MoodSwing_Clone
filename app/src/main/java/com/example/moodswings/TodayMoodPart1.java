package com.example.moodswings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TodayMoodPart1 extends AppCompatActivity {
    final Survey survey = new Survey();
    boolean pressed_mood1 = false;
    boolean pressed_mood2 = false;
    boolean pressed_mood3 = false;
    boolean pressed_mood4 = false;
    boolean pressed_mood5 = false;
    boolean pressed_mood6 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_mood_part1);
        final DBAdapter db = new DBAdapter(this);


        //button initialization
        final Button mood_1 = findViewById(R.id.todayMoodBtnID1);
        final Button mood_2 = findViewById(R.id.todayMoodBtnID);
        final Button mood_3 = findViewById(R.id.todayMoodBtnID2);
        final Button mood_4 = findViewById(R.id.TodayMoodBtnID);
        final Button mood_5 = findViewById(R.id.todayMoodBtnID4);
        final Button mood_6 = findViewById(R.id.todayMoodBtnID5);


        mood_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    survey.setMood(1);
                if(pressed_mood2 = true){
                    mood_2.setBackgroundResource(R.drawable.circle_misery);
                    pressed_mood2 = false;
                }
                if(pressed_mood3 = true){
                    mood_3.setBackgroundResource(R.drawable.circle_sad);
                    pressed_mood3 = false;
                }
                if(pressed_mood4 = true){
                    mood_4.setBackgroundResource(R.drawable.circle_okay);
                    pressed_mood4 = false;
                }
                if(pressed_mood5 = true){
                    mood_5.setBackgroundResource(R.drawable.circle_good);
                    pressed_mood5 = false;
                }
                if(pressed_mood6 = true){
                    mood_6.setBackgroundResource(R.drawable.circle_happy);
                    pressed_mood6 = false;
                }
                pressed_mood1 = true;
                mood_1.setBackgroundResource(R.drawable.circle_toggle_angry);
            }
        });

        mood_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressed_mood1 = true){
                    mood_1.setBackgroundResource(R.drawable.circle_angry);
                    pressed_mood1 = false;
                }
                if(pressed_mood3 = true){
                    mood_3.setBackgroundResource(R.drawable.circle_sad);
                    pressed_mood3 = false;
                }
                if(pressed_mood4 = true){
                    mood_4.setBackgroundResource(R.drawable.circle_okay);
                    pressed_mood4 = false;
                }
                if(pressed_mood5 = true){
                    mood_5.setBackgroundResource(R.drawable.circle_good);
                    pressed_mood5 = false;
                }
                if(pressed_mood6 = true){
                    mood_6.setBackgroundResource(R.drawable.circle_happy);
                    pressed_mood6 = false;
                }
                pressed_mood2 = true;
                mood_2.setBackgroundResource(R.drawable.circle_toggle_misery);
                survey.setMood(2);
            }
        });

        mood_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(3);
                if(pressed_mood1 = true){
                    mood_1.setBackgroundResource(R.drawable.circle_angry);
                    pressed_mood1 = false;
                }
                if(pressed_mood2 = true){
                    mood_2.setBackgroundResource(R.drawable.circle_misery);
                    pressed_mood2 = false;
                }
                if(pressed_mood4 = true){
                    mood_4.setBackgroundResource(R.drawable.circle_okay);
                    pressed_mood4 = false;
                }
                if(pressed_mood5 = true){
                    mood_5.setBackgroundResource(R.drawable.circle_good);
                    pressed_mood5 = false;
                }
                if(pressed_mood6 = true){
                    mood_6.setBackgroundResource(R.drawable.circle_happy);
                    pressed_mood6 = false;
                }
                pressed_mood3 = true;
                mood_3.setBackgroundResource(R.drawable.circle_toggle_sad);
            }
        });

        mood_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(4);
                if(pressed_mood1 = true){
                    mood_1.setBackgroundResource(R.drawable.circle_angry);
                    pressed_mood1 = false;
                }
                if(pressed_mood2 = true){
                    mood_2.setBackgroundResource(R.drawable.circle_misery);
                    pressed_mood2 = false;
                }
                if(pressed_mood3 = true){
                    mood_3.setBackgroundResource(R.drawable.circle_sad);
                    pressed_mood3 = false;
                }
                if(pressed_mood5 = true){
                    mood_5.setBackgroundResource(R.drawable.circle_good);
                    pressed_mood5 = false;
                }
                if(pressed_mood6 = true){
                    mood_6.setBackgroundResource(R.drawable.circle_happy);
                    pressed_mood6 = false;
                }
                pressed_mood4 = true;
                mood_4.setBackgroundResource(R.drawable.circle_toggle_okay);
            }
        });

        mood_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pressed_mood1 = true){
                    mood_1.setBackgroundResource(R.drawable.circle_angry);
                    pressed_mood1 = false;
                }
                if(pressed_mood2 = true){
                    mood_2.setBackgroundResource(R.drawable.circle_misery);
                    pressed_mood2 = false;
                }
                if(pressed_mood3 = true){
                    mood_3.setBackgroundResource(R.drawable.circle_sad);
                    pressed_mood3 = false;
                }
                if(pressed_mood4 = true){
                    mood_4.setBackgroundResource(R.drawable.circle_okay);
                    pressed_mood4 = false;
                }
                if(pressed_mood6 = true){
                    mood_6.setBackgroundResource(R.drawable.circle_happy);
                    pressed_mood6 = false;
                }
                pressed_mood5 = true;
                mood_5.setBackgroundResource(R.drawable.circle_toggle_happy);
                survey.setMood(5);
            }
        });


        mood_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                survey.setMood(6);
                if(pressed_mood1 = true){
                    mood_1.setBackgroundResource(R.drawable.circle_angry);
                    pressed_mood1 = false;
                }
                if(pressed_mood2 = true){
                    mood_2.setBackgroundResource(R.drawable.circle_misery);
                    pressed_mood2 = false;
                }
                if(pressed_mood3 = true){
                    mood_3.setBackgroundResource(R.drawable.circle_sad);
                    pressed_mood3 = false;
                }
                if(pressed_mood4 = true){
                    mood_4.setBackgroundResource(R.drawable.circle_okay);
                    pressed_mood4 = false;
                }
                if(pressed_mood5 = true){
                    mood_5.setBackgroundResource(R.drawable.circle_good);
                    pressed_mood5 = false;
                }
                pressed_mood6 = true;
                mood_6.setBackgroundResource(R.drawable.circle_toggle_happy2);
            }
        });
    }

    public void onClickSurveypage1(View view) {
        Intent goToSurveypart2 = new Intent(getApplicationContext(), TodayMoodPart2.class);
        goToSurveypart2.putExtra("survey", survey);
        startActivity(goToSurveypart2);
    }

}
