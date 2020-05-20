package JAVA3_ARRAYS_PROGRAMS;

import java.util.ArrayList;

public class removeDuplicates26 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4,9, 3, 5, 2, 7, 8, 9 };

        ArrayList<Integer> arrayList = new ArrayList();

        for(int i=0;i<numbers.length;i++){
            if(!arrayList.contains(numbers[i])){
                arrayList.add(numbers[i]);
            }
        }
        System.out.println(arrayList);
    }
}
