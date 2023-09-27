package xyz.sahia.kidbank;

class Account {
    private int balance = 0;
    public int balance(){
        return balance;
    }
    public void deposit(int depot) {
        balance += depot;
    }
}
