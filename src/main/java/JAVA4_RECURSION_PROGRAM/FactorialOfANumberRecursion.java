package JAVA4_RECURSION_PROGRAM;

public class FactorialOfANumberRecursion {
    public static void main(String[] args) {
        double number = .46;

        if(number >=0) {
            double factorial = fact(number);
            System.out.println(factorial);
        }
        else if( number < 1){
            double PositiveNum = Math.abs(number);
            double factorial = fact(PositiveNum);
            System.out.print("-" + factorial);
        }
        else {
            System.out.println("Please enter a Numeric value");
        }


    }
    static double fact(double n){
        double output;
        if( n ==0 || n == 1) {
            return 1;
        }

        output = fact(n-1)*n;

        return output;
    }


}

