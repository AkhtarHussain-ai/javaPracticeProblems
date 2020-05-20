package JAVA9_OTHER_PROGRAMS;

import java.util.Scanner;

public class printFloydstriangle {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows in the triangle");

        int rows = scanner.nextInt();

        System.out.println("The Floyd's Triangle is: ");
        for(int i=1 ; i<=rows;i++){
            for (int j=1;j<=i;j++){
               count = count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }

    }

}
