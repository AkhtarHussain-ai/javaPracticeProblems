package JAVA9_OTHER_PROGRAMS;

import java.util.Scanner;

public class MakeACalculatorUsingSwitchCase {
    public static void main(String[] args) {
        double num1, num2, result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Please enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Please enter the operator, such as +,-,* or / : ");

        char operator = scanner.next().charAt(0);

        scanner.close();

        switch (operator){

            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;

            case '*':
                result = num1*num2;
                break;
            case '/' :
                result = num1/num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1 +" " + operator + " " + num2 + ": " + result);
    }
}
