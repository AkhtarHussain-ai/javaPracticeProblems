package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class integerArrayWhoseSumIsEqualToGivenNumber23 {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int sum = 12;
         printPairsUsingTwoPointer(numbers,sum);

//
//        int size = numbers.length;
//        int first,second;
//        for(int i=0;i<size;i++){
//            first = numbers[i];
//            for(int j=i+1;j<size;j++){
//                second = numbers[j];
//                if(first+second == sum){
//                    System.out.println("The numbers are: " + first + ", " + second);
//                }
//            }
//        }
        // Above is a linear solution whose timeComplexity is high: O(n^2)
    }


    public static void printPairsUsingTwoPointer(int[] a, int k){
        int size = a.length;
        int left = 0 , right = size-1;
        int sum;
        Arrays.sort(a);
        if(size < 2) {
            return;
        }
        while (left<right){
            sum = a[left] + a[right];
            if(sum == k){
                System.out.printf("(%d,%d)%n", a[left],a[right]);
                left = left+1;
                right = right-1;
            }
            else if(sum < k){
                left = left+1;
            }
            else if (sum > k){
                right = right -1;
            }
            }
        }
    }








