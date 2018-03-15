package com.example.guest.lstnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.buttonTravel) Button mButtonTravel;
    @BindView(R.id.buttonListen) Button mButtonListen;
    @BindView(R.id.buttonAbout) Button mButtonAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mButtonTravel.setOnClickListener(this);
        mButtonListen.setOnClickListener(this);
        mButtonAbout.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == mButtonTravel) {
            Intent intent = new Intent(MainActivity.this, TravelActivity.class);
        } else if (v == mButtonListen ) {
            Intent intent = new Intent(MainActivity.this, ListenActivity.class);
        } else if (v == mButtonAbout ) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        } else {

        }

    }
}
