package JAVA5_NUMBER_PROGRAM;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        ArmStrng(num);

    }

    public static void ArmStrng(int n){
        int temp1,temp2, lenght=0;
        temp1 = n;

        while (temp1!=0){
            temp1 = temp1/10;
            lenght = lenght+1;
        }


        temp2 = n;
        int arm =0;

        while(temp2!=0){
            int remainder = temp2%10;
            int mul=1;
            for(int i=1;i<=lenght;i++){
                mul = mul* remainder;
            }
            arm = arm+ mul;
            temp2 = temp2/10;
        }
        if (arm == n) {
            System.out.println( n + " is a Armstrong Number as sum of its length root of each number is equal to " + arm);
        }
        else{
            System.out.println("The Entered Number is not Armstrong " );
        }

    }


}
