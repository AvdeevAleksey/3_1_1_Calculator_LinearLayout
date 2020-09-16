package ru.avdeev.android.a3_1_1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    private Button buttonZero;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFore;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        textViewResult = findViewById(R.id.result);
        buttonZero = findViewById(R.id.btnZero);
        buttonOne = findViewById(R.id.btnOne);
        buttonTwo = findViewById(R.id.btnTwo);
        buttonThree = findViewById(R.id.btnThree);
        buttonFore = findViewById(R.id.btnFore);
        buttonFive = findViewById(R.id.btnFive);
        buttonSix = findViewById(R.id.btnSix);
        buttonSeven = findViewById(R.id.btnSeven);
        buttonEight = findViewById(R.id.btnEight);
        buttonNine = findViewById(R.id.btnNine);
        buttonPoint = findViewById(R.id.btnPoint);
    }
}