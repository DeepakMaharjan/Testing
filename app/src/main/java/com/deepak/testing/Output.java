package com.deepak.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tvOutput =  findViewById(R.id.tvOutput);

        Bundle bundle = getIntent().getExtras();

        Float message = bundle.getFloat("result");

        tvOutput.setText(Float.toString(message));
    }
}
