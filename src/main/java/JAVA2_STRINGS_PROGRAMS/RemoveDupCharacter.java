package JAVA2_STRINGS_PROGRAMS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDupCharacter {
    public static void main(String[] args) {
        String s = "SILLYSPIDER";

        char[] ch = s.toCharArray();

        int size = ch.length;

        HashMap<Character,Integer> map = new LinkedHashMap<>();

        int i=0;

        while(i!=size){
            if(map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) +1);
            }
            else {
                map.put(ch[i],1);
            }
            i++;
        }

        Set<Map.Entry<Character,Integer>>  lhmap = map.entrySet();
        String res ="";

        for(Map.Entry<Character,Integer> data:lhmap){
            res = res + data.getKey();
        }
        System.out.println(res);

    }
}
