package karkos.eric.androidcalculator.action;

import android.view.View;

import java.text.DecimalFormat;

import karkos.eric.androidcalculator.databinding.ActivityMainBinding;
import karkos.eric.androidcalculator.util.SetDecimals;

public class Compute {

    private char operator;

    // Data binding
    ActivityMainBinding mParseNumber;

    // Input values
    private double leftValue = Double.NaN;
    private double rightValue;

    // Operator variables
    private static final char divide = '/';
    private static final char multiply = '*';
    private static final char minus = '-';
    private static final char plus = '+';
    private static final char equals = '=';
    private static final char decimal = '.';

    // Decimal format setter
    private DecimalFormat setDecimalPrecision = new DecimalFormat("#.##########");

    public Compute(ActivityMainBinding mBinding) {
        mParseNumber = mBinding;

        mParseNumber.buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                operator = '+';
                mParseNumber.infoTextView.setText(mParseNumber.infoTextView.getText().toString()
                    );
            }
        });
    }




    private void compute() {
        if(!Double.isNaN(leftValue)) {
            rightValue = Double.parseDouble(mParseNumber.editText.getText().toString());
            mParseNumber.editText.setText("");

            switch (operator) {
                case '+': leftValue = this.leftValue + rightValue; break;

                case '-': leftValue = this.leftValue - rightValue; break;

                case '*': leftValue = this.leftValue - rightValue; break;

                case '/': leftValue = this.leftValue - rightValue; break;

                default:
                    try {
                        leftValue = Double.parseDouble(mParseNumber.editText.getText().toString());
                    }
                    catch (Exception e){ }
                }

            }
        }
    }
