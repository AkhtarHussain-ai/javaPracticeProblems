package JAVA5_NUMBER_PROGRAM;

public class GcdOrHCF {
    public static void main(String[] args) {
        int num1=4, num2=8, gcd=1;

        for (int i=1; i<=num1 && i<=num2;i++){
            if(num1%i ==0 && num2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
