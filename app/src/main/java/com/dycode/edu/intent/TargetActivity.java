package com.dycode.edu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = (TextView) findViewById(R.id.textView);
//get data
        if(getIntent().getExtras() != null ){
            String data = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}