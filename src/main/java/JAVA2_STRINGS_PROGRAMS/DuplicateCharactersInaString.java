package JAVA2_STRINGS_PROGRAMS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class countDupChars {
    public void dupCharInString(String str){

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        char[]  chars = str.toCharArray();

        for(char ch:chars){
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }

        Set<Character> s = map.keySet();

        for (Character ch:s){
            if (map.get(ch)>1){
                System.out.println("Char " + ch + " " + map.get(ch));
            }
        }
    }

    public static void main(String a[]){
        countDupChars obj = new countDupChars();
        System.out.println("String: BeginnersBook.com");
        System.out.println("-------------------------");
        obj.dupCharInString("BeginnersBook.com");

        System.out.println("String: ChaitanyaSingh");
        System.out.println("-------------------------");
        obj.dupCharInString("ChaitanyaSingh");

        System.out.println("String: #@$@!#$%!!%@");
        System.out.println("-------------------------");
        obj.dupCharInString("#@$@!#$%!!%@");
    }

}
