package JAVA1_BASIC_PROGRAM;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
         int num1,num2,product;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");

        num1 = input.nextInt();

        System.out.println("Please enter the first number: ");

        num2 = input.nextInt();

        input.close();

        product = num1*num2;

        System.out.println("The product of two number is: " + product);
    }
}
