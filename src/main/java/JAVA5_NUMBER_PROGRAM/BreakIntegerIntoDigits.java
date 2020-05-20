package JAVA5_NUMBER_PROGRAM;

public class BreakIntegerIntoDigits {
    public static void main(String[] args) {
        int num = 56467, temp, digit,count=0;

        temp = num;
        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.println("Digit at place "+count+" is: "+digit);
            temp = temp / 10;
            count--;
        }
    }
}
