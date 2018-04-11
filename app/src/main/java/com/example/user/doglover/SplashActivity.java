package com.example.user.doglover;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 10-04-2018.
 */

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

                                      @Override
                                      public void run() {
                                          Intent i= new Intent(SplashActivity.this,MainActivity.class);
                                          startActivity(i);
                                          finish();
                                      }
                                  },SPLASH_TIME
        );
    }
}
