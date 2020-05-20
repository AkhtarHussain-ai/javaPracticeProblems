package JAVA3_ARRAYS_PROGRAMS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdLargestNumberInArray18 {
    public static int thirdLargest(int[] a, int desiredLargest){
        int size = a.length,temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // array can also be sorted as Arrays.sort(a);
        return a[size - desiredLargest];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,24,5,666,333,222};
        System.out.println(thirdLargest(arr,3));
    }
}

// to find the largest number : pass desiredLargest as 1

