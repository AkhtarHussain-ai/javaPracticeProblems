package JAVA3_ARRAYS_PROGRAMS;

public class ReverseArray {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1,2,3,4,5};

        int lenght = arr.length;

        int start = 0;
        int end = lenght -1;

        while(start <end){

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        System.out.print("The reverse array is : ");
        for(int i=0;i<lenght;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
