package JAVA5_NUMBER_PROGRAM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintAlternatePrimeNumbers {
    public static void main(String[] args) {
        List<Integer> primeNumberList=new ArrayList<>();

        for(int j =2;j<=100;j++)  {
            int temp =0;
            for (int i=2; i<=j-1; i++){

                if (j%i == 0){
                    temp = temp +1;

                }
            }
            if(temp == 0){
                System.out.println(j);
                primeNumberList.add(j);
            }

        }
        System.out.println("The array list is : " + primeNumberList);
        System.out.println("Alternate Prime numbers are: ");

        /*
        If we need to reverse the sorting of alternate prime number
        then use the below function:
        Collections.reverse(primeNumberList);
         */
        for(int i=0; i<primeNumberList.size();i++){
            if(i%2==0){
                System.out.print( primeNumberList.get(i) + " ");
            }
        }
    }
}
