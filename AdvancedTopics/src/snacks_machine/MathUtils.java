package snacks_machine;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MathUtils {
    public static String formatRoundPrice(double snackPrice){
        // Rounding to two decimal places
        BigDecimal roundedValue = new BigDecimal(snackPrice).
                setScale(2, RoundingMode.HALF_UP);
        DecimalFormat df = new DecimalFormat("#.00");
        return  df.format(roundedValue.doubleValue());
    }
}
