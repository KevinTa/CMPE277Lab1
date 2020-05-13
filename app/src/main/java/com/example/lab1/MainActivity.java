package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.Num1);
        num2 = (EditText)findViewById(R.id.Num2);
        add = (Button)findViewById(R.id.addButton);
        subtract = (Button)findViewById(R.id.subtractButton);
        multiply = (Button)findViewById(R.id.multiplyButton);
        divide = (Button)findViewById(R.id.divideButton);
        answer = (TextView)findViewById(R.id.answerDisplay);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float variable1 = Float.parseFloat(num1.getText().toString());
                float variable2 = Float.parseFloat(num2.getText().toString());
                float sum = variable1 + variable2;
                answer.setText("= " + String.valueOf(sum));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float variable1 = Float.parseFloat(num1.getText().toString());
                float variable2 = Float.parseFloat(num2.getText().toString());
                float difference = variable1 - variable2;
                answer.setText("= " + String.valueOf(difference));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float variable1 = Float.parseFloat(num1.getText().toString());
                float variable2 = Float.parseFloat(num2.getText().toString());
                float product = variable1 * variable2;
                answer.setText("= " + String.valueOf(product));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float variable1 = Float.parseFloat(num1.getText().toString());
                float variable2 = Float.parseFloat(num2.getText().toString());
                float quotient = variable1/variable2;
                answer.setText("= " + String.valueOf(quotient));
            }
        });
    }
}
