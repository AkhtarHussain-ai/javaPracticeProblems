package JAVA5_NUMBER_PROGRAM;

public class CheckPositiveNegativeNumbr {
    public static void main(String[] args) {

        int num = 0;
        positiveNegative(num);
    }

    public static void positiveNegative(int n){
        if(n>0){
            System.out.println("Number is positive");
        }
        else if(n<0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is neither postive nor negative");
        }
    }
}
