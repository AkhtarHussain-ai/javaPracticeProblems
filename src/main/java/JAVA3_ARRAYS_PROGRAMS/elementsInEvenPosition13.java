package JAVA3_ARRAYS_PROGRAMS;

public class elementsInEvenPosition13 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6};
        int size = arr.length;

        for(int i=1;i<size;i=i+2){      // for odd numbers : int i=0;i<size;i=i+2)
            System.out.println(arr[i] + " ");
        }
    }
}
