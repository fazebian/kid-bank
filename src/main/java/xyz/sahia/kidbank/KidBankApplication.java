package xyz.sahia.kidbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KidBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(KidBankApplication.class, args);
	}

}
record Account(int balance){
	Account(int balance) {
		if (balance < 0)
			throw new IllegalArgumentException("balance < 0 ");
		this.balance= balance;
	}
}
