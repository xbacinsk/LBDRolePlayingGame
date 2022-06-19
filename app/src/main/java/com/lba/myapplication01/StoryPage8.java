package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StoryPage8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page8);
    }

    public void goToNextPage(View view) {
        Intent intent = new Intent(this, StoryPage9.class);
        startActivity(intent);
    }
}