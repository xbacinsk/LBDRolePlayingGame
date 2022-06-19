package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StoryPage3 extends AppCompatActivity {

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
        Intent intent = new Intent(this, StoryPage4.class);
        startActivity(intent);
    }
}