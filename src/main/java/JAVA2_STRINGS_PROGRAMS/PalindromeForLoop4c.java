package JAVA2_STRINGS_PROGRAMS;

import java.util.Scanner;

public class PalindromeForLoop4c {
    public static void main(String[] args) {

        String ReverseString = "";
        System.out.println("Please Enter the String");
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        scanner.close();
        int lenght = inputString.length();

//        for(int i= lenght-1; i>=0;i--){
//            ReverseString = ReverseString + inputString.charAt(i);
//        }
//   BOTH ARE CORRECT

        int i= lenght-1;

        while (i>=0){
            ReverseString = ReverseString + inputString.charAt(i);
            i--;
        }

        if(inputString.equals(ReverseString)){
            System.out.println("Input string is a palindrome.");
        }

        else
        {
            System.out.println("Input string is not a palindrome.");
        }
    }
}


