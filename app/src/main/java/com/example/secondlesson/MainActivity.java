package com.example.secondlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnSeconactivity;
    private TextView title_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title_txt = findViewById(R.id.txt_title);
        btnSeconactivity = findViewById(R.id.btn_goSecondActivity);
        btnSeconactivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        });
        if (getIntent().hasExtra("text")) {
            title_txt.setText(getIntent().getStringExtra("text"));

        }


    }

}