package com.example.pietgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] moviename = {"Antman", "Antman and WASP", "Hulk", "Doctor Strange", "Captain America",
            "Black Widow", "Black Panther", "Avengers",
            "Antman", "Antman and WASP", "Hulk", "Doctor Strange", "Captain America",
            "Black Widow", "Black Panther", "Avengers",
            "Antman", "Antman and WASP", "Hulk", "Doctor Strange", "Captain America",
            "Black Widow", "Black Panther", "Avengers"};

    Integer[] movieimage = {R.drawable.antman,R.drawable.antman2,R.drawable.hulk,R.drawable.doctorstrange,
            R.drawable.captainamerica,R.drawable.blackwidow,R.drawable.blackpanther,R.drawable.avengers,
            R.drawable.antman,R.drawable.antman2,R.drawable.hulk,R.drawable.doctorstrange,
            R.drawable.captainamerica,R.drawable.blackwidow,R.drawable.blackpanther,R.drawable.avengers,
            R.drawable.antman,R.drawable.antman2,R.drawable.hulk,R.drawable.doctorstrange,
            R.drawable.captainamerica,R.drawable.blackwidow,R.drawable.blackpanther,R.drawable.avengers};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,moviename,movieimage);
        gridView.setAdapter(myCustomAdapter);

    }
}