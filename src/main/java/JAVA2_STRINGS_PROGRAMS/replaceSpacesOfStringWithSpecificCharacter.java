package JAVA2_STRINGS_PROGRAMS;

public class replaceSpacesOfStringWithSpecificCharacter {
    public static void main(String[] args) {
        String str = "This is just a test string";

        char ch = '-';


        str = str.replace(' ', '-');

        System.out.print("String after replacing spaces with given character: " + str);

    }
}
