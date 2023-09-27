package xyz.sahia.kidbank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositCommandTest {
    @Test
    public void decimalToCents(){
        String amount = "4.95";
        assertEquals(DepositCommand.decimalToCentimes(amount), 495);
    }

}