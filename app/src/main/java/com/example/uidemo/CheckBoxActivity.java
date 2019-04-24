package com.example.uidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox gamebtn;
    private CheckBox travelbtn;
    private CheckBox readbtn;
    private Button btn_all,btn_notall,btn_getresult;
    private TextView result;
    private ButtonListener buttonListener;
    private List<String> lists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        init();
    }
    private void init()
    {
        buttonListener=new ButtonListener();
        gamebtn=(CheckBox)findViewById(R.id.game);
        travelbtn=(CheckBox)findViewById(R.id.travel);
        readbtn=(CheckBox)findViewById(R.id.read);
        btn_all=findViewById(R.id.btn_all);
        btn_notall=findViewById(R.id.btn_notall);
        btn_getresult=findViewById(R.id.btn_getResult);
        result=findViewById(R.id.textresult);
        gamebtn.setOnCheckedChangeListener(this);
        travelbtn.setOnCheckedChangeListener(this);
        readbtn.setOnCheckedChangeListener(this);
        btn_getresult.setOnClickListener(buttonListener);
        btn_all.setOnClickListener(buttonListener);
        btn_notall.setOnClickListener(buttonListener);
        lists=new ArrayList<>();



    }

    public void onCheckedChanged(CompoundButton buttonview, boolean isChecked) {
        CheckBox checkBox=(CheckBox)buttonview;
        switch(checkBox.getId())
        {
            case R.id.game:
                Toast.makeText(CheckBoxActivity.this,"游戏"+isChecked,Toast.LENGTH_LONG).show();
                break;
            case R.id.read:
                Toast.makeText(CheckBoxActivity.this,"阅读"+isChecked,Toast.LENGTH_LONG).show();
                break;
            case R.id.travel:
                Toast.makeText(CheckBoxActivity.this,"旅游"+isChecked,Toast.LENGTH_LONG).show();
                break;

        }
    }

    class  ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_all:
                    gamebtn.setChecked(true);
                    travelbtn.setChecked(true);
                    readbtn.setChecked(true);
                    break;
                case R.id.btn_notall:
                    gamebtn.setChecked(false);
                    travelbtn.setChecked(false);
                    readbtn.setChecked(false);
                    break;
                case R.id.btn_getResult:

                    if(gamebtn.isChecked())
                    {
                        lists.add(gamebtn.getText().toString());

                    }
                    if(readbtn.isChecked())
                    {
                        lists.add(readbtn.getText().toString());

                    }
                    if(travelbtn.isChecked())
                    {
                        lists.add(travelbtn.getText().toString());

                    }
                    result.setText(lists.toString());
                    lists.clear();
                    break;
            }
        }
    }
}
