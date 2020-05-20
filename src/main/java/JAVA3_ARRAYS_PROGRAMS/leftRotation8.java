package JAVA3_ARRAYS_PROGRAMS;

public class leftRotation8 {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        int size = arr.length;
        int n =3; //number of rotation

        for(int i=0;i<n;i++){
            int j, first;
            first = arr[0];
            for(j=0;j<size-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j]  = first;
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
