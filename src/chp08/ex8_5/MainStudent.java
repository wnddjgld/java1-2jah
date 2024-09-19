package chp08.ex8_5;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(20240101, "유현주");
        Student s2 = new Student(20240102, "우현주");
        Student s3 = new Student(20240103, "으현주");
        System.out.printf("Student 객체의 수: %d개", Student.count);
    }
}
