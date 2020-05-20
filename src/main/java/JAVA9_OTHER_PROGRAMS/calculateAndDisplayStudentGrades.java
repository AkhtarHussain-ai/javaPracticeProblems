package JAVA9_OTHER_PROGRAMS;

import java.util.Scanner;

public class calculateAndDisplayStudentGrades {
    public static void main(String[] args) {
          float total =0, average;

        int[] marks = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<6;i++){

            System.out.println("Enter the marks of subject" + (i+1) + ": " );
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
         scanner.close();

        average = total/6;
        System.out.print("Student grade is: ");

        if(average>=80){
            System.out.print("A");
        }
        else if(average>=60 && average<80){
            System.out.print("B");
        }
        else if(average>=40 && average <60){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
