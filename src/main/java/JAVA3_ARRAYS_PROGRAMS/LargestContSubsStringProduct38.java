package JAVA3_ARRAYS_PROGRAMS;

public class LargestContSubsStringProduct38 {
    public static void main(String[] args) {
        int[] a = {2,3,-2,4};

        System.out.println(LargestContSubstringProduct(a,a.length));
    }

    public static int LargestContSubstringProduct(int[] a, int n){
        int max_soFar = a[0] ;
        int max_current = a[0];

        for(int i=1;i<a.length;i++){
            max_current = Math.max(a[i],max_current*a[i]);
            max_soFar = Math.max(max_soFar,max_current);
        }
        return max_soFar;
    }

}
