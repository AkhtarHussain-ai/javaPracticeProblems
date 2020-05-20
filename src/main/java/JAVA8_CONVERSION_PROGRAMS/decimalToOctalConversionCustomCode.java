package JAVA8_CONVERSION_PROGRAMS;

public class decimalToOctalConversionCustomCode {
    public static void main(String[] args) {
        int n = 123;
        // For storing remainder
        int rem;

        // For storing result
        String str="";

        // Digits in Octal number system
        char dig[]={'0','1','2','3','4','5','6','7'};

        while(n>0)
        {
            rem=n%8;
            str=dig[rem]+str;
            n=n/8;
        }
        System.out.println("Decimal to octal: "+str);
    }

}
