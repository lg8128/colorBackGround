package com.example.stbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    ToggleButton tb;
    Button btn;
    ConstraintLayout lt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tb);
        btn = findViewById(R.id.btn);
        lt1 = findViewById(R.id.lt1);
    }
        public void click (View view){
            if (sw.isChecked() && tb.isChecked()) {
                lt1.setBackgroundColor(Color.BLUE);
            } else if (!sw.isChecked() && tb.isChecked()) {
                lt1.setBackgroundColor(Color.BLACK);
            } else if (!sw.isChecked() && !tb.isChecked()) {
                lt1.setBackgroundColor(Color.GREEN);
            }else if (sw.isChecked() && !tb.isChecked()) {
                lt1.setBackgroundColor(Color.RED);
            }
            }
        }

