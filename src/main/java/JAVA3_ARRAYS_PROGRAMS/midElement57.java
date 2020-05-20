//Given an unsorted array of size N.
// Find the first element in array such that
// all of its left elements are smaller
// and all right elements to it are greater than it.

package JAVA3_ARRAYS_PROGRAMS;

public class midElement57 {
    public static int midNum(int[] a, int n){

        int[] leftMax = new int[n];

        leftMax[0] = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], a[i-1]);
        }

        int rightMin = Integer.MAX_VALUE;

        for(int i= n-1 ;i>=0;i--){
            if(leftMax[i] < a[i]  && rightMin > a[i])
                return i;

            rightMin = Math.min(rightMin,a[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 3, 6, 8, 10, 7, 9};

        System.out.println(midNum(a,a.length));
    }
}
