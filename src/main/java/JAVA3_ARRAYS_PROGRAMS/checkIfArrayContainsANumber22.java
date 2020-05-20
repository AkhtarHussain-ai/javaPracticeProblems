package JAVA3_ARRAYS_PROGRAMS;

public class checkIfArrayContainsANumber22 {
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,6};
        System.out.println(checkPresent(arr,1));

    }
    public static boolean checkPresent(int[] a, int num){
        int size = a.length;

        for(int i=0;i<size;i++){
            if(a[i] == num){
                return true;

            }

        }
        return false;


    }
}
