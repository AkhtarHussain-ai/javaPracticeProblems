package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class Sort0s1s2sPrblm52 {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 1, 2, 0, 1, 2, 0};


        int count0 = 0, count1 = 0;

        for (int i = 0; i < a.length; i++) {

            switch (a[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
            }
        }

        for (int i = 0; i < count0; i++) {
            a[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            a[i] = 1;
        }
        for (int i = count0 + count1; i < a.length; i++) {
            a[i] = 2;
        }

        System.out.println(Arrays.toString(a));

    }
}
