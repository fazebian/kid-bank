package xyz.sahia.kidbank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountControllerTest {

    @Test
    public void format0AsMoneyResultInDollarSignAnd2Decimals(){
        AccountController accountController = new AccountController(null);

        assertEquals(accountController.formatAsMoney(0), "$0,00");
    }

}