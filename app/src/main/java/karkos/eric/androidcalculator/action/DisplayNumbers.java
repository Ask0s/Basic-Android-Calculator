package karkos.eric.androidcalculator.action;

import android.view.View;

import karkos.eric.androidcalculator.databinding.ActivityMainBinding;

public class DisplayNumbers {

    public DisplayNumbers(final ActivityMainBinding mBinding) {
        mBinding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "0");
            }
        });

        mBinding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "1");
            }
        });

        mBinding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "2");
            }
        });

        mBinding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "3");
            }
        });

        mBinding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "4");
            }
        });

        mBinding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "5");
            }
        });

        mBinding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "6");
            }
        });

        mBinding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "7");
            }
        });

        mBinding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "8");
            }
        });

        mBinding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "9");
            }
        });

        mBinding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "/");
            }
        });

        mBinding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "*");
            }
        });

        mBinding.buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "-");
            }
        });

        mBinding.buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + "+");
            }
        });

        mBinding.buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + ".");
            }
        });

        mBinding.buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create method for evaluating inputs
            }
        });

        mBinding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create method for clearing input
            }
        });
    }
}
