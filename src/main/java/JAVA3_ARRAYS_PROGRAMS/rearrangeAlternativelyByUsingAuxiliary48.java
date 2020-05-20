package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class rearrangeAlternativelyByUsingAuxiliary48 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] temp = new int[a.length];

        int small= 0;
        int large = a.length-1;


        for(int i=0;i<a.length;i++){
            if(i%2 == 0) {
                temp[i] = a[large--];
            }
            else {
                temp[i] = a[small++];
            }
        }
        a = temp.clone();

        System.out.println(Arrays.toString(a));
    }
}
