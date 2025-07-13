package com.example.iwatts_firstdraft;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button searchDevice = findViewById(R.id.btn_search_device);

        searchDevice.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ScanningDeviceActivity.class);
            startActivity(intent);
        });


    }
}