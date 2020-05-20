package JAVA5_NUMBER_PROGRAM;

public class SumOfNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        int num =10, count=1 , total =0;

        while(count <=num){
            total = total + count;
            count++;
        }
        System.out.println("The total of the number is: " + total);
    }
}
