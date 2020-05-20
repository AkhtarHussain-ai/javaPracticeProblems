package Java11_HackerRankProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class h2HackerCompareTriplets {
//    public static void triplets(int[] a, int[] b, int[] f){
////            int aTotal=0,bTotal=0;
////        for(int i=0;i<a.length;i++){
////            if(a[i] > b[i]){
////                aTotal++;
////            }
////            else if(b[i] > a[i]){
////                bTotal++;
////            }
////            }
////         f[0] = aTotal;
////         f[1] = bTotal;
////        System.out.println(Arrays.toString(f));
////        }
////
////    public static void main(String[] args) {
////        int[] a = {17, 28, 30};
////        int[] b = {99,16, 8};
////
////        int[] f = new int[2];
////
////        triplets(a,b,f);
////    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aTotal=0,bTotal=0;
        List<Integer> resultList = new LinkedList<>();
        for(int i=0;i<a.size();i++){
            if(a.get(i) > b.get(i) ){
                aTotal++;
            }
            else if(b.get(i) > a.get(i)){
                bTotal++;
            }
        }
        resultList.add(aTotal);
        resultList.add(bTotal);

        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new LinkedList<>();
        b.add(99);
        b.add(16);
        b.add(8);

        System.out.println("The final List is: " + compareTriplets(a,b));
    }

    }

