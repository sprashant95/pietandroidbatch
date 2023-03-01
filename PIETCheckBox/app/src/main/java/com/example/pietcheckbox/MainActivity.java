package com.example.pietcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox android,swift,python;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        android = findViewById(R.id.android);
        swift = findViewById(R.id.swift);
        python = findViewById(R.id.python);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Your programming langauge is :";

                if (android.isChecked()){
                    result += "Android";
                }
                if (swift.isChecked()){
                    result += "\nSwift";
                }
                if (python.isChecked()){
                    result += "\nPython";
                }
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}