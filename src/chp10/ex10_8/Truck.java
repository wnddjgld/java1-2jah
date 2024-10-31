package chp10.ex10_8;

public class Truck extends Car{
    private double payLoad;

    public Truck(String name, double payLoad) {
        super(name);
        this.payLoad = payLoad;
        System.out.printf("적재량: %.1f\n", payLoad);
    }

    public void load(){
        System.out.printf("[%s]가 물건을 적재합니다.(최대 %.1f 톤)\n", getName(), payLoad);
    }

    public double getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(double payLoad) {
        this.payLoad = payLoad;
    }
}
