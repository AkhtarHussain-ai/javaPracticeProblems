package JAVA5_NUMBER_PROGRAM;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int num1=3, num2=8, num3=1;
        largestThreeNumbers(num1,num2,num3);

    }

    public static void largestThreeNumbers(int n1, int n2, int n3){
        if(n1>=n2 && n1>=n3){
            System.out.println(n1 + " is the largest Number");
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println( n2 + " is the largest Number");
        }
        else{
            System.out.println( n3 + " is the largest Number");
        }
    }
}
