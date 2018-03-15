package com.example.guest.lstnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TravelActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.buttonMinutes) Button mButtonMinutes;
    @BindView(R.id.minutesInput) EditText mMinutesInput;
    @BindView(R.id.recordedTimes) TextView mRecordedTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ButterKnife.bind(this);
        mButtonMinutes.setOnClickListener(this);
//        Intent intent = getIntent();

    }

    public void onClick(View v) {
        if (v == mButtonMinutes) {
            String inputtedMinutes = mMinutesInput.getText().toString();
            int minutes = Integer.parseInt(inputtedMinutes);
            mRecordedTimes.setText("Your travel time(s): " + minutes);
        } else {

        }
    }
}
