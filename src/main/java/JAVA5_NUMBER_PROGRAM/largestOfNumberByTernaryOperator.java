package JAVA5_NUMBER_PROGRAM;

public class largestOfNumberByTernaryOperator {
    public static void main(String[] args) {
        int a = 4, b= 98, c=110;
        largestOfThreeNumbers(a,b,c);
    }

    public static void largestOfThreeNumbers(int n1, int n2, int n3){

        int result = (n1>n2) ? (n1>n3 ? n1:n3) : (n2>n3 ? n2:n3);
        System.out.println("The largest number is: " + result);
    }
}
