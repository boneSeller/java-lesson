package Lesson2;

public class YearCounter {
    public static void main(String[] args) {
        yearCounter(1996);
    }

    public static void yearCounter(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            } else {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
    }
}
