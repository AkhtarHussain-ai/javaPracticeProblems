package JAVA1_BASIC_PROGRAM;

import java.util.Scanner;

public class LeapYear6 {
    public static void main(String[] args) {
        int year;
        System.out.println("Please enter the year: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        input.close();

        if((year%4 == 0 && year%100 !=0) || year%400 == 0){
            System.out.println( year + " is a leap year");
        }
        else {
            System.out.println(year + " is a not a leap year");

        }
    }
}
