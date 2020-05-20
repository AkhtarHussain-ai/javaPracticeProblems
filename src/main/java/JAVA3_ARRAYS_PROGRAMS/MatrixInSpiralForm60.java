//Given a matrix mat[][] of size M*N. Traverse and print the matrix in spiral form.
package JAVA3_ARRAYS_PROGRAMS;

public class MatrixInSpiralForm60 {
    public static void spiralMatrix(int m, int n, int a[][]){
        int i, k=0,l=0;

        int last_row = m-1, last_col = n-1;

        while (k<m && l < n){

            for(i=l;i<n;i++){
                System.out.print(a[k][i]+" ");
            }
            k++;

            for(i=k;i<m;i++){
                System.out.print(a[i][last_col]+ " " );
            }
            n--;

            if(k<m){
                for(i=n-1;i>=l;i--){
                    System.out.print(a[last_row][i]+" ");
                }
                m--;
            }

            if(l<=n){
                for(i=m-1;i>=k;i--){
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }

    }

    public static void main(String[] args) {
        int R = 3;
        int C = 6;

        int a[][] = {{1,  2,  3,  4,  5,  6},
                     {7,  8,  9,  10, 11, 12},
                     {13, 14, 15, 16, 17, 18}};

        spiralMatrix(R,C,a);
    }
}


/*
public class test10{
  public static void mat(int m , int n, int[][] a){

      int i, start_row =0, start_col = 0;

      int last_row = m-1;
      int last_col = n-1;

      while(start_row <= last_row && start_col <=last_col){

          for(i=start_col;i<=last_col;i++){
              System.out.print(a[start_row][i] + " ");
          }
          start_row++;

          for( i = start_row ;i<=last_row;i++){
              System.out.print(a[i][last_col] + " ");
          }
          last_col--;

          while(start_row < last_row){
              for(i = last_col ;i >=start_col;i-- ){
                  System.out.print(a[last_row][i] + " ");
              }
              last_row--;
          }
          while (start_col <=last_col ){
              for(i = last_row;i>=start_row;i--){
                  System.out.print(a[i][start_col] + " ");
              }
              start_col++;

          }

      }

  }

    public static void main(String[] args) {
        int R = 3;
        int C = 6;

        int a[][] = {{1,  2,  3,  4,  5,  6},
                     {7,  8,  9,  10, 11, 12},
                     {13, 14, 15, 16, 17, 18}};

        mat(R,C,a);
    }
 }
 */