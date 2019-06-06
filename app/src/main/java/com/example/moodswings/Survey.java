package com.example.moodswings;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Survey implements Parcelable {
    private Integer moodEnum = 0;
    private String diaryEntry = "";
    private Integer activities = 0;
    private String diaryDate = "";
    private String UID = "";
    private Boolean tomorrowsSurvey = false;

    // Constructors
    public Survey(){
        this.updateDiaryDate();
    }
    public Survey(Integer moodEnum, String diaryEntry, Integer activities){
        this.moodEnum = moodEnum;
        this.diaryEntry = diaryEntry;
        this.activities = activities;
        this.updateDiaryDate();
    }

    public Survey(Integer moodEnum, String diaryEntry, Integer activities, String diaryDate){
        this.moodEnum = moodEnum;
        this.diaryEntry = diaryEntry;
        this.activities = activities;
        this.diaryDate = diaryDate;
    }

    public Survey(Parcel in){
        this.moodEnum = in.readInt();
        this.diaryEntry = in.readString();
        this.activities = in.readInt();
        this.diaryDate = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(moodEnum);
        dest.writeString(diaryEntry);
        dest.writeInt(activities);
        dest.writeString(diaryDate);
    }

    public static final Parcelable.Creator<Survey> CREATOR = new Parcelable.Creator<Survey>() {

        public Survey createFromParcel(Parcel in) {
            return new Survey(in);
        }

        public Survey[] newArray(int size) {
            return new Survey[size];
        }
    };

    // Access Functions
    Integer getMood(){
        return moodEnum;
    }
    String getDiaryEntry(){
        return diaryEntry;
    }
    Integer getActivities(){
        return activities;
    }
    String getDiaryDate(){
        return diaryDate;
    }
    boolean getTomorrowsSurvey(){ return tomorrowsSurvey;}
    public String getUID() { return UID; }

    // Modify Functions
    void setMood(Integer newMood){
        moodEnum = newMood;
        this.updateDiaryDate();
    }

    void setDiaryEntry(String newEntry){
        diaryEntry = newEntry;
        this.updateDiaryDate();
    }

    void setActivities(Integer newActivities){
        activities = newActivities;
        this.updateDiaryDate();
    }

    void setUID(String newUID){
        this.UID = newUID;
    }
    void setTomorrowsSurvey(boolean value){
        this.tomorrowsSurvey = value;
    }
    private void updateDiaryDate(){
        diaryDate = this.todaysDate();
    }
    void updateDiaryDate(String date){ diaryDate = date; }

    String todaysDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
                + ", "
                + (calendar.get(Calendar.MONTH)+1)
                + "/"
                + calendar.get(Calendar.DATE)
                + "/"
                + calendar.get(Calendar.YEAR);
    }
    String tomorrowsDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, 1);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
                + ", "
                + (calendar.get(Calendar.MONTH)+1)
                + "/"
                + calendar.get(Calendar.DATE)
                + "/"
                + calendar.get(Calendar.YEAR);
    }
    public Date getTodaysDate(){
        Calendar calendar = Calendar.getInstance();
        if(tomorrowsSurvey) calendar.add(Calendar.DAY_OF_YEAR, 1);
        return calendar.getTime();
    }
    public String toString(){
        return "Date: " + diaryDate
                + ", Mood: " + moodEnum
                + ", Entry: " + diaryEntry
                + ", Activities: " + activities;
    }
}
