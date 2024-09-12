package chp08.ex8_2;

public class Drink {

    private String name;

    private int price;

    public Drink() {
        System.out.println("default constructor 호출");

    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;

        System.out.println("default constructor 호출");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return String.format("Drink [name=%s, price=%s]", name, price);
    }
}