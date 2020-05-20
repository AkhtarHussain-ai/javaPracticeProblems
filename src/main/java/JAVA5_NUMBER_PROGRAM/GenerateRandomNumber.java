package JAVA5_NUMBER_PROGRAM;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        int counter;
        Random Rnum = new Random();
        System.out.println("The Random numbers are as follow: ");
        for(counter=1;counter<=5; counter++){
            System.out.println(Rnum.nextInt(200));
        }
    }
}
