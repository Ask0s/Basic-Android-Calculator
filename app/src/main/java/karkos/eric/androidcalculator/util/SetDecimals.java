package karkos.eric.androidcalculator.util;

import java.text.DecimalFormat;

public final class SetDecimals {

    private final DecimalFormat decimalFormat;

    public SetDecimals() {
        decimalFormat = new DecimalFormat("#.##########");
    }

    public String format(Double toFormat) {
        return decimalFormat.format(toFormat);
    }


}
