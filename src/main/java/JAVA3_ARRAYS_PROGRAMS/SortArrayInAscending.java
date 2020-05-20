package JAVA3_ARRAYS_PROGRAMS;

public class SortArrayInAscending {
    public static void main(String[] args) {
        int temp;
        int[] arr = {20,40,1,0,10,100,90};

        int lenght = arr.length;

        for(int i=0;i<lenght;i++){
            for(int j= i+1; j<lenght ;j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("The array in ascending order is : ");
        for(int i=0; i<lenght;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
