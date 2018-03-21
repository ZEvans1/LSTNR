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
    @BindView(R.id.recordedTime) TextView mRecordedTime;
    @BindView(R.id.buttonTravelToListen) Button mButtonTravelToListen;

    private ArrayList<String> times = new ArrayList<String>();
    private ArrayList<Integer> timesInt = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ButterKnife.bind(this);
        mButtonMinutes.setOnClickListener(this);
        mButtonTravelToListen.setOnClickListener(this);

        mButtonTravelToListen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this, ListenActivity.class);
                intent.putIntegerArrayListExtra("timesArray", timesInt);
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
            mRecordedTime.setText("Your travel time: " + minutes);
        }
    }
}
