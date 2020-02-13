package com.example.brytonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    Button btnReset;

    TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        btnClick = (Button)findViewById(R.id.buttonClick);
        btnReset = (Button)findViewById(R.id.buttonReset);

        txtCount = (TextView)findViewById(R.id.textViewCount);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String CountValue = txtCount.getText().toString();

             int intCountValue = Integer.parseInt(CountValue);
             intCountValue ++;

             txtCount.setText(String.valueOf(intCountValue));

            }

        }
        );

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCount.setText(String.valueOf(0));
            }
        });

    }
}
