package JAVA2_STRINGS_PROGRAMS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SmallestBiggestPalindrome26 {
    public static void main(String[] args) {
        String word;
        String str = "Wow you own kayak ouo";

        str = str.toLowerCase();

        String[] strArr = str.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<strArr.length;i++){
            word = strArr[i];

            String reverseString = "";
            for(int j = word.length()-1 ;j>=0;j--){

                reverseString = reverseString + word.charAt(j);

            }

            if(word.equals(reverseString)){
                int count = 0;
                for(int k=0; k<reverseString.length();k++){
                    count++;
                }

                map.put(reverseString,count);

            }
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
                System.out.println("The max length palindrome word is : " + data.getKey());
            }
            else if(data.getValue() == minValue){
                System.out.println("The min length palindrome word : " + data.getKey());
            }
        }

    }
}
