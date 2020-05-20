package JAVA3_ARRAYS_PROGRAMS;

import java.util.HashSet;

public class intersectionInTwoArrays26a {
    public static void main(String[] args) {
        int[] arr1 = {21, 34, 41, 22, 35};
        int[] arr2 =  {61, 34, 45, 21, 11};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    hashSet.add(arr1[i]);
                    break;
                }
            }
        }
        for(int no:hashSet){
            System.out.print(no + " ");
        }
    }
}
