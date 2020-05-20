package JAVA3_ARRAYS_PROGRAMS;

import java.util.HashMap;
import java.util.Set;

public class elementWhichIsOnlyOnceInTwiceElementRepeatedArray27a {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
            else {
                hashMap.put(arr[i],1);

            }
        }

        Set<Integer> s = hashMap.keySet();

        for(Integer i:s){
            if(hashMap.get(i) == 1){
                System.out.print(i + " ");
            }
        }
    }
}
