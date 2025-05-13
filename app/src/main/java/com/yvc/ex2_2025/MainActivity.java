package com.yvc.ex2_2025;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    Button BWbrowse;
    Button BWmylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button BWbrowse = findViewById(R.id.BWbrowse);
        Button BWmylist = findViewById(R.id.BWmylist);

        BWbrowse.setOnClickListener(v -> {
            Intent intent = new Intent(this, BrowseBooksActivity.class);
            startActivity(intent);
        });
        BWmylist.setOnClickListener(v -> {
            Intent intent = new Intent(this, MyList_Activity.class);
            startActivity(intent);
        });

        };
    }
