package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StoryPage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page4);
    }

    public void goToPreviousPage(View view) {
        Intent intent = new Intent(this, StoryPage3.class);
        startActivity(intent);
    }
}