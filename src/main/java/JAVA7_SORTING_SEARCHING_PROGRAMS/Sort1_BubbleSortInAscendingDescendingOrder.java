package JAVA7_SORTING_SEARCHING_PROGRAMS;

// BubbleSort: TimeComplexity , O(n*n)
public class Sort1_BubbleSortInAscendingDescendingOrder {
    public static void main(String[] args) {
        int[] n = {5,4,3,2,1,0};
        bubbleSorted(n);

    }
    public static void bubbleSorted(int[] arr){
        int temp;
        int length = arr.length;

        for(int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if(arr[i]> arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        System.out.print("The numbers in ascending order is: ");
       for(int i=0;i<length;i++){
           System.out.print(arr[i] + " ");
       }
        System.out.println();
        System.out.print("The numbers in descending order is: ");
        for(int i=length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }

    }
}
