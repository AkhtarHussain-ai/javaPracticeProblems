package JAVA2_STRINGS_PROGRAMS;

public class CompareTwoStringsLexicographically36 {
    public static void main(String[] args) {
        String str1 = "Akhtar1";
        String str2 = "Akhtar2";

        int result = str1.compareTo(str2);

        if(result < 0) {
            System.out.println(str1 + " is less than " + str2);
        }
        else if(result == 0){
            System.out.println(str1 + " is equal to " + str2);
        }

        else {
            System.out.println(str1 + " is greater than " + str2);
        }
    }
}
