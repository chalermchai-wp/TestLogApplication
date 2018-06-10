package com.example.realz.testlogapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num_1;
    private EditText num_2;
    private TextView result;
    private Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_1 = (EditText) findViewById(R.id.num_1);
        num_2 = (EditText) findViewById(R.id.num_2);
        result = (TextView) findViewById(R.id.result);
        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1;
                int val2;
                int sum;

                val1 = Integer.parseInt(num_1.getText().toString());
                val2 = Integer.parseInt(num_2.getText().toString());
                sum = val1 + val2;
                result.setText(sum + "");
            }
        });

    }
}
