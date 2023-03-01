package com.example.pietcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

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

        listView = findViewById(R.id.listview);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,moviename,movieimage);
        listView.setAdapter(myCustomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,DetailedActivity.class);

                intent.putExtra("mimage",movieimage[i]);
                intent.putExtra("mname",moviename[i]);

                startActivity(intent);

            }
        });

    }
}