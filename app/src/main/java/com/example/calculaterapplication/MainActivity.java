package com.example.calculaterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNum, secondNum;
    TextView answer;
    Button addition, subtraction, multiplication, division, modulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = (EditText)findViewById(R.id.firstValue);
        secondNum = (EditText)findViewById(R.id.secondValue);
        answer = (TextView)findViewById(R.id.textView);
        addition = (Button) findViewById(R.id.add);
        subtraction = (Button) findViewById(R.id.sub);
        multiplication = (Button) findViewById(R.id.mul);
        division = (Button) findViewById(R.id.div);
        modulus = (Button) findViewById(R.id.mod);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, sumIs;
                first = Integer.parseInt(firstNum.getText().toString());
                second = Integer.parseInt(secondNum.getText().toString());
                sumIs = first + second;
                answer.setText("answer is: "+ sumIs);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, sumIs;
                first = Integer.parseInt(firstNum.getText().toString());
                second = Integer.parseInt(secondNum.getText().toString());
                sumIs = first - second;
                answer.setText("answer is: "+ sumIs);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, sumIs;
                first = Integer.parseInt(firstNum.getText().toString());
                second = Integer.parseInt(secondNum.getText().toString());
                sumIs = first * second;
                answer.setText("answer is: "+ sumIs);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, sumIs;
                first = Integer.parseInt(firstNum.getText().toString());
                second = Integer.parseInt(secondNum.getText().toString());
                sumIs = first / second;
                answer.setText("answer is: "+ sumIs);
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, sumIs;
                first = Integer.parseInt(firstNum.getText().toString());
                second = Integer.parseInt(secondNum.getText().toString());
                sumIs = first % second;
                answer.setText("answer is: "+ sumIs);
            }
        });
    }
}