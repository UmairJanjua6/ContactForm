package com.example.assignone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityShowContact extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_contact);

        TextView show_Name = (TextView) findViewById(R.id.showName);
        TextView show_Nbr = (TextView) findViewById(R.id.showNumber);
        TextView show_Email = (TextView) findViewById(R.id.showEmail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String number = intent.getStringExtra("number");
        String email = intent.getStringExtra("email");

        show_Name.setText(name);
        show_Nbr.setText(number);
        show_Email.setText(email);




    }
}