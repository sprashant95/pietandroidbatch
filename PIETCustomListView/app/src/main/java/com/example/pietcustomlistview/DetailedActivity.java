package com.example.pietcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    ImageView dimage;
    TextView dname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dimage = findViewById(R.id.dimage);
        dname = findViewById(R.id.dname);

        Intent intent = getIntent();

        String name = intent.getStringExtra("mname");
        Integer image = intent.getIntExtra("mimage",R.drawable.ic_launcher_background);

        dname.setText(name);
        dimage.setImageResource(image);


    }
}