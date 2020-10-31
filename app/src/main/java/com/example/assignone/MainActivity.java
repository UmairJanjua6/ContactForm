package com.example.assignone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button newContact;
    static ArrayList<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<Contact> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,contactList);
        listView.setAdapter(arrayAdapter);

        newContact = findViewById(R.id.addContactButton);
        newContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityContactInfo();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ActivityShowContact.class);
                intent.putExtra("name",contactList.get(position).getName());
                intent.putExtra("email",contactList.get(position).getEmail());
                intent.putExtra("number",contactList.get(position).getNumber());
                startActivity(intent);

            }
        });

    }
    public void openActivityContactInfo() {
        Intent intent = new Intent(this, ActivityContactInfo.class);
        startActivity(intent);
    }
}