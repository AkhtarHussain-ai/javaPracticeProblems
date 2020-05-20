package JAVA5_NUMBER_PROGRAM;

public class PerfectSqaureOrNot {
    public static void main(String[] args) {
        double n = 9;

        perfectSqaure(n);

    }

 public static void perfectSqaure(double n){
        double sq = Math.sqrt(n);

        if (sq - Math.floor(sq)==0){
            System.out.println(n+ " is a perfect sqaureRoot");
        }
        else
        {
            System.out.println(n+" is not a perfect squareroot");
        }

 }
}
