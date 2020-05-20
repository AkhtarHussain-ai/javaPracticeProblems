package JAVA3_ARRAYS_PROGRAMS;

public class sortElementsInArrayAsc16 {
    public static void main(String[] args) {
        int [] arr = new int [] {5, 2, 8, 7, 1};

        int size = arr.length;
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted array in ascsending order is: ");

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
