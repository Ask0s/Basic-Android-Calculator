package karkos.eric.androidcalculator.action;

import karkos.eric.androidcalculator.databinding.ActivityMainBinding;

public class Compute {

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

    public Compute(ActivityMainBinding mBinding) {
        mParseNumber = mBinding;
    }

    private void compute() {
        if(!Double.isNaN(leftValue)) {
            
        }
    }
}
