package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT="com.example.twoactivities.extra.TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivityTwo(View view) {
        Intent intent = new Intent(this, ActivityTwo.class);

        switch(view.getId()){
            case R.id.textOne:
                intent.putExtra(EXTRA_TEXT, getString(R.string.article_one));
                startActivity(intent);
                break;
            case R.id.textTwo:
                intent.putExtra(EXTRA_TEXT, getString(R.string.article_two));
                startActivity(intent);
                break;
            case R.id.textThree:
                intent.putExtra(EXTRA_TEXT, getString(R.string.article_three));
                startActivity(intent);
                break;
        }
    }
}