package com.example.scratchpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputField = findViewById(R.id.inputField);
        Button button = findViewById(R.id.btn1);
        TextView resultField = findViewById(R.id.resultField);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float input = Float.parseFloat(inputField.getText().toString());
                Float result = (float) (input * 2.205);
                resultField.setText("Result: " + result + " pounds");

            }
        });
    }


}