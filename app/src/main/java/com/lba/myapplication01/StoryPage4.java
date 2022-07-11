package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.EditText;

public class StoryPage4 extends AppCompatActivity {

    private boolean cooldownFinished = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page4);
    }

    public void goToPreviousPage(View view) {
        cooldown(view);
        if(cooldownFinished) {
            Intent intent = new Intent(this, StoryPage3.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed () {
        //do nothing
    }

    public void cooldown(View view) {
        cooldownFinished = false;
        new CountDownTimer(30000, 1000) {
            final Button cooldownButton = (Button) findViewById(R.id.buttonNextSP4);
            public void onTick(long millisUntilFinished) {
                cooldownButton.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                cooldownButton.setText("done!");
                cooldownFinished = true;
            }
        }.start();

    }

}