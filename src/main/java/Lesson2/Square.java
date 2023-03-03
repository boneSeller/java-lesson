package Lesson2;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {

        square(4);
    }

    public static void square(int n) {
        int[][] a = new int[n][n];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0, x = a[i].length - 1; j < a[i].length ; j++, x--) {
                if (i == j || x == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(a));

    }
}
