package chp07.lab1;

public class Square {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int lenght) {
        this.length = lenght;
    }
    public int area() {
        int result = (int)Math.pow(length, 2);  //length*length
        return result;
    }

}