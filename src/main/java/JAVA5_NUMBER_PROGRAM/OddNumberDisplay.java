package JAVA5_NUMBER_PROGRAM;

public class OddNumberDisplay {
    public static void main(String[] args) {
        int n=100;
        System.out.println("The odd numbers are: ");
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                System.out.println( i + " " );
            }
        }
    }
}
