package chp10.ex10_9;

public class Cat extends Animal{

    @Override
    void eat(String food) {
        System.out.println(getName() + "가(이)" + food + "를(을) 먹는다.");
    }

    @Override
    void cry(String sound) {
        System.out.println(getName() + "가(이)" + sound + "소리를 낸다.");
    }
    public void Grooming(){
        System.out.println("꼬리를 살랑살랑 흔든다");
    }
}
