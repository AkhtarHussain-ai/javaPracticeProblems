package JAVA6_GEOMETRICAL_CALCULATIONS;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int x =1;

        while(x==1) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Please enter the lenght: ");
                int lenght = scanner.nextInt();
                System.out.println("Please enter the width: ");
                int width = scanner.nextInt();
                scanner.close();
                rectangleArea(lenght, width);
                x = 2;
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        }

    }
    public static void rectangleArea(int l, int w) {
        int a = l*w;
        System.out.println("Area of the rectangle is: " + a);
    }
}
