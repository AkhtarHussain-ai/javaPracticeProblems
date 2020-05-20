package JAVA3_ARRAYS_PROGRAMS;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class longestConsecutiveLength39 {
    public static void main(String[] args) {
        int[] a = {3,9,1,10,4,20,2};
        System.out.println(longestConsecutiveSubSequence(a,a.length));

    }

    public static int longestConsecutiveSubSequence(int[] a, int n){
        HashSet<Integer> hs = new LinkedHashSet<>();

        for(int num:a){
            hs.add(num);
        }
        int longest_length =1;
        for(int i=0;i<a.length;i++){

            if(!hs.contains(a[i] -1)){
                int no = a[i];
                while (hs.contains(no)){
                    no++;
                }
                if(longest_length < no-a[i]){
                    longest_length = no-a[i];
                }
            }
        }
        return longest_length;
    }
}
