package com.example.assignone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityContactInfo extends AppCompatActivity {
    private Button saveInfoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        TextView name = (TextView) findViewById(R.id.userName);
        TextView number = (TextView) findViewById(R.id.userNumber);
        TextView email = (TextView) findViewById(R.id.userEmail);
        saveInfoButton = findViewById(R.id.saveInfo);

        saveInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact contact = new Contact(name.getText().toString(),number.getText().toString(),email.getText().toString());
                MainActivity.contactList.add(contact);
                openMainActivity();
            }
        });

    }
    public void openMainActivity()
    {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}