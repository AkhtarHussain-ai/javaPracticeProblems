package JAVA7_SORTING_SEARCHING_PROGRAMS;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = {1, 2, 3, 4, 8, 4};
        int length = arr.length;

        System.out.println("Please enter the number you would like to search");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();
        scanner.close();

      for (i = 0; i < length; i++)
    {
        if (arr[i] == searchNumber)
        {
            System.out.println(searchNumber+" is present at location "+(i+1));
            /*Item is found so to stop the search and to come out of the
             * loop use break statement.*/
            break;
        }
    }
      if (i == length)
            System.out.println(searchNumber + " doesn't exist in array.");
}

}
