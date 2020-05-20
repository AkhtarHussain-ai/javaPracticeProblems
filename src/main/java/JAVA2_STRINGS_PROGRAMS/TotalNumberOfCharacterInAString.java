package JAVA2_STRINGS_PROGRAMS;

public class TotalNumberOfCharacterInAString {
    public static void main(String[] args) {

        String str = "The best of both worlds";

        strCount(str);

    }

    public static void strCount(String string){
        int count=0;
        int length = string.length();

        for (int i=0; i<length;i++){
            if(string.charAt(i) !=' ')
                count++;
        }
        System.out.println("The total number of character is: " + count);
    }
}
