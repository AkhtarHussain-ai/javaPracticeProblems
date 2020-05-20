package JAVA2_STRINGS_PROGRAMS;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack4b {
    public static void main(String[] args) {

        System.out.println("Please enter the string: ");
        Scanner input = new Scanner(System.in);
        String  inputString = input.nextLine();
        input.close();

        Stack stack = new Stack();

        for(int i =0; i < inputString.length(); i++){

            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()){
            reverseString = reverseString + stack.pop();
        }

        if (inputString.equals(reverseString)){
            System.out.println("The entered String is palindrome");
        }

        else{
            System.out.println("The Entered String is not a palindrome");
        }

        }
}
