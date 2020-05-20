package JAVA8_CONVERSION_PROGRAMS;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String args[])
    {
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a decimal number : ");
        int num =input.nextInt();

        // calling method toHexString()
        String str = Integer.toHexString(num);
        System.out.println("Decimal to hexadecimal: "+str);
    }
}
