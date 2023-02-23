package com.example.pietradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioButton yes,no,notsure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        notsure = findViewById(R.id.notsure);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (yes.isChecked()){
                    Toast.makeText(MainActivity.this, "You Selected YES", Toast.LENGTH_SHORT).show();
                }
                else if (no.isChecked()){
                    Toast.makeText(MainActivity.this, "You Selected NO", Toast.LENGTH_SHORT).show();
                }
                else if (notsure.isChecked()){
                    Toast.makeText(MainActivity.this, "You Selected NOT SURE", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Please select anyone of the above", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}