package JAVA3_ARRAYS_PROGRAMS;

public class EquilibriumPoint53a {
    public static void main(String[] args) {

        int[] a = {-7, 1, 5, 2, -4, 3, 0};

        int size = a.length;

        System.out.println(equiPoint(a,size));

    }

    public static int equiPoint(int[]a , int size){

        for(int i=0;i<size;i++){

            int leftSum =0;
            for(int j=0;j<i;j++){
                leftSum += a[j];
            }
            int rightSum = 0;
            for(int k =i+1;k<size;k++){
                rightSum +=a[k];
            }
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

}
