package JAVA9_OTHER_PROGRAMS;

public class PascalsTriangle {
    public static void main(String[] args) {
        int value;
        for(int i=0;i<5;i++){

            for(int s=0;s<4-i;s++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                value = binomial(i,j);
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

    public static int binomial(int row,int column){
        if(column ==0 || row ==column){
            return 1;
        }
        else {
            return (binomial(row-1,column-1) + binomial(row-1,column));
        }
    }
}
