package com.example.assignone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button newContact;
    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_view = (TextView) findViewById(R.id.txt_view);

        Intent intent = getIntent();
        String strName = intent.getStringExtra("user_name");
        String strNumber = intent.getStringExtra("user_Number");
        String strEmail = intent.getStringExtra("user_Email");
        text_view.setText(strName);

        newContact = findViewById(R.id.addContactButton);
        newContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityContactInfo();
            }
        });

        text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityShowContact();
                Intent showIntent = new Intent(getApplicationContext(), ActivityShowContact.class);
                showIntent.putExtra("user_name" , strName);
                showIntent.putExtra("user_number", strNumber);
                showIntent.putExtra("user_Email" , strEmail);
                startActivity(showIntent);
            }
        });
    }
    public void openActivityContactInfo() {
        Intent intent = new Intent(this, ActivityContactInfo.class);
        startActivity(intent);
    }
    public void openActivityShowContact() {
        Intent showIntent = new Intent(this, ActivityShowContact.class);
        startActivity(showIntent);
    }
}