package com.example.medieval_marvels_and_might;

import android.app.AlertDialog;
import android.os.Bundle;
import androidx.core.widget.TextViewCompat;

import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.medieval_marvels_and_might.Game.MedievalGame;

public class MainActivity extends AppCompatActivity {


ImageView mainImageView;

TextView mainTextView;

Button userResponse0Button;

Button userResponse1Button;

Button userResponse2Button;

Button userResponse3Button;

Button userSubmitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setLogo(R.drawable.medieval_marvels_and_might_icon);
//        getSupportActionBar().setDisplayUseLogoEnabled(true);
//        getSupportActionBar().setElevation(0);


        setContentView(R.layout.activity_main);



        int autoSizeMinTextSize = 6;
        int autoSizeMaxTextSize = 30;
        int autoSizeStepGranularity = 1;
        int unit = TypedValue.COMPLEX_UNIT_SP;


        mainImageView = findViewById(R.id.iv_main_image);
        mainTextView = findViewById(R.id.tv_main_user_text);


        userResponse0Button = findViewById(R.id.btn_main_0);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
                userResponse0Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);

        userResponse1Button = findViewById(R.id.btn_main_1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
                userResponse1Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);

        userResponse2Button = findViewById(R.id.btn_main_2);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
                userResponse2Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);

        userResponse3Button = findViewById(R.id.btn_main_3);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
                userResponse3Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);

        userSubmitButton = findViewById(R.id.btn_main_submit);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
                userSubmitButton, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);




        // TODO 4-E: set onClickListener for each answer Button

        userResponse0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        userResponse0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        userResponse0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        userResponse0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });


        // TODO 5-A: set onClickListener for the submit answer Button

        userSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                }

        });

    }

    }
