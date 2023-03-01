package com.example.pietsimplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] languages = {"JAVA","C","C++","Swift","Python","Ruby",
            "JAVA","C","C++","Swift","Python","Ruby",
            "JAVA","C","C++","Swift","Python","Ruby",
            "JAVA","C","C++","Swift","Python","Ruby"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,languages);
        listView.setAdapter(arrayAdapter);
    }
}