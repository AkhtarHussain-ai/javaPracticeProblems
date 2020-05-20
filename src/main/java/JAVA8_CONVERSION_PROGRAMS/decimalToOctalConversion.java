package JAVA8_CONVERSION_PROGRAMS;

public class decimalToOctalConversion {
    public static void main(String[] args) {
        int n=123;

        String octalNumber = Integer.toOctalString(n);

        System.out.println("The Octal number is : " + octalNumber);
    }

}
