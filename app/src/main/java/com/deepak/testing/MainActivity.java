package com.deepak.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    Button btnSum, btnSubtract, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);

        btnSum = findViewById(R.id.btnSum);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first, second, result;

                first = Integer.parseInt(etFirst.getText().toString());
                second = Integer.parseInt(etSecond.getText().toString());

                Arithmetic arithmetic = new Arithmetic();

                result = arithmetic.add(first,second);

                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("result", result);

                startActivity(intent);

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float first, second, result;

                first = Integer.parseInt(etFirst.getText().toString());
                second = Integer.parseInt(etSecond.getText().toString());

                Arithmetic arithmetic = new Arithmetic();

                result = arithmetic.divide(first,second);

                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("result", result);

                startActivity(intent);

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first, second, result;

                first = Integer.parseInt(etFirst.getText().toString());
                second = Integer.parseInt(etSecond.getText().toString());

                Arithmetic arithmetic = new Arithmetic();

                result = arithmetic.subtract(first,second);

                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("result", result);

                startActivity(intent);
            }
        });

    }
}
