package JAVA3_ARRAYS_PROGRAMS;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class frequencyOfEachElementInArray7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2, 8, 3, 2, 2, 2, 5, 1};
        int size = arr.length;

        Map<Integer,Integer> map = new LinkedHashMap<>();

        int i=0;

        while (i!=size){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) +1);
            }
            else {
                map.put(arr[i],1);
            }
            i++;
        }

        Set<Integer> s = map.keySet();

        for(Integer k:s){
            System.out.println(k + " contains " + map.get(k) + " times") ;
        }
    }
}
