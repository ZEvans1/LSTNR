package com.example.guest.lstnr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TravelActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.buttonMinutes) Button mButtonMinutes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ButterKnife.bind(this);
        mButtonMinutes.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v == mButtonMinutes) {

        }
    }
}
