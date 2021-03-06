package com.example.guest.lstnr;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.buttonTravel) Button mButtonTravel;
//    @BindView(R.id.buttonListen) Button mButtonListen;
    @BindView(R.id.buttonAbout) Button mButtonAbout;
    @BindView(R.id.textView) TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface sansationFont = Typeface.createFromAsset(getAssets(),"fonts/Sansation-Regular.ttf");
        mTextView.setTypeface(sansationFont);


        mButtonTravel.setOnClickListener(this);
//        mButtonListen.setOnClickListener(this);
        mButtonAbout.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == mButtonTravel) {
            Intent intent = new Intent(MainActivity.this, TravelActivity.class);
            startActivity(intent);
        }
//        else if (v == mButtonListen ) {
//            Intent intent = new Intent(MainActivity.this, ListenActivity.class);
//            startActivity(intent);
//        }
        else if (v == mButtonAbout ) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        } else {

        }

    }
}
