package xyz.sahia.kidbank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DepositTest {

    @Test
    public void deposit495ShouldResultInBalanceOf495() throws Exception {
        Account account = new Account();

        account.deposit(495);

        assertThat(account.balance())
                .isEqualTo(495);
    }
    @Test
    public void deposit100aAnd200ShouldResultBalanceOf300(){
        Account account = new Account();

        account.deposit(100);
        account.deposit(200);
        assertThat(account.balance()).isEqualTo(300);

    }
}
