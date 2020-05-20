package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class mergeTwoArraysWithoutSpace47 {
    public static void mergeTwoArray(int[] arr1, int m, int[] arr2, int n){


        for(int i=n-1;i>=0;i--){

            int j;
            int last = arr1[m-1];


            for(j=m-2;j>=0 && arr1[j] > arr2[i];j--) {

                arr1[j + 1] = arr1[j];
            }

            if(j !=m-2 || last > arr2[i]){
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        int m = arr1.length;
        int n = arr2.length;

        mergeTwoArray(arr1,m,arr2,n);

        System.out.println("First array after sorting: " + Arrays.toString(arr1));
        System.out.println("Second array after sorting: " + Arrays.toString(arr2));

    }
}
