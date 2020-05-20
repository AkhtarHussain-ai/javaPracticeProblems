package JAVA1_BASIC_PROGRAM;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p, r, t, sInterest;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Principle amount");
        p = input.nextFloat();

        System.out.println("rate of Interest");
        r = input.nextFloat();

        System.out.println("time");
        t = input.nextFloat();

        input.close();
        sInterest = (p*r*t)/100;

        System.out.println("The Simple Interest amount is: " + sInterest);

    }

}
