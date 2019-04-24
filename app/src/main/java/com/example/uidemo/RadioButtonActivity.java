package com.example.uidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rg;
    private RadioButton rb_Male,rb_FeMale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        rg=findViewById(R.id.rg_sex);
        rb_Male=findViewById(R.id.rb_Male);
        rb_FeMale=findViewById(R.id.rb_FeMale);
        rg.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId)
        {
            case R.id.rb_Male:
                Toast.makeText(RadioButtonActivity.this,"选择女性",Toast.LENGTH_LONG).show();
                break;
            case R.id.rb_FeMale:
                Toast.makeText(RadioButtonActivity.this,"选择男性",Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}
