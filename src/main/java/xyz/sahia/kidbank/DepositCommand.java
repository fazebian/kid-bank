package xyz.sahia.kidbank;

import java.math.BigDecimal;

public class DepositCommand {
    private String amount;

    public static int decimalToCentimes(String amount){
        BigDecimal decimalAmount = new BigDecimal(amount);
        return decimalAmount.scaleByPowerOfTen(2).intValue();
    }
    public int amountInCents(){
        return decimalToCentimes(amount);
    }
}
