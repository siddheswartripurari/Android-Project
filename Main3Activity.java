package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = findViewById(R.id.received_name);
       /*t2 = findViewById(R.id.received_place);
        t3 = findViewById(R.id.received_number);*/

        Intent i = getIntent();

        String str = i.getStringExtra("Name");
        String st1 = i.getStringExtra("Place");
        int a = Integer.parseInt(i.getStringExtra("Number"));

        t1.setText(str);


    }
}