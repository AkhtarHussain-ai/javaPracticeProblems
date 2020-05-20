package JAVA2_STRINGS_PROGRAMS;

import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args) {
        char ch;
        boolean isVowel = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a alphabet");
        ch = input.next().charAt(0);
        input.close();

        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if (isVowel == true) {
            System.out.println("The Entered char is vowel");
        }
        else
        {
            if ((ch >= 'a' && ch >= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println("Entered char is consonant");
            }
            else {
                System.out.println("Please enter a valid char");
            }
        }


    }
}
