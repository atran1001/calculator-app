package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorFragment extends AppCompatActivity {

    TextView results;
    TextView enteredValues;
    String entered = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_number_layout);
        initTextViews();
    }

    private void setEnteredValues(String givenVal) {
        entered = entered + givenVal;
        enteredValues.setText(entered);
    }

    public void evaluateOnClick(View view) {
        double result = 0;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        try{
            result = (double)engine.eval(entered);
        }catch(Exception e){
            Toast.makeText(this,"Invalid Input",Toast.LENGTH_SHORT).show();
        }
        results.setText(String.valueOf(result));
    }

    private void initTextViews() {
        results = findViewById(R.id.result);
        enteredValues = findViewById(R.id.enteredValues);
    }

    public void clearOnClick(View view) {
        enteredValues.setText("");
        entered="";
        results.setText("");
    }

    public void divideOnClick(View view) {
        setEnteredValues("/");
    }

    public void plusMinusOnClick(View view) {

    }



    public void multiplyOnClick(View view) {
        setEnteredValues("*");
    }

    public void addOnClick(View view) {
        setEnteredValues("+");
    }

    public void subtractOnClick(View view) {
        setEnteredValues("-");
    }

    public void sevenOnClick(View view) {
        setEnteredValues("7");
    }

    public void eightOnClick(View view) {
        setEnteredValues("8");
    }

    public void nineOnClick(View view) {
        setEnteredValues("9");
    }

    public void percentageOnClick(View view) {
    }

    public void twoOnClick(View view) {
        setEnteredValues("2");
    }

    public void zeroOnClick(View view) {
        setEnteredValues("0");
    }

    public void decimalOnClick(View view) {
        setEnteredValues(".");
    }

    public void fiveOnClick(View view) {
        setEnteredValues("5");
    }

    public void sixOnClick(View view) {
        setEnteredValues("6");
    }

    public void oneOnClick(View view) {
        setEnteredValues("1");
    }

    public void fourOnClick(View view) {
        setEnteredValues("4");
    }

    public void threeOnClick(View view) {
        setEnteredValues("3");
    }
}
