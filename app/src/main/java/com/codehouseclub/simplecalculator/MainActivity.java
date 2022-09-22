package com.codehouseclub.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    //sum
    public void sum(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result);
        }

    }

    //deduct
    public void deduct(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }

    }

    //multiply
    public void multiply(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            if (number1Text.getText().toString().matches("0") || number2Text.getText().toString().matches("0")) {
                resultText.setText("Multiplying a number by 0 will still make it 0.");
            } else {
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number2 = Integer.parseInt(number2Text.getText().toString());

                int result = number1 * number2;

                resultText.setText("Result: " + result);
            }
        }

    }

    //divide
    public void divide(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            if (number1Text.getText().toString().matches("0") || number2Text.getText().toString().matches("0")) {
                resultText.setText("0 cannot be used in division!");
            } else {
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number2 = Integer.parseInt(number2Text.getText().toString());

                int result = number1 / number2;

                resultText.setText("Result: " + result);
            }
        }

    }

}