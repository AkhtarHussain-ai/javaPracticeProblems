package JAVA3_ARRAYS_PROGRAMS;

import java.util.PriorityQueue;

public class kthLargestElement14 {
    public static int kthElement(int[] a,int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i:a){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,24,5,666,333,222};

        System.out.println(kthElement(arr,3));
    }


}
