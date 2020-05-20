//Convert array into Zig-Zag fashion

package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class zigZag58 {
    public static void zigZagArray(int[] a, int n){
        boolean flag = true;
        int temp;

        for(int i=0;i<n-1;i++){
            if(flag) {
                if(a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            else {
                if(a[i] < a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            flag = !flag;
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 7, 8, 6, 2, 1};

        zigZagArray(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
