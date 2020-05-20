package JAVA5_NUMBER_PROGRAM;
public class PrimeNumberFirst100 {
    public static void main(String[] args) {

        for(int j =2;j<=100;j++)  {
            int temp =0;
            for (int i=2; i<=j-1; i++){

                if (j%i == 0){
                    temp = temp +1;

                }
            }
            if(temp == 0){
                System.out.println(j);
            }

        }

    }

}



