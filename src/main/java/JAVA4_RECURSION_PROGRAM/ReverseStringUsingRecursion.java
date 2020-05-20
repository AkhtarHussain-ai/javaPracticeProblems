package JAVA4_RECURSION_PROGRAM;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {

        String str = "This is my home";

        String reverseString = reverse(str);
        System.out.println("The reverse String is: " + reverseString);

    }

    public static String reverse(String str){
        if (str == null || str.length() <=1){
            return str;
        }

        else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
