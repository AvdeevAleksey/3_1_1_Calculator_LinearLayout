package ru.avdeev.android.a3_1_1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
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
    private View view;

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

    public void anyButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.btnZero: {
                textViewResult.setText(buttonZero.getText().toString());
                break;
            }
            case R.id.btnOne: {
                textViewResult.setText(buttonOne.getText().toString());
                break;
            }
            case R.id.btnTwo: {
                textViewResult.setText(buttonTwo.getText().toString());
                break;
            }

            case R.id.btnThree: {
                textViewResult.setText(buttonThree.getText().toString());
                break;
            }
            case R.id.btnFore: {
                textViewResult.setText(buttonFore.getText().toString());
                break;
            }
            case R.id.btnFive: {
                textViewResult.setText(buttonFive.getText().toString());
                break;
            }
            case R.id.btnSix: {
                textViewResult.setText(buttonSix.getText().toString());
                break;
            }
            case R.id.btnSeven: {
                textViewResult.setText(buttonSeven.getText().toString());
                break;
            }
            case R.id.btnEight: {
                textViewResult.setText(buttonEight.getText().toString());
                break;
            }
            case R.id.btnNine: {
                textViewResult.setText(buttonNine.getText().toString());
                break;
            }
            case R.id.btnPoint: {
                textViewResult.setText(buttonPoint.getText().toString());
                break;
            }
        }

    }


}