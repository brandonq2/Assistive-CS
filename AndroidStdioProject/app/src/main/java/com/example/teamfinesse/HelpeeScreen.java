package com.example.teamfinesse;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelpeeScreen extends AppCompatActivity implements View.OnTouchListener{

    Button recordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpee_main);

        recordButton = (Button) findViewById(R.id.btnRecord);
        recordButton.setOnTouchListener(this);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
                != PackageManager.PERMISSION_GRANTED) {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.RECORD_AUDIO}, 101);

            }
        } else {
            // Permission is granted
            MediaRecorder myAudioRecorder = new MediaRecorder();
            myAudioRecorder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);
            myAudioRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            myAudioRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
//        myAudioRecorder.setOutputFile(outputFile);

        }


    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            // Start recording
            CharSequence text = "Started recording";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            // Stop recording
            CharSequence text = "Stopped recording";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        return true;
    }
}
