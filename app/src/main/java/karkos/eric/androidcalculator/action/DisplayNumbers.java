package karkos.eric.androidcalculator.action;

import android.view.View;

import karkos.eric.androidcalculator.databinding.ActivityMainBinding;

// This is where the NUMBER and DECIMAL buttons do things
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

        mBinding.buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.editText.setText(mBinding.editText.getText() + ".");
            }
        });
    }
}
