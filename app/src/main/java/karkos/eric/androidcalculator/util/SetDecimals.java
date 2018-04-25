package karkos.eric.androidcalculator.util;

import java.text.DecimalFormat;

public final class SetDecimals {

    private DecimalFormat decimalFormat;

    public SetDecimals() {

    }

    public void setDecimalFormat() {
        this.decimalFormat = new DecimalFormat("#.##########");
    }
}
