package com.example.taxcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonListner();
    }

    private void buttonListner() {
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText p = (EditText) findViewById(R.id.editText);

                TextView res = (TextView) findViewById(R.id.textView);

                final Double ta = Double.parseDouble(p.getText().toString());

                if (ta < 500000) {
                    res.setText("You have 0 income tax");

                } else if (ta >= 500000 && ta < 1000000) {
                    float ans = (float) ((10 * ta) / 100);
                    res.setText("Your income tax is " + ans);
                } else if (ta >= 1000000 && ta < 1500000) {
                    float ans = (float) ((15 * ta) / 100);
                    res.setText("Your income tax is " + ans);
                } else {
                    float ans = (float) ((18 * ta) / 100);
                    res.setText("Your income tax is " + ans);
                }
            }
        });
    }
}
