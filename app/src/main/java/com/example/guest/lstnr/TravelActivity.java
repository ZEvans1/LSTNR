package com.example.guest.lstnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TravelActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.buttonMinutes) Button mButtonMinutes;
    @BindView(R.id.minutesInput) EditText mMinutesInput;
//    @BindView(R.id.recordedTimes) TextView mRecordedTimes;
    @BindView(R.id.buttonTravelToListen) Button mButtonTravelToListen;
    @BindView(R.id.minutesList) ListView mMinutesList;

    private ArrayList<String> times = new ArrayList<String>();
    private ArrayList<Integer> timesInt = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ButterKnife.bind(this);
        mButtonMinutes.setOnClickListener(this);
        mButtonTravelToListen.setOnClickListener(this);
        TravelArrayAdapter adapter = new TravelArrayAdapter(this, android.R.layout.simple_list_item_1, times, timesInt);
        mMinutesList.setAdapter(adapter);

        mButtonTravelToListen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer sum = 0;
                for (int i = 0; i < timesInt.size(); i++){
                    sum = sum + timesInt.get(i);
                }
                double average = (sum/timesInt.size());
                String averageString = Double.toString(average);
                Intent intent = new Intent(TravelActivity.this, ListenActivity.class);
                intent.putExtra("averageString", averageString);
                startActivity(intent);
            }
        });

    }

    public void onClick(View v) {
        if (v == mButtonMinutes) {
            String inputtedMinutes = mMinutesInput.getText().toString();
            times.add(inputtedMinutes);
            int minutes = Integer.parseInt(inputtedMinutes);
            timesInt.add(minutes);
//            mRecordedTimes.setText("Your travel time(s): " + minutes);
        }
    }
}

//                String inputtedMinutes = mMinutesInput.getText().toString();
//                int minutes = Integer.parseInt(inputtedMinutes);
//                Intent intent = new Intent(TravelActivity.this, ListenActivity.class);
//                intent.putExtra("inputtedMinutes", inputtedMinutes);
//                startActivity(intent);