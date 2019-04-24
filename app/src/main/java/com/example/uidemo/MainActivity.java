package com.example.uidemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_checkbox;
    private Button btn_radiobutton;
    private Button btn_togglebutton;
    private Button btn_seekBar;
    private Button btn_progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_checkbox=findViewById(R.id.btn_checkbox);
        btn_radiobutton=findViewById(R.id.btn_radiobutton);
        btn_togglebutton=findViewById(R.id.btn_tb);
        btn_seekBar= findViewById(R.id.btn_sb);
        btn_progressbar=findViewById(R.id.btn_progressbar);
       btn_radiobutton.setOnClickListener(this);
       btn_checkbox.setOnClickListener(this);
       btn_togglebutton.setOnClickListener(this);
       btn_seekBar.setOnClickListener(this);
       btn_progressbar.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.btn_checkbox:
            Intent intent1 =new Intent(MainActivity.this,CheckBoxActivity.class);
            startActivity(intent1);
            break;
            case R.id.btn_radiobutton:
                Intent intent2 =new Intent(MainActivity.this,RadioButtonActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_tb:
                Intent intent3 =new Intent(MainActivity.this, ToggleButtonActivity.class);
                startActivity(intent3);
            case R.id.btn_sb:
                Intent intent4=new Intent(MainActivity.this,SeekBarActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_progressbar:
                Intent intent5=new Intent(MainActivity.this, ProgressBar.class);
                startActivity(intent5);

            default:
                break;

        }
    }
}
