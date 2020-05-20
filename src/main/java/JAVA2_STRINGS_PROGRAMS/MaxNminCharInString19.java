package JAVA2_STRINGS_PROGRAMS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxNminCharInString19 {
    public static void main(String[] args) {

        String str = "aabbccc";

        str =str.toLowerCase().replace(" ","");

        char[] ch = str.toCharArray();

        int size = ch.length;

        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
        int i=0;

        while (i!=size){
            if (map.containsKey(ch[i]) == false){
                map.put(ch[i],1);
            }
            else {
                int oldValue = map.get(ch[i]);

                int newValue = oldValue +1;
                map.put(ch[i], newValue);
            }

            i++;
        }

        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
        int maxValue = 0;
        int minValue = 10000000;

        for(Map.Entry<Character,Integer> data: hmap ){
            if(data.getValue() > maxValue) {
                maxValue = data.getValue();
            }

            if (data.getValue() < minValue) {
                minValue = data.getValue();
            }
        }
        System.out.println("Max value: " + maxValue + " Min value: "+ minValue);

        for(Map.Entry<Character,Integer> data: hmap ) {
            if (data.getValue() ==  maxValue) {
                System.out.println(data.getKey() + " is max");
            }
        }

        for(Map.Entry<Character,Integer> data: hmap ) {
            if (data.getValue() ==  minValue) {
                System.out.println(data.getKey() + " is min");
            }
        }

    }

}
