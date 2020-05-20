package JAVA2_STRINGS_PROGRAMS;

public class TwoStringsRotationOfEachOther18 {
    public static void main(String[] args) {
        String str1 = "abcde";

        String str2 = "cdeab";

        str1 = str1.concat(str1);

        if (str1.length()!=str2.length()){
            System.out.println("Non-Rotation String");
        }
     else {
            if(str1.contains(str2)){
                System.out.println("Rotating String");
            }
            else {
                System.out.println("Non-Rotation String");
            }
        }
    }

}
