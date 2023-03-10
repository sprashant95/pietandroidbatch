package com.example.piettaptargetview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.floatingActionButton);

        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.floatingActionButton),
                                "Open this Camera","Take your first picture using FAB"
                        )
                        .outerCircleColor(R.color.purple_200)
                        .targetCircleColor(R.color.teal_200)
                        .cancelable(true)
                        .titleTextColor(R.color.white)
                        .descriptionTextSize(20)
                        .titleTextSize(30),

                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivity(intent);
                    }
                }
        );
    }
}