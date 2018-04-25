package karkos.eric.androidcalculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import karkos.eric.androidcalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IMainActivity {
    // Data binding class instance
    ActivityMainBinding binding;

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

    // Holds next operator of equation to be performed
    private char nextOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    public void onNumberPress() {

    }
}
