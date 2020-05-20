package JAVA3_ARRAYS_PROGRAMS;

import java.util.ArrayList;

public class commonElementsInThreeSortedArray29 {
    public static void main(String[] args) {
        int[] a1 = {1, 5, 10, 20, 40, 80};
        int[] a2 = {6, 7, 20, 80, 100};
        int[] a3 = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> arrayList = new ArrayList<>();
        int i=0,j=0,k=0;

        while (i < a1.length && j < a2.length && k < a3.length){
            if(a1[i] == a2[j] && a2[j] == a3[k]){
                arrayList.add(a1[i]);
                i++;
                j++;
                k++;
            }
            else if(a1[i] < a2[j]){
                i++;
            }
            else if(a2[j] < a3[k]){
                j++;
            }
            else {
                k++;
            }
        }
        for(int al:arrayList){
            System.out.print(al+" ");
        }
    }
}
