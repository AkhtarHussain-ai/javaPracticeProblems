package JAVA8_CONVERSION_PROGRAMS;

public class OctalToDecimalWritingCustomCode {
    public static int octalToDecimal(int onum){
        //initializing the decimal number as zero
        int num = 0;
        //This value will be used as the power
        int p = 0;
        while(true){
            if(onum == 0){
                break;
            } else {
                int temp = onum%10;
                num += temp*Math.pow(8, p);
                onum = onum/10;
                p++;
            }
        }
        return num;
    }
    public static void main(String args[]){
        System.out.println("Decimal equivalent of octal value 143: "+octalToDecimal(143));
    }
}
