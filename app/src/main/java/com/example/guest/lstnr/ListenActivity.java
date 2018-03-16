package com.example.guest.lstnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
        String averageString = intent.getStringExtra("averageString");
        mMinutes.setText("Your average travel time: " + averageString + " min");

    }

}
