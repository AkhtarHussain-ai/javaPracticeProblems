package JAVA2_STRINGS_PROGRAMS;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangingStringsInAnAlphabeticalOrder5 {
    public static void main(String[] args) {
        String temp = null;
        System.out.println("Please enter the number of strings you would like to enter");

        Scanner scanner1 = new Scanner(System.in);

        int count = scanner1.nextInt();

        String[] str = new String[count];

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please enter the String you would like to sort one by one");

        for(int i=0;i<count;i++){
            str[i] = scanner2.nextLine();
        }
        scanner1.close();
        scanner2.close();

        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(str[i].compareTo(str[j])>0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
            System.out.print(str[i] + ", ");
        }


        System.out.println("The Strings in sorted order is: ");
        for(int i=0; i<count;i++){
            System.out.print(str[i] + ", ");
        }





    }
}
