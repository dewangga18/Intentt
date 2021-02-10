package com.dycode.edu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA_DATA";

    private EditText editText;
    private Button btnSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        btnSendData = (Button) findViewById(R.id.button);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                Intent i = new Intent(MainActivity.this, TargetActivity.class);
                i.putExtra(EXTRA_DATA, data);
                startActivity(i);
            }
        });
    }
}