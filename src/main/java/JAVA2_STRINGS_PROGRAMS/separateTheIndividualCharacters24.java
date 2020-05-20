package JAVA2_STRINGS_PROGRAMS;

public class separateTheIndividualCharacters24 {
    public static void main(String[] args) {
        String str = "Characters";
        String separatedStr = "";

        for(int i=0;i<str.length();i++){

            separatedStr = separatedStr + str.charAt(i) + " ";

        }
        System.out.println("The character separated string is: " + separatedStr);
    }
}
