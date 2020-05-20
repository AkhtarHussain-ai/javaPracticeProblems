package JAVA4_RECURSION_PROGRAM;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 542;

        reverseMethod(number);

//        int original = 542;
//        int reverseNumber = 0;
//        int remainder;
//
//        while ((original !=0)){
//            remainder = original%10;
//            reverseNumber = reverseNumber*10 + remainder;
//            original = original/10;
//        }
//
//        System.out.println("The reverse Number is: " + reverseNumber);

    }
    public static void reverseMethod(int originalNumber){
        if(originalNumber<10){
            System.out.print(originalNumber);
            return;
        }
        else {
            System.out.print(originalNumber%10);
            reverseMethod(originalNumber/10);
        }

    }


}
