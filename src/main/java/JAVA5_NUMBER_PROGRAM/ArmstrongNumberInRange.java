package JAVA5_NUMBER_PROGRAM;

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        for(int i=10; i<=1000;i++){
           ArmStrng(i);
        }

    }

    public static void ArmStrng(int n) {
        int temp1, temp2, lenght = 0;

        temp1 = n;
        while (temp1 != 0) {
            temp1 = temp1 / 10;
            lenght = lenght + 1;
        }


        temp2 = n;
        int arm = 0;

        while (temp2 != 0) {
            int remainder = temp2 % 10;
            int mul = 1;
            for (int i = 1; i <= lenght; i++) {
                mul = mul * remainder;
            }
            arm = arm + mul;
            temp2 = temp2 / 10;

        }
        if (arm == n) {
            {
                System.out.println(arm);

            }

        }
    }
}
