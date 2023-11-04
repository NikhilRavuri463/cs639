package com.example.nikhilmeters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText metersInput = findViewById(R.id.metersInput);
        Button convertButton = findViewById(R.id.convertButton);
        TextView resultText = findViewById(R.id.resultText);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double meters = Double.parseDouble(metersInput.getText().toString());
                    double millimeters = meters * 1000;
                    resultText.setText(String.format("%.2f meters is %.2f millimeters.", meters, millimeters));
                } catch (NumberFormatException e) {
                    resultText.setText("Please enter a valid number.");
                }
            }
        });
    }
}