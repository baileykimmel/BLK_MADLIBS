package com.example.blk_madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE1 = "com.example.myfirstapp.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.myfirstapp.MESSAGE3";
    public static final String EXTRA_MESSAGE4 = "com.example.myfirstapp.MESSAGE4";
    public static final String EXTRA_MESSAGE5 = "com.example.myfirstapp.MESSAGE5";
    public static final String EXTRA_MESSAGE6 = "com.example.myfirstapp.MESSAGE6";
    public static final String EXTRA_MESSAGE7 = "com.example.myfirstapp.MESSAGE7";
    public static final String EXTRA_MESSAGE8 = "com.example.myfirstapp.MESSAGE8";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
;
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        /**first*/
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message);

        /**second*/
        editText = (EditText) findViewById(R.id.editTextTextPersonName2);
         message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message);

        /**third*/
         editText = (EditText) findViewById(R.id.editTextTextPersonName3);
         message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message);

        /**fourth*/
         editText = (EditText) findViewById(R.id.editTextTextPersonName4);
         message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE4, message);

        /**fifth*/
        editText = (EditText) findViewById(R.id.editTextTextPersonName5);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE5, message);

        /**six*/
        editText = (EditText) findViewById(R.id.editTextTextPersonName6);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE6, message);

        /**seven*/
        editText = (EditText) findViewById(R.id.editTextTextPersonName7);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE7, message);

        /**eight*/
        editText = (EditText) findViewById(R.id.editTextTextPersonName8);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE8, message);

        if(TextUtils.isEmpty(editText.getText()))
        {
            editText.setError(" Please Enter All Words");
        }
        else {
        startActivity(intent);
    }
}}