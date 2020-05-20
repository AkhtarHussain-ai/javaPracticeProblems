package JAVA8_CONVERSION_PROGRAMS;

public class OctalToDecimalConversionIntegerParseIn {
    public static void main(String[] args) {
        String ocnum = "157";

        int num = Integer.parseInt(ocnum,8);
        System.out.println("Decimal equivalent of Octal value 157 is: "+num);
    }
}
