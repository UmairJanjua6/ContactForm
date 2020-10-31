package com.example.assignone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityContactInfo extends AppCompatActivity {
    private Button saveInfoButton;
    EditText user_Name;
    EditText user_Number;
    EditText user_Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        user_Name = findViewById(R.id.userName);
        user_Number = findViewById(R.id.userNumber);
        user_Email = findViewById(R.id.userEmail);
        saveInfoButton = findViewById(R.id.saveInfo);

        saveInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user_Name.getText().toString();
                String number = user_Number.getText().toString();
                String email = user_Email.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("user_name", name);
                intent.putExtra("user_Number" , number);
                intent.putExtra("user_Email" , email);
                startActivity(intent);

//                user_Number = findViewById(R.id.userNumber);
//                String  nbr = user_Number.getText().toString();
//                Intent number = new Intent(getApplicationContext(), ActivityShowContact.class);
//                number.putExtra("user_number", nbr);
//                startActivity(number);
            }
        });

    }
}