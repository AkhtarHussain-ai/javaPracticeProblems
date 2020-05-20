package JAVA2_STRINGS_PROGRAMS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class firstNonRepeatedCharInString32 {
    public static void main(String[] args) {
        String string = "SILLYSPIDER";

       char[] ch = string.toCharArray();
       int size = ch.length;

        Map<Character,Integer> map = new LinkedHashMap<>();

        int i=0;
       while (i!=size){
           if(map.containsKey(ch[i]) == true){
               map.put(ch[i],map.get(ch[i])+1);
           }
           else {
               map.put(ch[i],1);
           }
         i++;
       }
        Set<Character> C = map.keySet();

       for(Character c:C){
           if(map.get(c) ==1){
               System.out.println("The first non-repeated character is: " + c);
               System.exit(0);
           }
       }
    }
}
