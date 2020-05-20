package JAVA3_ARRAYS_PROGRAMS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class firstRepeatedElement30 {
    public static void main(String[] args) {
        int[] arr =  {10, 5, 3, 4, 3, 5, 6};

        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) +1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }
        Set<Integer> s = hashMap.keySet();

        for(int num:s){
            if(hashMap.get(num) == 2){
                System.out.println(num);
                break;
            }
        }

    }
}
