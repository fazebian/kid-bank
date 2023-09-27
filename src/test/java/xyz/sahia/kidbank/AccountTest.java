package xyz.sahia.kidbank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void newAccountShouldHaveZeroBalance(){
        Account account = new Account();
       assertEquals(0, account.balance());
    }

}