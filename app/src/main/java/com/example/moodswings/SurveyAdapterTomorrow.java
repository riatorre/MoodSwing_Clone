package com.example.moodswings;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


//public class SurveyAdapterTomorrow<ArrayAdapterTomorrow> extends ArrayAdapterTomorrow<Survey>  {
//    public SurveyAdapterTomorrow(Context context, ArrayList<Survey2> surveys) {
//        super(context, 0, surveys);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent){
//        Survey survey2 = getItem(position);
//        if(convertView == null){
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_elem_survey,parent,false);
//        }
//
//        TextView activities = convertView.findViewById(R.id.Activities);
//
//        String activitiesText = "Activities: " + survey2.getActivities();
//        activities.setText(activitiesText);
//
//        return convertView;
//    }
//
//
//}
