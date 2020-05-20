package Java11_HackerRankProblems;

import java.util.Scanner;

public class h1Hacker {
    public static int sumOfEnteredValues(int a[], int n){
        int result = 0;
        for(int i=0;i<a.length;i++){
            result = result+ a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the total count of number that need to be added");

        int count = scanner.nextInt();

        int[] a = new int[count];
        System.out.println("Please enter the number one by one");
        for(int i=0;i<count;i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Sum of the number is: " + sumOfEnteredValues(a,count));

    }
}
