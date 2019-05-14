package com.example.moodswings;

import java.util.Calendar;
import java.util.Date;

public class Survey {
    private Integer moodEnum;
    private String diaryEntry;
    private byte[] activities;
    private Date diaryDate;

    // Constructors
    public Survey(){
        this.diaryDate = Calendar.getInstance().getTime();
    }
    public Survey(Integer moodEnum, String diaryEntry, byte[] activities){
        this.moodEnum = moodEnum;
        this.diaryEntry = diaryEntry;
        this.activities = activities;
        this.diaryDate = Calendar.getInstance().getTime();
    }

    // Access Functions
    public Integer getMood(){
        return moodEnum;
    }
    public String getDiaryEntry(){
        return diaryEntry;
    }
    public byte[] getActivities(){
        return activities;
    }
    public Date getDiaryDate(){
        return diaryDate;
    }

    // Modify Functions
    public void setMood(Integer newMood){
        moodEnum = newMood;
        this.updateDiaryDate();
    }
    public void setDiaryEntry(String newEntry){
        diaryEntry = newEntry;
        this.updateDiaryDate();
    }
    public void setActivities(byte[] newActivities){
        activities = newActivities;
        this.updateDiaryDate();
    }
    private void updateDiaryDate(){
        diaryDate = Calendar.getInstance().getTime();
    }
    public void updateSurvey(Integer newMood, String newEntry, byte[] newActivities){
        moodEnum = newMood;
        diaryEntry = newEntry;
        activities = newActivities;
        this.updateDiaryDate();
    }
}
