package karkos.eric.androidcalculator.util;

import java.text.DecimalFormat;

public final class SetDecimals {

    private final DecimalFormat decimalFormat;

    public SetDecimals() {
        decimalFormat = new DecimalFormat("#.##########");
    }


}
