package com.example.guest.lstnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListenActivity extends AppCompatActivity {

    @BindView(R.id.minutes) TextView mMinutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        ArrayList<Integer> timesArray = intent.getIntegerArrayListExtra("timesArray");

        Integer sum = 0;
        for (int i = 0; i < timesArray.size(); i++){
            sum = sum + timesArray.get(i);
        }
        double average = (sum/timesArray.size());
        String averageString = Double.toString(average);
        mMinutes.setText("Your average travel time: " + averageString + " min");

    }

}




