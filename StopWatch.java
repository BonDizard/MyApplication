package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mStartButton;
    private Button mPauseButton;
    private  Button mRestButton;
    private Chronometer mChronometer;
    private Button plus;


    private long lastPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton = (Button) findViewById(R.id.start);
        mPauseButton = (Button) findViewById(R.id.Pause);
        mRestButton = (Button) findViewById(R.id.Reset);
        mChronometer = (Chronometer) findViewById(R.id.chronmeter);
        plus = (Button) findViewById(R.id.mplay);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastPause!=0){
                    if(lastPause>=10){
                        MediaPlayer mp = MediaPlayer.create(view.getContext(), R.raw.dath);
                        mp.start();
                    }
                    System.out.println(lastPause+"!=0");
                    mChronometer.setBase(mChronometer.getBase()+SystemClock.elapsedRealtime()-lastPause);
                }
                else{
                    mChronometer.setBase(SystemClock.elapsedRealtime());
                    System.out.println(lastPause+"=0");
                }
                mChronometer.start();
                mPauseButton.setEnabled(true);
                mStartButton.setEnabled(false);
            }
        });

        mPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastPause = SystemClock.elapsedRealtime();
                System.out.println(lastPause+"pauseButton");
                mChronometer.stop();
                mPauseButton.setEnabled(false);
                mStartButton.setEnabled((true));
            }
        });

        mRestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastPause =0;
                mChronometer.stop();        //0
                mChronometer.setBase(SystemClock.elapsedRealtime());
                mStartButton.setEnabled(true);
                mPauseButton.setEnabled(false);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
               Toast.makeText(MainActivity.this, "worked", Toast.LENGTH_SHORT).show();

//                SoundPool soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
//                int soundId = soundPool.load(v.getContext() , R.raw.deathnote, 1);
//                soundId for reuse later on

//                soundPool.play(soundId, 1, 1, 0, 0, 1);
            }
        });
    }
}

