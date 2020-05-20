package JAVA7_SORTING_SEARCHING_PROGRAMS;

public class Sort4_QuickSort {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4,9, 3, 5, 2, 7, 8, 9 };

        Sort4_QuickSort t1 = new Sort4_QuickSort();

        t1.quickSort(numbers,0,numbers.length-1);
        t1.printArray(numbers);

    }

    int partition(int[] a, int start, int end){

        int pivot = a[(start+end)/2];

        while (start <= end) {
            while (a[start] < pivot){
                start++;
            }
            while (a[end] > pivot){
                end --;
            }
            if(start <= end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start ++;
                end --;
            }
        }
        return start;
    }
    void quickSort (int[] a,  int start, int end){
        int pi = partition(a,start,end);
        if(start < pi-1){
            quickSort(a,start,pi-1);
        }
        if(pi < end){
            quickSort(a,pi,end);
        }
    }
    void printArray(int[]a ){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
