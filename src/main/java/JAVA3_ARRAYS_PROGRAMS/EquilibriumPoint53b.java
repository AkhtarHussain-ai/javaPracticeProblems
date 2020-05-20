package JAVA3_ARRAYS_PROGRAMS;

public class EquilibriumPoint53b {
    public static int equiPoint(int[] a){
        int sum =0;
        int leftSum = 0;

        for(int i=0;i<a.length;i++){
            sum += a[i];
        }

        for(int i=0;i<a.length;i++){
            sum -= a[i];

            if(leftSum == sum){
                return i;
            }

            leftSum += a[i];
        }
        return -1;

    }

    public static void main(String[] args) {
//        int[] a = {-7, 1, 5, 2, -4, 3, 0};
        int[] a = {5,2,3};

        System.out.println(equiPoint(a));
    }
}
