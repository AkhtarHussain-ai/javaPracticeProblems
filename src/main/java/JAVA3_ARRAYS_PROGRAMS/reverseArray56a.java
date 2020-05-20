package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class reverseArray56a {
    public static void reverseInGroups(int[] a, int k){
        int size = a.length;

        for(int i=0;i<size;i+=k){

            int start = i;

            int end = Math.min(i+k-1,size-1);

            while (start <= end ){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }

        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        reverseInGroups(a,5);

    }
}
