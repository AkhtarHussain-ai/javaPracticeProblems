package JAVA3_ARRAYS_PROGRAMS;

import java.util.ArrayList;

public class topTwoNumbers32 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, -4,5, -1, 4};
      topTwo(arr);
    }
    public static void topTwo(int[] a){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int n:a){
            if(n>max1){
                max2 = max1;
                max1 = n;
            }
            else if(n>max2){
                max2 = n;
            }
        }
        System.out.print(max1+ " " + max2);
    }

}

