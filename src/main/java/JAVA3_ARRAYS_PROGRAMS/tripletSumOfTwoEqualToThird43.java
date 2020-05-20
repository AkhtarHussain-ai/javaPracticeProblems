package JAVA3_ARRAYS_PROGRAMS;

import java.util.HashMap;

public class tripletSumOfTwoEqualToThird43 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        tripletSum(a,a.length);
    }

    public static void tripletSum(int[] a, int size){

        HashMap<Integer,Integer> map = new HashMap<>();

          for(int k=0;k<size;k++){
              map.put(a[k],k);
          }
        int count =0;
        for(int i=0;i<size-1 ;i++){
            for(int j=i+1;j<size;j++){
                if(map.containsKey(a[i] + a[j])){
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("No such pairs exist");
        }
        else {
            System.out.println(count);
        }
    }


}
