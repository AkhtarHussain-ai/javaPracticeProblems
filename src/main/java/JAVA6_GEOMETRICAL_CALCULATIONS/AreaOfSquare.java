package JAVA6_GEOMETRICAL_CALCULATIONS;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        int x =1;

        while(x==1) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Please enter the side of the square : ");
                double s = scanner.nextDouble();

                scanner.close();
                squareArea(s);
                x = 2;
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        }
    }
    public static void squareArea(double size) {
        double a = size*size;
        System.out.println("Area of the square is: " + a);
    }
}
