package com.example.visha.healthcare;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        EasySplashScreen welcome = new EasySplashScreen(welcome.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000)
                .withLogo(R.drawable.logo)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withHeaderText("Welcome to HealthCare!")
                .withAfterLogoText("Bringing the Future of Health-Care")
                .withFooterText("Copyright @ Vishakh");

        welcome.getHeaderTextView().setTextColor(Color.BLUE);
        welcome.getHeaderTextView().setTextSize(15);
        welcome.getFooterTextView().setTextSize(15);
        welcome.getAfterLogoTextView().setTextSize(20);
        welcome.getFooterTextView().setTextColor(Color.DKGRAY);

        View view = welcome.create();
        setContentView(view);
    }
}
