package com.example.me.androidschoolproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText firstInput;
    EditText secondInput;
    TextView resultLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstInput = (EditText) findViewById(R.id.firstInput);
        secondInput = (EditText) findViewById(R.id.secondInput);
        resultLabel = (TextView) findViewById(R.id.resultLabel);
    }

    public void sumBtnClick(View view) {
        //Fires when sum button is clicked
        int firstValue = Integer.parseInt(firstInput.getText().toString());
        int secondValue = Integer.parseInt(secondInput.getText().toString());
        int result = firstValue + secondValue;
        resultLabel.setText(String.valueOf(result));
    }
}
