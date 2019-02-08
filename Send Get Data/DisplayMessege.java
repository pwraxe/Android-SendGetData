package com.example.akshay.sendgetdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessege extends AppCompatActivity
{
    TextView fname_text,lname_text,email_text,city_text;
    String First_Name,Last_Name,Email_ID,City;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_messege);

        fname_text = findViewById(R.id.display_fname_id);
        lname_text = findViewById(R.id.display_lname_id);
        email_text = findViewById(R.id.display_email_id);
        city_text = findViewById(R.id.display_city_id);

        Intent i = getIntent();
        First_Name = i.getStringExtra("FIRST_EXTRA");
        Last_Name = i.getStringExtra("LAST_EXTRA");
        Email_ID = i.getStringExtra("EMAIL_EXTRA");
        City = i.getStringExtra("CITY_EXTRA");


        fname_text.setText(First_Name);
        lname_text.setText(Last_Name);
        email_text.setText(Email_ID);
        city_text.setText(City);

        cancel = findViewById(R.id.display_cancel_id);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                finish();
            }
        });


    }
}
