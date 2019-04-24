package com.example.uidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        toggleButton=findViewById(R.id.tb);
        imageView=findViewById(R.id.imageview);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked())
                {
                    Toast.makeText(ToggleButtonActivity.this, toggleButton.getText().toString(), Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.cat);
                }else{
                    Toast.makeText(ToggleButtonActivity.this, toggleButton.getText().toString(), Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.cat2);
                }
            }
        });

    }
}
