package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.twoactivities.extra.TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
    }

    public void launchFirstActivity(View view) {
        Intent addItemIntent = new Intent();

        switch (view.getId()){
            case R.id.item1:
                addItemIntent.putExtra(EXTRA_TEXT, "Milk");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item2:
                addItemIntent.putExtra(EXTRA_TEXT, "Toothpaste");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item3:
                addItemIntent.putExtra(EXTRA_TEXT, "Rice");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item4:
                addItemIntent.putExtra(EXTRA_TEXT, "Tissue");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item5:
                addItemIntent.putExtra(EXTRA_TEXT, "Tea");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item6:
                addItemIntent.putExtra(EXTRA_TEXT, "Fruits");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item7:
                addItemIntent.putExtra(EXTRA_TEXT, "Scissors");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item8:
                addItemIntent.putExtra(EXTRA_TEXT, "Cheese");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item9:
                addItemIntent.putExtra(EXTRA_TEXT, "Pens");
                setResult(RESULT_OK, addItemIntent);
                finish();
            case R.id.item10:
                addItemIntent.putExtra(EXTRA_TEXT, "Vegetables");
                setResult(RESULT_OK, addItemIntent);
                finish();
        }
    }
}