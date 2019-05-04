package com.example.teamfinesse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnHelpee;
    Button btnHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHelpee = (Button) findViewById(R.id.btnHelpee);
        btnHelpee.setOnClickListener(this);
        btnHelper = (Button) findViewById(R.id.btnHelper);
        btnHelpee.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnHelpee:
                startActivity(new Intent(MainActivity.this, HelpeeScreen.class));
                break;

            case R.id.btnHelper:
                //code
                break;
        }
    }
}
