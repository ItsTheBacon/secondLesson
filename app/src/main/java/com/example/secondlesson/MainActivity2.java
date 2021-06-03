package com.example.secondlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText et_enterText;
    private Button btn_cend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et_enterText = findViewById(R.id.et_enter_text);
        btn_cend = findViewById(R.id.btn_send_firstActivity);
        btn_cend.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            Toast.makeText(MainActivity2.this, et_enterText.getText().toString(), Toast.LENGTH_SHORT).show();
            intent.putExtra("text", et_enterText.getText().toString());
            startActivity(intent);

        });
    }
}