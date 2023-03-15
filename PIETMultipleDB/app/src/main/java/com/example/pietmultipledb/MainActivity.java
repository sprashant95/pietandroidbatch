package com.example.pietmultipledb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText id, name, education, exp;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.drid);
        name = findViewById(R.id.name);
        education = findViewById(R.id.education);
        exp = findViewById(R.id.years);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pid = id.getText().toString();
                String pname = name.getText().toString();
                String peducation = education.getText().toString();
                String pyears = exp.getText().toString();

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference reference = db.getReference("doctors");
                
                DBHolder dbHolder = new DBHolder(pname,peducation,pyears);
                
                reference.child(pid).setValue(dbHolder);
                
                id.setText("");
                name.setText("");
                education.setText("");
                exp.setText("");

                Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}