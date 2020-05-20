package JAVA8_CONVERSION_PROGRAMS;

public class StringToLong {
    public static void main(String[] args) {
        {
            String str = "21111";
            String str2 = "-11111";

            //Conversion using parseLong(String) method
            long num = Long.parseLong(str);
            long num2 = Long.parseLong(str2);
            System.out.println(num+num2);
        }
    }
}
