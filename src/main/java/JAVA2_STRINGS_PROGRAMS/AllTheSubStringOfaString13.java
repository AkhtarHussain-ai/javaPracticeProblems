package JAVA2_STRINGS_PROGRAMS;

public class AllTheSubStringOfaString13 {
    public static void main(String[] args) {

        String str = "FUN";

        int lenght = str.length();

        int totalSubString = (lenght*(lenght+1))/2;

        String[]  arr = new String[totalSubString];
        int temp=0;

        for(int i=0; i<lenght;i++){
            for(int j=i; j<lenght;j++){
                arr[temp] = str.substring(i,j+1);
                temp++;
            }
        }
        System.out.print("Total Substring are as follows: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

