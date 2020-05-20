package JAVA1_BASIC_PROGRAM;

import java.util.Scanner;

public class AddTwoNumber1b {
    public static void main(String[] args) {
        int num1,num2,sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the First Number: ");

        num1 = sc.nextInt();

        System.out.println("Please enter the second Number: ");

        num2 = sc.nextInt();

        sc.close();
        sum = num1+num2;

        System.out.println("The sum of two number is: " + sum);
    }
}
