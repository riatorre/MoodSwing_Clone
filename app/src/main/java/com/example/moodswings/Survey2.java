package com.example.moodswings;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Calendar;
import java.util.Locale;

public class Survey2 implements Parcelable {
    private Integer activities = 0;

    public Survey2(Integer activities){
        this.activities = activities;
    }

    public Survey2(Parcel in){
        this.activities = in.readInt();
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(activities);
    }

    public static final Parcelable.Creator<Survey2> CREATOR = new Parcelable.Creator<Survey2>() {

        public Survey2 createFromParcel(Parcel in) {
            return new Survey2(in);
        }

        public Survey2[] newArray(int size) {
            return new Survey2[size];
        }
    };

    // Access Functions
    public Integer getActivities(){
        return activities;
    }

    public void setActivities(Integer newActivities){
        activities = newActivities;
    }

    public void updateSurvey(Integer newActivities){
        activities = newActivities;
    }

    public String toString(){
        return "Activities: " + activities;
    }

}
