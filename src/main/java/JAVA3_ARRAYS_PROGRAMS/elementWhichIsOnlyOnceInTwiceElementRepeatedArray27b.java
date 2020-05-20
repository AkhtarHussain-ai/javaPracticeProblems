package JAVA3_ARRAYS_PROGRAMS;

public class elementWhichIsOnlyOnceInTwiceElementRepeatedArray27b {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5};

        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res^ arr[i];
        }
        System.out.println(res);
    }
}
