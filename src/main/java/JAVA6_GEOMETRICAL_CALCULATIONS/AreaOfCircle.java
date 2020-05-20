package JAVA6_GEOMETRICAL_CALCULATIONS;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int x =1;

        while(x==1) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Please enter the radius of the Circle : ");
                double r = scanner.nextDouble();
                scanner.close();
                circleArea(r);
                x = 2;

            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        }
    }
    public static void circleArea(double radius) {
        double a = Math.PI*radius*radius;
        System.out.printf("Area of the circle is %.3f", a);
        double circumference = Math.PI*2*radius;
        System.out.println();
        System.out.printf("Circumference of the circle is %.3f" , circumference);
    }
}
