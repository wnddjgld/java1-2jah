package chp11.ex11_1;

public interface Phone {
    //public과 abstract는 생략가능

    String PRODUCT_NAME = "Apple"; //인터페이스는 상수, 추상메소드, default 메소드 등을 사용할 수 있다
// 상수는 final, static을 생략 가능
    public abstract void callPhone(String phoneNumber);
//    추상메소드는 public abstract를 생략 가능
    void receivePhone(String phoneNumber);

}
