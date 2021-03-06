package karkos.eric.androidcalculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import karkos.eric.androidcalculator.action.Compute;
import karkos.eric.androidcalculator.action.DisplayNumbers;
import karkos.eric.androidcalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // Data binding class instance
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DisplayNumbers displayNumbers = new DisplayNumbers(binding);
        Compute computeNumbers = new Compute(binding);
    }
}
