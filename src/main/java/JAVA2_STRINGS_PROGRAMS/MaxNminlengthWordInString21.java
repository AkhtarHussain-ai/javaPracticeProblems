package JAVA2_STRINGS_PROGRAMS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxNminlengthWordInString21 {
    public static void main(String[] args) {
        String str = "Hard often prepare ordinary people for an extraordinary destiny";

        String[] stringArr = str.split(" ");

        Map<String,Integer> map = new HashMap<String, Integer>();

        int size = stringArr.length;

        for (int i = 0; i<size;i++){
            int wordlength= stringArr[i].length();
            int count=0;
            for(int j=0;j<wordlength;j++){
                stringArr[i].charAt(j);

                count++;
            }
            map.put(stringArr[i],count);
        }
        Set<Map.Entry<String,Integer>> hmap = map.entrySet();

        int maxValue = 0;
        int minValue = 10000000;

        for(Map.Entry<String,Integer> data:hmap){
            if(data.getValue() > maxValue){
                maxValue = data.getValue();
            }

            if(data.getValue() < minValue){
                minValue = data.getValue();

            }
        }
        System.out.println("Max length is: " + maxValue + " Min length is : " + minValue);

        for(Map.Entry<String,Integer> data:hmap){
            if(data.getValue() == maxValue){
                System.out.println("The max length word is : " + data.getKey());
            }
            else if(data.getValue() == minValue){
                System.out.println("The min length word : " + data.getKey());
            }
        }
    }
}
