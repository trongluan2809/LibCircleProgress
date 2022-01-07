package com.example.libcircleprogress;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.llibrarycp.DonutProgress;

public class MainActivity extends AppCompatActivity {
    private DonutProgress donutProgress;
    private Button btnIncrease;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donutProgress = findViewById(R.id.donut_progress);
        btnIncrease = findViewById(R.id.btn_increase);

        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress <= 100) {
                    progress += 5;
                    donutProgress.setDonut_progress(String.valueOf(progress));
                }
            }
        });
    }
}