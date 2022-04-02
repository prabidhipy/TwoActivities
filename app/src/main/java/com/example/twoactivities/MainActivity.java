package com.example.twoactivities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewOnReceiveContentListener;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.ServiceConfigurationError;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST = 1;
    public static final String EXTRA_ADD = "com.example.twoactivities.extra.ADD";
    ArrayList <String> itemList = new ArrayList<>(10);
    TextView[] addedItems = new TextView[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addedItems[0] = findViewById(R.id.textView);
        addedItems[1] = findViewById(R.id.textView2);
        addedItems[2] = findViewById(R.id.textView3);
        addedItems[3] = findViewById(R.id.textView4);
        addedItems[4] = findViewById(R.id.textView5);
        addedItems[5] = findViewById(R.id.textView6);
        addedItems[6] = findViewById(R.id.textView7);
        addedItems[7] = findViewById(R.id.textView8);
        addedItems[8] = findViewById(R.id.textView9);
        addedItems[9] = findViewById(R.id.textView10);

        if(savedInstanceState != null){
            itemList = savedInstanceState.getStringArrayList("itemsList");
            if(itemList != null && itemList.size()>0){
                for(int j=0; j<itemList.size(); j++){
                    addedItems[j].setVisibility(View.VISIBLE);
                    addedItems[j].setText(itemList.get(j));
                }
            }
        }
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQUEST);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if(itemList.size() != 0){
            outState.putStringArrayList("itemsList", itemList);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST){
            if(resultCode == RESULT_OK){
                String item = data.getStringExtra(SecondActivity.EXTRA_TEXT);
                itemList.add(item);

                for(int i = 0; i < itemList.size(); i++){
                   addedItems[i].setVisibility(View.VISIBLE);
                   addedItems[i].setText(itemList.get(i));
                }
            }
        }
    }
}