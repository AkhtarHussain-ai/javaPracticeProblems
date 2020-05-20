package JAVA5_NUMBER_PROGRAM;

public class GcdByEuclidsTheorem {
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 56, b = 98;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}
