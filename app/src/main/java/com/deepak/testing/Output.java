package com.deepak.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tvOutput =  findViewById(R.id.tvOutput);

        Bundle bundle = getIntent().getExtras();

        String message = bundle.getString("result");

        tvOutput.setText(message);
    }
}
