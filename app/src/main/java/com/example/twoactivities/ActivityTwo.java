package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        mShowCount = findViewById(R.id.count_view);
        Intent intent = getIntent();
        mShowCount.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT));
    }
}