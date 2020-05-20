package JAVA3_ARRAYS_PROGRAMS;


public class CalculateAverageUsingArray {
    public static void main(String[] args) {
        double[] arr = {20,30,40,50.23};
        double average =0;
        double total = 0;

        for (int i=0; i <arr.length;i++)
        {
            total = total + arr[i];
        }
        average = total/arr.length;

        System.out.format("The Average of the array is : %.3f", average);
    }
}
