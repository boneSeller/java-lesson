package Lesson2;

import java.util.Arrays;

public class MassiveMaker {
    public static void main(String[] args) {
        int[] a = new int[100];

        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }

        System.out.println(Arrays.toString(a));
    }
}
