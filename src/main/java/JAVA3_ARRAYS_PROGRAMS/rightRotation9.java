package JAVA3_ARRAYS_PROGRAMS;

public class rightRotation9 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4,5};

        int size = arr.length;
        int n = 3   ;

        for (int i=0;i<n;i++){
            int j,last;
            last= arr[size-1];
            for(j=size-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = last;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

    }
}


// Most efficient solution:

/*
public class test {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};
        int d = 1;

        int res[] = rotation(arr,d);
        System.out.println(Arrays.toString(res));


    }
    public static int[] rotation(int[] a,int d){
        int n = a.length;
        int[] rotatedArray = new int[n];

        for(int oldIndex = 0; oldIndex<n; oldIndex++){
            int newIndex = (oldIndex + d)%n ;  // if they have mentioned as left rotation: int newIndex = (oldIndex + (n-d))%n
            rotatedArray[newIndex] = a[oldIndex];
        }
        return rotatedArray;
    }
}
 */