package JAVA3_ARRAYS_PROGRAMS;

public class CharToString {
    public static void main(String[] args) {
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("The value of char is now String: " + str);

        String str2 = String.valueOf(ch);

        System.out.println("Second String: " + str2);
    }


}
