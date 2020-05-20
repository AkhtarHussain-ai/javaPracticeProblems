package JAVA9_OTHER_PROGRAMS;

public class DisplayFibonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,c;
        int count = 10;

        for(int i=1;i<=count;i++){
            System.out.println(a+ " ");
            c = a+b;
            a=b;
            b=c;
        }
    }
}

