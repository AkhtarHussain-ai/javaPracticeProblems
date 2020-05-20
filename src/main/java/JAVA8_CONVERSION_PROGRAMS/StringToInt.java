package JAVA8_CONVERSION_PROGRAMS;

public class StringToInt {
    public static void main(String[] args) {
        String str="123";
        int inum = 100;

        /* converting the string to an int value
         * ,the value of inum2 would be 123 after
         * conversion
         */
        int inum2 = Integer.parseInt(str);

        int sum = inum+inum2;
        System.out.println("Result is: "+sum);
    }
}
