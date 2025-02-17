package JAVA2_STRINGS_PROGRAMS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue4a {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        in.close();

        Queue queue = new LinkedList();

        for (int i = inputString.length()-1;i>=0; i--)
        {
            queue.add(inputString.charAt(i));
            System.out.println(i);
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");


    }
}
