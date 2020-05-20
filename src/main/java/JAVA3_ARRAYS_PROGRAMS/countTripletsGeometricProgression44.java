package JAVA3_ARRAYS_PROGRAMS;

import java.util.*;

public class countTripletsGeometricProgression44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of the arrayList");
        long n = sc.nextLong();

        System.out.println("Enter the Geometric Progression value");
        long r = sc.nextLong();
        List<Long> arr = new ArrayList<>();
        System.out.println("Please enter the value one by one");
        while (n-- > 0) {
            arr.add(sc.nextLong());
        }

        System.out.println("Total count is: " + gp(arr,arr.size(),r));

    }


    public static long gp(List<Long> a, long size, long r) {

        Map<Long, Long> rightMap = new HashMap<>();
        Map<Long, Long> leftMap = new HashMap<>();

        for (long item : a) {
            rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
        }

        long count = 0;
        for(int i=0;i<size;i++){
            long c1=0,c2=0;
            long midTerm = a.get(i);
            rightMap.put(midTerm,rightMap.getOrDefault(midTerm,0L) -1);
            if(leftMap.containsKey(midTerm/r) && midTerm%r ==0){
                c1 = leftMap.get(midTerm/r);
            }

            if(rightMap.containsKey(midTerm*r)){
                c2 = rightMap.get(midTerm*r);
            }

            count += c1*c2;

            leftMap.put(midTerm,leftMap.getOrDefault(midTerm,0L)+1);

        }

        return count;

    }
}
