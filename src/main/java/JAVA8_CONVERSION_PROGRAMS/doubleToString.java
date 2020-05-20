package JAVA8_CONVERSION_PROGRAMS;

public class doubleToString {
    public static void main(String[] args) {
        double dNum = 20.2002;

//        String StrNum = String.valueOf(dNum);
        String StrNum = Double.toString(dNum);
        System.out.println(StrNum);
    }
}
