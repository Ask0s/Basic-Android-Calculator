package karkos.eric.androidcalculator.action;

import android.view.View;

import java.text.DecimalFormat;

import karkos.eric.androidcalculator.databinding.ActivityMainBinding;

public class Compute {

    private char operator;

    // Data binding
    ActivityMainBinding mParseNumber;

    // Input values
    private double leftValue = Double.NaN;
    private double rightValue;

    // Operator variables
    private static final char minus = '-';
    private static final char plus = '+';
    private static final char multiply = '*';
    private static final char divide = '/';
    private static final char equals = '=';
    private static final char decimal = '.';

    public Compute(ActivityMainBinding mBinding) {
        this.mParseNumber = mBinding;

        final DecimalFormat decimalFormat = new DecimalFormat("#.##########");

        // Button listener for addition operator
        mParseNumber.buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                operator = plus;
                mParseNumber.infoTextView.setText(decimalFormat.format(leftValue) + "+");
                mParseNumber.editText.setText(null);
            }
        });

        // Button listener for subtraction operator
        mParseNumber.buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                operator = minus;
                mParseNumber.infoTextView.setText(decimalFormat.format(leftValue) + "-");
                mParseNumber.editText.setText(null);
            }
        });

        // Button listener for multiplication operator
        mParseNumber.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                operator = multiply;
                mParseNumber.infoTextView.setText(decimalFormat.format(leftValue) + "*");
                mParseNumber.editText.setText(null);
            }
        });

        // Button listener for division operator
        mParseNumber.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                operator = minus;
                mParseNumber.infoTextView.setText(decimalFormat.format(leftValue) + "/");
                mParseNumber.editText.setText(null);
            }
        });

        // Button listener for equality operator
        mParseNumber.buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                mParseNumber.infoTextView.setText(mParseNumber.infoTextView.getText().toString() +
                    mParseNumber.infoTextView.getText() + "=" + decimalFormat.format(leftValue));
                leftValue = Double.NaN;
                operator = '_';
            }
        });

        // Button listener for clear button
        mParseNumber.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mParseNumber.editText.getText().length() > 0) {
                    CharSequence currentInput = mParseNumber.editText.getText();
                    mParseNumber.editText.setText(currentInput.subSequence(0, currentInput.length()-1));
                }
                else {
                    leftValue = Double.NaN;
                    rightValue = Double.NaN;
                    mParseNumber.editText.setText(null);
                    mParseNumber.infoTextView.setText(null);
                }
            }
        });
    }

    private void compute() {
        if (!Double.isNaN(leftValue)) {
            rightValue = Double.parseDouble(mParseNumber.editText.getText().toString());
            mParseNumber.editText.setText(null);

            switch (operator) {
                case '+':
                    leftValue = this.leftValue + rightValue;
                    break;

                case '-':
                    leftValue = this.leftValue - rightValue;
                    break;

                case '*':
                    leftValue = this.leftValue - rightValue;
                    break;

                case '/':
                    leftValue = this.leftValue - rightValue;
                    break;

                default:
                    try {
                        leftValue = Double.parseDouble(mParseNumber.editText.getText().toString());
                    } catch (Exception e) {
                    }
            }

        }
    }
}
