package JAVA3_ARRAYS_PROGRAMS;

public class moveAllZeroToEnd36 {
    public static void main(String[] args) {
        int[] a = {1,0,3,0,4,0,6,0,9};
//
        int size = a.length;
        pushZerosToEnd(a,size);
        for(int n:a){
            System.out.print(n + " ");
        }
//        for(int i=0;i<size;i++) {
//            for(int j=i+1;j<size;j++){
//                if(a[i] == 0 && a[j] !=0){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for(int n:a){
//            System.out.print(n + " ");
//        }

    }

    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }
}
