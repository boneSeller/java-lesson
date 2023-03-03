package Lesson2;

public class StringRepeate {
    public static void main(String[] args) {
        stringRepeat("I love my wife", 4);
    }

    public static void stringRepeat(String a, int b) {

        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }

    }
}
