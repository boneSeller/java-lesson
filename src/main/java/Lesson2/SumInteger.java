package Lesson2;

public class SumInteger {
    public static void main(String[] args) {
    sumInteger(1, 11);
    }

    public static void sumInteger(int a, int b) {
        int c = a + b;
        if ( 10 <= c && c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
