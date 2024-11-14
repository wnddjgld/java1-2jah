package chp11.ex11_1;

public class MainIPhone {
    public static void main(String[] args) {
// 업캐스팅된 경우 참조변수는 부모의 것과 자식의 것은 오버라이딩된 것만 사용 가능
        Phone p = new IPhone();
        p.callPhone("010-3384-6623");
        p.receivePhone("010-3398-6623");
        System.out.println("제조사명: "+ Phone.PRODUCT_NAME);
        IPhone iphone = new IPhone();

        iphone.beep();
        iphone.callPhone("010-1111-2222");
        iphone.playMusic("APT");
        iphone.sendAirdrop("사진");
        iphone.sendMessage("오늘 수능 대박나라");

        Alarm alarm = iphone;
        alarm.beep();
        alarm.playMusic("Sticky");
    }
}
