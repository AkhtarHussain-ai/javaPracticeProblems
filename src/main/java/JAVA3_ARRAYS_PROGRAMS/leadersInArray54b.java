package JAVA3_ARRAYS_PROGRAMS;

public class leadersInArray54b {
    public static void leadersArr(int[] a){
        int size = a.length;
        int max_from_right = a[size-1];
        System.out.print(max_from_right + " ");

        for(int i=size-2;i>=0;i--){
            if(max_from_right < a[i]){
                max_from_right = a[i];
                System.out.print(max_from_right + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};

        leadersArr(arr);
    }
}
