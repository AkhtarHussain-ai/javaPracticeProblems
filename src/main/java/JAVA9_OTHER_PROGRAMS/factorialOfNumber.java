package JAVA9_OTHER_PROGRAMS;

public class factorialOfNumber {
    public static void main(String[] args) {
        int number = 5;
        int fact =1;

        for(int i=1;i<=5;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
