package chp09.ex9_3;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        //정수, 실수, 논리값, 특정 개수도 지정가능
        Random rand = new Random();

        System.out.printf("임의의 정수값: %d\n", rand.nextInt());
        System.out.printf("0~10 사이의 임의의 정수값: %d\n", rand.nextInt(10));
        System.out.printf("1~10 사이의 임의의 정수값: %d\n", rand.nextInt(10)+1);
        System.out.printf("임의의 실수값: %f\n", rand.nextDouble(100));
        System.out.printf("임의의 참/거짓: %b\n", rand.nextBoolean());
    }
}
