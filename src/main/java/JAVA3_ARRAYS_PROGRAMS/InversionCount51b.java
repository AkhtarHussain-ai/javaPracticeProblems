package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class InversionCount51b {
    public static int mergeCount(int[] a, int leftIndex,int mid, int rightIndex){

        int[] leftArray = Arrays.copyOfRange(a,leftIndex,mid+1);
        int[] rightArray = Arrays.copyOfRange(a,mid+1,rightIndex+1);

        int i=0, j=0,k=leftIndex,swap=0;

        while (i<leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
                swap = swap + (mid+1) - (leftIndex+i);
            }
        }
        while (i<leftArray.length){
            a[k++] = leftArray[i++];
        }
        while (j<rightArray.length){
            a[k++] = rightArray[j++];
        }
        return swap;
    }

    public static int mergeSortCount(int[] a, int leftIndex, int rightIndex )
    {

        int count = 0;
        if(leftIndex < rightIndex){
            int mid = (leftIndex+rightIndex) / 2;
            count += mergeSortCount(a,leftIndex,mid);
            count += mergeSortCount(a,mid+1,rightIndex);
            count += mergeCount(a,leftIndex,mid,rightIndex);

        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6,7,5,8,11,3};

        System.out.println(mergeSortCount(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));
    }
}
