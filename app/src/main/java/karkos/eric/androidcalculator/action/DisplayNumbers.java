package karkos.eric.androidcalculator.action;

import android.widget.AdapterView;

import karkos.eric.androidcalculator.databinding.ActivityMainBinding;

public class DisplayNumbers {

    ActivityMainBinding binding;

    public DisplayNumbers(String num) {
        int numAsInt = Integer.parseInt(num);
        switch (numAsInt) {
            case 0: zero(binding.buttonZero); break;
            case 1: one(); break;
            case 2: two(); break;
            case 3: three(); break;
            case 4: four(); break;
            case 5: five(); break;
            case 6: six(); break;
            case 7: seven(); break;
            case 8: eight(); break;
            case 9: nine(); break;
        }
    }

    private void zero(ActivityMainBinding binding) {

    }

    private void one() {

    }

    private void two() {

    }

    private void three() {

    }

    private void four() {

    }

    private void five() {

    }

    private void six() {

    }

    private void seven() {

    }

    private void eight() {

    }

    private void nine() {

    }
}
