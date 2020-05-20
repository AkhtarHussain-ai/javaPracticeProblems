package Java11_HackerRankProblems;

public class h3HackerAVeryBigSum {
    public static long aVeryBigSum(long[] a){
        long result =0;
        for(int i=0;i<a.length;i++){
            result += a[i];
        }
        return result;
    }
}
