package JAVA4_RECURSION_PROGRAM;

public class CheckPalindromeStringByRecursion {
    public static void main(String[] args) {
        String str = "Malayalam";
        boolean result = isPalindrome(str);
        System.out.println("The given String, " + str + " is palindrome: " + result);

    }

    public static boolean isPalindrome(String str){
        if(str == null){
            return false;
        }
        if(str.length() <=1) {
            return true;
        }

        String first = str.substring(0,1);
        String last = str.substring(str.length()-1, str.length());

        if (!first.equalsIgnoreCase(last)){
            return false;
        }
        else {
            return isPalindrome(str.substring(1,str.length()-1));
        }
    }
}
