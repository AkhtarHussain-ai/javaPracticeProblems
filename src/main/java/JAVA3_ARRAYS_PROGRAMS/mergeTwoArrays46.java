//package JAVA3_ARRAYS_PROGRAMS;
//
//public class mergeTwoArrays46 {
//    public static void main(String[] args) {
//        int[] a = {10};
//        int[] b = {2,3};
//
//        mergeSorted(a,3,b,3);
//
//    }
//    public static void mergeSorted(int[] a,int m,int[] b, int n) {
//
//
//        while (m>=0 && n >=0) {
//            if(a[m] > b[n]){
//                a[count--]  = a[m--];
//            }
//            else {
//                a[count--] = b[n--];
//            }
//
//        }
//        while ( n >=0 ) {
//            a[count--] = b[n--];
//        }
//        for(int num:a){
//            System.out.print(num + " ");
//        }
//
//    }
//}
