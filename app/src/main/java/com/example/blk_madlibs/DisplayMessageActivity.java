package com.example.blk_madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.nounone);
        textView.setText(message);

         message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.nounone2);
        textView.setText(message);

        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.nounone3);
        textView.setText(message);

         message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE4);
        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.nounone4);
        textView.setText(message);

         message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE5);
        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.nounone5);
        textView.setText(message);


         message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE6);
        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.nounone6);
        textView.setText(message);


         message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE7);
        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.nounone7);
        textView.setText(message);

         message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE8);
        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.nounone8);
        textView.setText(message);

    }
}