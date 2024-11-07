package chp10.protected1;

import chp10.protected1.test.Child;

public class MainChild {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        System.out.println("Paren Id는"+ child.id);
    }
}
