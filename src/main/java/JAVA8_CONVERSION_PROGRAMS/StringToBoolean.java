package JAVA8_CONVERSION_PROGRAMS;

public class StringToBoolean {
    public static void main(String[] args) {
        String str1 = "True";
        String str2 = "False";
        String str3 = "Something";

        Boolean bool1 = Boolean.parseBoolean(str1);
        Boolean bool2 = Boolean.parseBoolean(str2);
        Boolean bool3 = Boolean.parseBoolean(str3);

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
    }
}
