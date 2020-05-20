package JAVA3_ARRAYS_PROGRAMS;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateFromArray19 {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int size = arr.length;

        HashSet<Integer> hset = new LinkedHashSet<>();

        for(int i=0;i<size;i++){
            hset.add(arr[i]);
        }

        for(Integer i:hset){
            System.out.print(i + " ");
        }
    }
}
