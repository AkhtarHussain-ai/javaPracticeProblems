package JAVA2_STRINGS_PROGRAMS;

public class CountVowelsAndConsonantsInAstring {
    public static void main(String[] args) {
        String str = "BeginnersBook";

        str = str.toLowerCase();

        int lenght = str.length();

        int vCount=0, cCount=0;

        for (int i=0;i<lenght;i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vCount ++;
            }
            else if (ch >= 'a' && ch <='z'){
                cCount++;
            }

            else {
                System.out.println("Please enter a valid character");
            }
        }

        System.out.println("Number of Vowels: " + vCount);
        System.out.println("Number of Consonant: " + cCount);
    }


}
