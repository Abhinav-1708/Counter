package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button btn, resetBtn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        resetBtn = findViewById(R.id.resetBtn);
        counter_text = findViewById(R.id.counter_text);
        welcome_text = findViewById(R.id.welcome_text);

        // Adding the functionalities for the click button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_text.setText(String.valueOf(increaseCounter()));
            }
        });

        // Adding the functionalities for the reset button
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCounter();
            }
        });
    }

    public int increaseCounter() {
        return ++counter;
    }

    public void resetCounter() {
        counter = 0;
        counter_text.setText("0");
    }
}
