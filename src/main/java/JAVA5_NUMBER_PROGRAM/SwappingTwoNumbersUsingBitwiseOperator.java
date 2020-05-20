package JAVA5_NUMBER_PROGRAM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwappingTwoNumbersUsingBitwiseOperator {
    public static void main(String[] args) {
        int x=1;


       while(x==1){
           try {
               Scanner scanner = new Scanner(System.in);
               System.out.println("Please enter the first Number");
               int a = scanner.nextInt();
               System.out.println("Please enter the Second Number");
               int b = scanner.nextInt();
               scanner.close();
               bitSwap(a,b);
               x=2;
           } catch (InputMismatchException e) {
               System.out.println("The Number you have entered is incorrect");
           }
       }

    }
    public static void bitSwap(int num1, int num2){

           System.out.println("Before swapping, num1= " + num1 + " num2= " + num2);
           System.out.println("************************");

           num1 = num1 ^ num2;
           num2 = num1 ^ num2;
           num1 = num1 ^ num2;

           System.out.println("After swapping, num1 = " + num1 + " num2 = " + num2);
    }

}
