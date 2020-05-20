package JAVA3_ARRAYS_PROGRAMS;

public class leadersInArray54a {
    public static void leadersArray(int[] a){
        int size = a.length;

        for(int i=0;i<size;i++){

            int j;
            for(j=i+1;j<size;j++){
                if(a[i] <= a[j]){
                    break;
                }
            }
            if(j == size) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        leadersArray(arr);
    }
}
