package chp08.lab07;

public class MainAccountTest {
    public static void main(String[] args) {
        AccountTest a = new AccountTest("123-45", 10000);
        AccountTest b = new AccountTest("567-89", 10000);
        while (a.transfer(b, 3000)){
            ;
        }
        System.out.println(a);
        System.out.println(b);
    }
}