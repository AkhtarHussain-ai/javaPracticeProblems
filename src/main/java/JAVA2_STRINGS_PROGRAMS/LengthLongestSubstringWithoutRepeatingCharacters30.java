package JAVA2_STRINGS_PROGRAMS;

import java.util.HashSet;

public class LengthLongestSubstringWithoutRepeatingCharacters30 {
    public static void main(String[] args) {
//
//        String str = "pwwkewxyz";
//
//        longestSubstring(str);
//    }
//
//    public static void longestSubstring(String s) {
//        int a_pointer = 0;
//        int b_pointer = 0;
//        int maxLength = 0;
//        HashSet<Character> hashSet = new HashSet<>();
//
//        while (b_pointer < s.length()) {
//
//
//            if (!hashSet.contains(s.charAt(b_pointer))) {
//                hashSet.add(s.charAt(b_pointer));
//                maxLength = Math.max(hashSet.size(), maxLength);
//                b_pointer++;
//
//
//            } else {
//                hashSet.remove(s.charAt(a_pointer));
//                a_pointer++;
//            }
//
//
//        }
//        System.out.println(maxLength);
//    }

        //String str = "ABCDEFGHIAKLBMNOPQ";
        String input = "pwwkewxyz";
        System.out.println(findLargestSubStringWithoutRepeatChars(input));
    }

    /*
     * Algorithm: for each character in the string, find the subString till repeated characters and find the largest substring
     * Repeat the above step for the all characters
     */
    public static String findLargestSubStringWithoutRepeatChars (String input){

        HashSet<Character> set = new HashSet<Character>();

        String longestOverAll = "";
        String longestTillNow = "";
        int count = 0;
        for (int i = 0; i < input.length(); ) {
            char c = input.charAt(i);
            if (set.contains(c)) { // iterate till same character found in the set and if found we need to take the sub string (i , current position)
                if (longestTillNow.length() > longestOverAll.length()) { // if longestTillNow length is greater than
                    longestOverAll = longestTillNow;
                    i = ++count;
                    longestTillNow = "";
                    set.clear();
                    continue;
                }
            }
            i++;
            if (longestTillNow.indexOf(c) < 0) { // if given string contains only duplicate characters then it should not added to String
                longestTillNow += c;
            }
            set.add(c);

        }

        if (longestTillNow.length() > longestOverAll.length()) { // if string does not contains any duplicate characters
            longestOverAll = longestTillNow;
        }

        return longestOverAll;
    }
}


