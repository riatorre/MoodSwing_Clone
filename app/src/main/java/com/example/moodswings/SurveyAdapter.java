package com.example.moodswings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SurveyAdapter extends ArrayAdapter<Survey> {
    public SurveyAdapter(Context context, ArrayList<Survey> surveys) {
        super(context, 0, surveys);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Survey survey = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_elem_survey,parent,false);
        }

        TextView date = convertView.findViewById(R.id.Date);
        TextView entry = convertView.findViewById(R.id.surveyEntry);
        TextView mood = convertView.findViewById(R.id.Mood);
        TextView activities = convertView.findViewById(R.id.Activities);

        date.setText(survey.getDiaryDate());
        String entryText = "Survey Entry: " + survey.getDiaryEntry();
        entry.setText(entryText);
        String moodText = "Mood: " + survey.getMood();
        mood.setText(moodText);
        String activitiesText = "Activities: " + survey.getActivities();
        activities.setText(activitiesText);

        return convertView;
    }
}
