package chp10.ex10_10;

public class Item {

    private String Name;

    private int Price;

    private int Power;

// 필드명과 지역변수(매개변수)의 이름이 같은 경우 구별하는 용도로 this 키워드를 사용
    public Item(String name) {
        this.Name = name;
    }

    public Item(String name, int price) {
        this(name);
        this.Price = price;
    }
    public Item(String name, int price, int power) {
        this(name, price);
        this.Power = power;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }
}
