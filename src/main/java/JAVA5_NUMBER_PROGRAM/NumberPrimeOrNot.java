package JAVA5_NUMBER_PROGRAM;

import java.util.ArrayList;
import java.util.List;

public class NumberPrimeOrNot {
    public static void main(String[] args) {

        int n =6;
        int temp =0;
        for (int i=2; i<=n-1; i++){

            if (n%i == 0){
                temp = temp +1;
            }
        }
        if(temp == 0){
            System.out.println("The number entered is prime");

        }
        else {
            System.out.println("The Entered number is not a prime");

        }


    }

}
