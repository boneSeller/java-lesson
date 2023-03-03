package Lesson2;

import java.util.Arrays;

public class InitialValue {
    public static void main(String[] args) {
        value(4, 7);
    }

    public static void value(int len, int initialValue) {
        int[] a = new int[len];

        for (int i = 0; i < len ; i++) {
            a[i] = initialValue;
        }

        System.out.println(Arrays.toString(a));
    }
}
