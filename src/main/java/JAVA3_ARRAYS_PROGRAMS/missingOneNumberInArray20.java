package JAVA3_ARRAYS_PROGRAMS;

public class missingOneNumberInArray20 {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4,5,7};

        int  xor1 = arr[0];

        for(int i=1;i<arr.length;i++){
            xor1 = xor1 ^ arr[i];
        }

        int xor2 = 1;

        for(int j=2; j<=arr.length+1;j++){
            xor2 = xor2 ^ j;
        }
        System.out.println("The missing number is : " + (xor1 ^ xor2));
    }
}
