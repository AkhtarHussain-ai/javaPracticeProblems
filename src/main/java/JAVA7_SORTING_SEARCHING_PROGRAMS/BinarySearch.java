package JAVA7_SORTING_SEARCHING_PROGRAMS;
// Time Complexity of binary search is O(logN)
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a = {2,4,5,5,6,9,2};

        int length = a.length;
        int start=0;
        int last = length-1;
        int middle = (start+last)/2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number you would like to search in the array: ");
        int searchNumber = scanner.nextInt();
        scanner.close();

        while (start<=last){
            if(a[middle] == searchNumber){
                System.out.println("The search number, " + searchNumber + " is at the " + (middle+1) + " position");
                break;
            }
            else if(searchNumber > a[middle]){
                start = middle+1;
            }
            else {
                last = middle-1;
            }
            middle = (start+last)/2;
        }
        if (start>last){
            System.out.println("The Entered Number, " + searchNumber + " is not in the list");
        }
    }
}
