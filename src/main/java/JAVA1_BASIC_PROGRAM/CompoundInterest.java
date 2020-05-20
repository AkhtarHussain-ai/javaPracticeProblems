package JAVA1_BASIC_PROGRAM;

public class CompoundInterest
{
    public void calculateCompoundInterest(int p, int t, double r, int n){
        double amount = p* Math.pow(1+r/n, n*t);
        double cInterest = amount - p;
        System.out.println("The total amount Rs " + amount);
        System.out.println("The compound interest Rs " + cInterest);
    }

    public static void main(String[] args) {
        CompoundInterest  obj = new CompoundInterest();
        obj.calculateCompoundInterest(2000,5,.08, 12);

    }
}
