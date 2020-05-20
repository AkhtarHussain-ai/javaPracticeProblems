package JAVA5_NUMBER_PROGRAM;

public class FindSquareWithoutSqrtMethod {

    public static double squareRoot(double number) {
        double temp;
        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

    public static void main(String[] args) {
        double n = 16;

        double result = squareRoot(n);
        System.out.println(result);
    }
}

