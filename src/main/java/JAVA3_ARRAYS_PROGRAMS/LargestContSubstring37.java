package JAVA3_ARRAYS_PROGRAMS;

public class LargestContSubstring37 {
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2, 1,5,-3};

//        int[] a = {1, 2, 3, -2, 5};


        System.out.println(LargestContSubstring(a,a.length));
    }

    public static int LargestContSubstring(int[] a, int n){
        int max_soFar = a[0] ;
        int max_current = a[0];

        for(int i=1;i<a.length;i++){
            max_current = Math.max(a[i],max_current+a[i]);
            max_soFar = Math.max(max_soFar,max_current);
        }
        return max_soFar;
    }
}
