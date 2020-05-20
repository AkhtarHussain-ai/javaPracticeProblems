package JAVA3_ARRAYS_PROGRAMS;

import java.util.HashSet;

public class intersectionInTwoArrays26b {
    public static void main(String[] args) {
        int[] arr1 = {4,3,7,9,2};
        int[] arr2 = {5,1,4,8,3};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int no:arr1){
            hashSet.add(no);
        }
        for(int no:arr2){
            boolean b = hashSet.add(no);
            if(b == false ){
                System.out.print(no + " ");
            }
        }
     }
}
