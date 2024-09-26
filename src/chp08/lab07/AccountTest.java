package chp08.lab07;

import chp08.ex8_8.Account;

public class AccountTest {

    private String num;
    private int balance;

    public AccountTest(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }
    public String getNum() {
        return num;
    }
    public int getBalance() {
        return balance;
    }

    public boolean transfer(AccountTest account, int amount) {
        if(balance >= amount) {
            balance -= amount;
            account.balance += amount;
            return true;
        }
        return false;

    }
    @Override
    public String toString() {
        return "Account { num: " + num +
                ", balance: " + balance + " }";
    }
}