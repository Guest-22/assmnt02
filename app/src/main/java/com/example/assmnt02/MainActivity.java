package com.example.assmnt02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declare EditText variables
    private EditText txteNum1, txteNum2,txteResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.eNum2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    /*
    public void add(View v){
            txteNum1 = (EditText)findViewById(R.id.txteNum1);
            txteNum2 = (EditText)findViewById(R.id.txteNum2);
            EditText txteResult = (EditText)findViewById(R.id.txteResult);

            int num1 = Integer.parseInt(txteNum1.getText().toString());
            int num2 = Integer.parseInt(txteNum2.getText().toString());
            int result = num1 + num2;

            txteResult.setText(String.valueOf(result));
    }
     */

    // Onclick methods (MDAS)
    public void add(View v) {
        // Select the TextView by ID
        txteNum1 = findViewById(R.id.txteNum1);
        txteNum2 = findViewById(R.id.txteNum2);
        txteResult = findViewById(R.id.txteResult);

        // Get the value of two EditText
        String input1 = txteNum1.getText().toString();
        String input2 = txteNum2.getText().toString();

        // Check if its empty
        if (input1.isEmpty() || input2.isEmpty()) {
            txteResult.setText("Missing input.");
            return;
        }

        // Convert the string to int & calculate
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int result = num1 + num2;

        // Display result
        txteResult.setText(String.valueOf(result));
    }
    public void subtract(View v) {
        txteNum1 = findViewById(R.id.txteNum1);
        txteNum2 = findViewById(R.id.txteNum2);
        txteResult = findViewById(R.id.txteResult);

        String input1 = txteNum1.getText().toString().trim();
        String input2 = txteNum2.getText().toString().trim();

        if (input1.isEmpty() || input2.isEmpty()) {
            txteResult.setText("Missing input.");
            return;
        }

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int result = num1 - num2;

        txteResult.setText(String.valueOf(result));
    }
    public void multiply(View v) {
        txteNum1 = findViewById(R.id.txteNum1);
        txteNum2 = findViewById(R.id.txteNum2);
        txteResult = findViewById(R.id.txteResult);

        String input1 = txteNum1.getText().toString().trim();
        String input2 = txteNum2.getText().toString().trim();

        if (input1.isEmpty() || input2.isEmpty()) {
            txteResult.setText("Missing input.");
            return;
        }

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int result = num1 * num2;

        txteResult.setText(String.valueOf(result));
    }
    public void divide(View v) {
        txteNum1 = findViewById(R.id.txteNum1);
        txteNum2 = findViewById(R.id.txteNum2);
        txteResult = findViewById(R.id.txteResult);

        String input1 = txteNum1.getText().toString().trim();
        String input2 = txteNum2.getText().toString().trim();

        if (input1.isEmpty() || input2.isEmpty()) {
            txteResult.setText("Missing input.");
            return;
        }

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        if (num2 == 0){
            txteResult.setText("Cannot divide by zero.");
            return;
        }

        int result = num1 / num2;

        txteResult.setText(String.valueOf(result));
    }
}