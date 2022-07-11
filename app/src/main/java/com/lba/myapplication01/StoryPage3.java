package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class StoryPage3 extends AppCompatActivity {

    final String cooldownButtonText = "Shw countdown";
    private TutorialIncorrectRing tutorialIncorrectRingFragment = TutorialIncorrectRing.newInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page3);
    }

    public void goToCorrectPage(View view) {
        Intent intent = new Intent(this, StoryPage5.class);
        startActivity(intent);
    }

    public void goToIncorrectPage(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (tutorialIncorrectRingFragment.isAdded()) {
            transaction.show(tutorialIncorrectRingFragment);
        } else {
            transaction.add(R.id.frameLayoutSP3, tutorialIncorrectRingFragment);
        }
        transaction.commit();
    }

    @Override
    public void onBackPressed () {
        //do nothing
    }

    public void cooldown(View view) {
        new CountDownTimer(30000, 1000) {
            final Button myCooldownButton = (Button) findViewById(R.id.cooldownButton);
            public void onTick(long millisUntilFinished) {
                myCooldownButton.setText("Seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                myCooldownButton.setText(cooldownButtonText);
                getSupportFragmentManager().beginTransaction().hide(tutorialIncorrectRingFragment).commit();
            }
        }.start();

    }

    public void startCooldown(View view) {
        cooldown(view);
    }
}