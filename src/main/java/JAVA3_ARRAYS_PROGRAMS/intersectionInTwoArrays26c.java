package JAVA3_ARRAYS_PROGRAMS;

import java.util.HashSet;

public class intersectionInTwoArrays26c {
    public static void main(String[] args) {
        int[] arr1 = {4,3,7,9,2};
        int[] arr2 = {5,1,4,8,3,5};

        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for(int no:arr1){
            hashSet1.add(no);
        }
        for(int no:arr2){
            hashSet2.add(no);
        }

        for(int no:hashSet2){
             boolean b = hashSet1.add(no);
             if( b == false){
                 System.out.print(no + " ");
             }
        }
    }
}
