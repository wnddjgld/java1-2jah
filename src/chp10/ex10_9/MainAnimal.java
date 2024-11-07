package chp10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {

// 추상클래스는 new 연산자로 객채 생성 불가능
//        Animal animal = new Animal()
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("고양이");
        cat.eat("사료");
        cat.cry("야옹");
        cat.sleep(7);
        cat.Grooming();

// 업캐스팅을 하면 부모 클래스의 모든 멤버 사용가능
// but 자식클래스의 멤버는 부모클래스의 메소드를 오버라이딩 된 메소드만 사용 가능
//        Animal animal = new Dog();
//animal.

    }
}
