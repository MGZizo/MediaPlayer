package com.example.android.mediasong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.example.android.mediasong.R;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer = MediaPlayer.create( this, R.raw.hya );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button playButton = findViewById(R.id.play_button );
        Button pauseButton = findViewById(R.id.pause_button );
        playButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                mediaPlayer.start();
            }
        } );
        pauseButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        } );



    }
}
