package com.example.piettimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timepicker);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                timePicker.is24HourView();

                if (timePicker.getHour()<12){
                    String time = "AM";
                    String result = "Your time is: "+timePicker.getHour()+":" + timePicker.getMinute() + time;
                    Toast.makeText(MainActivity.this,result , Toast.LENGTH_SHORT).show();
                }

                else {
                    String time = "PM";
                    String result = "Your time is: "+timePicker.getHour()+":" + timePicker.getMinute() + time;
                    Toast.makeText(MainActivity.this,result , Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}