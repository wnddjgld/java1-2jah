package chp12.ex12_4;

import java.util.ArrayList;

public class NullPointerExceptionTest {
// 참조변수 선언만 하고 객체 참조값을 대입하지 않은 상태로 사용하면 NullPointException 이 발생.
    ArrayList<String> listNames = new ArrayList<String>();

    public void addName(String name) {
        listNames.add(name);
    }

    public void printAllNames() {
        for (String name : listNames) {
            System.out.println(name);
        }
    }
}
