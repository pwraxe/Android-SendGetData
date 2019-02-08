package com.example.akshay.sendgetdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    Button register,cancel;
    EditText Edit_fname,Edit_lname,Edit_email,Edit_city;
    String FirstName,LastName,EmailID,City;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.reg_button);
        cancel = findViewById(R.id.cancel_button);

        Edit_fname = findViewById(R.id.Efname_id);
        Edit_lname = findViewById(R.id.Elname_id);
        Edit_email = findViewById(R.id.Eemail_id);
        Edit_city  = findViewById(R.id.Ecity_id);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                FirstName = Edit_fname.getText().toString();
                LastName = Edit_lname.getText().toString();
                EmailID = Edit_email.getText().toString();
                City = Edit_city.getText().toString();
                sendData();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void sendData()
    {
        Intent i = new Intent(this,DisplayMessege.class);
        i.putExtra("FIRST_EXTRA",FirstName);
        i.putExtra("LAST_EXTRA",LastName);
        i.putExtra("EMAIL_EXTRA",EmailID);
        i.putExtra("CITY_EXTRA",City);

        startActivity(i);
    }
}
