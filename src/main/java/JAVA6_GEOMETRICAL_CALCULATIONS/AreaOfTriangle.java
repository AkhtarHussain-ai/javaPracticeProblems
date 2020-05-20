package JAVA6_GEOMETRICAL_CALCULATIONS;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        int x =1;

        while(x==1) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Please enter the height of the triangle : ");
                double h = scanner.nextDouble();

                System.out.println("Please enter the base of the triangle : ");
                double b = scanner.nextDouble();

                scanner.close();
                triangleArea(h,b);
                x = 2;

            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        }
    }
    public static void triangleArea(double height, double base) {
        double a = (height*base)/2;
        System.out.println("Area of the square is: " + a);

    }
}
