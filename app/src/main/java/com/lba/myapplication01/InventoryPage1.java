package com.lba.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class InventoryPage1 extends AppCompatActivity {

    final String itemCodeHandle = "abc123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory_page1);
    }

    public void addItemToInventory(View view) {
        final EditText addItemTextField = (EditText) findViewById(R.id.addItemTextField);
        if(addItemTextField.getText().toString().equals(itemCodeHandle)) {
            final ImageView handleView = (ImageView) findViewById(R.id.handle);
            handleView.setVisibility(view.VISIBLE);
        }
    }

    public void useHandle(View view) {
        Intent intent = new Intent(this, StoryPage7.class);
        startActivity(intent);
    }
}