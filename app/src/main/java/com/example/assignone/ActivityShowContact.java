package com.example.assignone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityShowContact extends AppCompatActivity {
    TextView show_Name;
    TextView show_Nbr;
    TextView show_Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_contact);

        show_Name = (TextView) findViewById(R.id.showName);
        show_Nbr = (TextView) findViewById(R.id.showNumber);
        show_Email = (TextView) findViewById(R.id.showEmail);
        Intent intent = getIntent();
        String name = intent.getStringExtra("user_name");
        String number = intent.getStringExtra("user_number");
        String email = intent.getStringExtra("user_Email");
        show_Name.setText(name);
        show_Nbr.setText(number);
        show_Email.setText(email);




    }
}