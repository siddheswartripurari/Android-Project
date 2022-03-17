package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1, t2, t3;
    Button b1;
    CheckBox c1, c2, c3, c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.name);
        t2 = findViewById(R.id.place);
        t3 = findViewById(R.id.aadhar);
        b1 = findViewById(R.id.button);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = t1.getText().toString();
                String str1 = t2.getText().toString();
                int a = Integer.parseInt(t3.getText().toString());

                if(c1.isChecked()){
                    if(c2.isChecked()){
                        if(c3.isChecked()){
                            if(c4.isChecked()){
                                Toast.makeText(getApplicationContext(),"COVID-19 Positive",Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(getApplicationContext(),"Please select checkboxes to check",Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }

                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                i.putExtra("Name",str);
                i.putExtra("Place", str1);
                i.putExtra("Number", a);

                startActivity(i);


            }
        });

    }


}