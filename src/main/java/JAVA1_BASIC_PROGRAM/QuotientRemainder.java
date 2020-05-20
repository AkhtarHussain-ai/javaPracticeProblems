package JAVA1_BASIC_PROGRAM;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("First Number");
        num1 = input.nextInt();

        System.out.println("Second Number");
        num2 = input.nextInt();

        input.close();

        int Quotient = num1/num2;
        int remainder = num1%num2;

        System.out.println("The quotient is: " + Quotient );
        System.out.println("The remainder is: " + remainder);

    }
}
