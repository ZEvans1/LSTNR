package com.example.guest.lstnr;


import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TravelArrayAdapter extends ArrayAdapter{
    private Context mContext;
    private ArrayList<String> mTimes;
    private ArrayList<Integer> mTimesInt;

    public TravelArrayAdapter(Context mContext, int resource, ArrayList<String> mTimes, ArrayList<Integer> mTimesInt) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mTimes = mTimes;
        this.mTimesInt = mTimesInt;
    }

    @Override
    public Object getItem(int position) {
        String time = mTimes.get(position);
        Integer timeInt = mTimesInt.get(position);
        return String.format("Your time: %s minutes", time);

    }

    @Override
    public int getCount() {
        return mTimes.size();
    }

}
