package com.example.animationchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonZoomIn, buttonZoomOut, buttonFadeIn, buttonFadeOut, buttonBlink;
    private Animation animZoomIn, animZoomOut, animFadeIn,animfadeOut, animBlink;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        buttonZoomIn = findViewById(R.id.button_zoom_in);
        buttonZoomOut = findViewById(R.id.button_zoom_out);
        buttonFadeIn = findViewById(R.id.button_fade_in);
        buttonFadeOut = findViewById(R.id.button_fade_out);
        buttonBlink =findViewById(R.id.blink);


        buttonZoomIn.setOnClickListener(this);
        buttonZoomOut.setOnClickListener(this);
        buttonFadeIn.setOnClickListener(this);
        buttonFadeOut.setOnClickListener(this);
        buttonBlink.setOnClickListener(this);

        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animfadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_zoom_in:
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(animZoomIn);
                break;

            case R.id.button_zoom_out:
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(animZoomOut);
                break;


            case R.id.button_fade_in:
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(animFadeIn);
                break;

            case R.id.button_fade_out:
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(animfadeOut);
                break;

            case R.id.blink:
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(animBlink);
                break;
        }

    }
}
