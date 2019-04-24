package com.example.uidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class SeekBarActivity extends AppCompatActivity {

    private SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        seekBar=findViewById(R.id.seekbar);
        seekBar.setMax(100);
        seekBar.setProgress(30);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("progress",seekBar.getProgress()+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            Log.i("progress",seekBar.getProgress()+"");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("progress",seekBar.getProgress()+"");
            }
        });
    }
}
