package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StoryPage6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page6);
    }

    public void goToInventory(View view) {
        Intent intent = new Intent(this, InventoryPage1.class);
        startActivity(intent);
    }
}