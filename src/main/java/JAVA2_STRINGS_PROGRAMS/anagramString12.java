package JAVA2_STRINGS_PROGRAMS;
import java.util.Arrays;

public class anagramString12 {
    public static void anagram1(String s1, String s2){
        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        if(ch1.length != ch2.length){
            System.out.println(s1.length() + " and s2 length: " + s2.length());
            System.out.println("The entered Strings are not anagram");
        }
        else {

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2) == true){
                System.out.println("The Strings are anagram");
            }
            else {
                System.out.println("The entered Strings are not anagram");
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "Hitler Woman";
        String s2 = "Mother In Law";

        anagram1(s1,s2);
    }
}