package chp10.ex10_4;

import java.util.ArrayList;

public class MainShape {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(s);
        shapes.add(t);
        shapes.add(c);

        for (int i = 0; i < shapes.size(); i++) {
            System.out.printf("%d번 인덱스의 도형: %s\n", i ,shapes.get(i).name);
        }
    }
}