package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StoryPage9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page9);
    }

    public void goToNextPage(View view) {
        Intent intent = new Intent(this, StoryPage10.class);
        startActivity(intent);
    }
}