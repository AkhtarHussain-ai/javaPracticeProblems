package JAVA1_BASIC_PROGRAM;


import java.util.Scanner;

public class CheckEvenOdd2 {
    public static void main(String[] args) {
        int num;
        System.out.print("Please enter the number: ");

        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        if( num%2 ==0 ){
            System.out.println("The Number Entered is Even");
        }

        else{
            System.out.println("The Number Entered is ODD");
        }
    }
}
