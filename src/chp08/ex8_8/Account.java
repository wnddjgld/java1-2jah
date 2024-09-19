package chp08.ex8_8;

public class Account {
    private String name;
    private int balance;
    private String accNumber;
    private String pwd;

    public Account(String name, int balance, String accNumber, String pwd) {
        this.name = name;
        this.balance = balance;
        this.accNumber = accNumber;
        this.pwd = pwd;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public String getPwd() {
        return pwd;
    }
//  입금하는 메소드: deposit
    public void deposit(int money) {
        balance += money;
    }

//  출금하는 메소드: withdraw
    public void withdraw(int money) {
        balance -= money;
    }

    @Override
    public String toString() {
        return "account{" +
                "balance=" + balance +
                ", accNumber='" + accNumber + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
