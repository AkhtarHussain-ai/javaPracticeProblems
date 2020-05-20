package JAVA5_NUMBER_PROGRAM;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        int num = 10;
        sumOfNatural(num);

    }
    public static void sumOfNatural(int n){
        int count,total=0;
        for(count=1; count<=n;count++){
            total = total + count;
        }
        System.out.println("The sum of the number is: " + total);
    }
}
