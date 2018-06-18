package com.example.crossbylite.fourtyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonregister1a;
    private Button buttonsearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setContentView(R.layout.start_windowlay1);

        buttonregister1a = (Button) findViewById(R.id.buttonregister1);

        buttonregister1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivityregister();
            }
        });
    }

    public void openactivityregister(){
        Intent intentregister = new Intent(this, RegisterActivity.class);
        startActivity(intentregister);



    }
}

