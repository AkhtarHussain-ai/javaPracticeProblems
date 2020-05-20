package JAVA2_STRINGS_PROGRAMS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class dupWordsInString20 {
    public static void main(String[] args) {

        String str = "Big black bug bit a big black dog on his big black nose";

        String[] stringArr = str.split(" ");

        Map<String,Integer> map = new LinkedHashMap<String, Integer>();

        for(String string:stringArr){
            if(map.containsKey(string)){
                map.put(string, map.get(string)+1);
            }
            else {
                map.put(string,1);
            }
        }
        Set<String> s = map.keySet();
        for(String string:s){
            if(map.get(string) > 1){
                System.out.println("The duplicate words are '" + string + "' and its count is: " + map.get(string));
            }
        }
    }
}
