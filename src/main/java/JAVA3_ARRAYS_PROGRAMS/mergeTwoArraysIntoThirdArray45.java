package JAVA3_ARRAYS_PROGRAMS;

public class mergeTwoArraysIntoThirdArray45 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 2,3, 4};

        mergeSorted(a,a.length,b,b.length);

    }
    public static void mergeSorted(int[] a,int n,int[] b, int m) {
        int i = 0;
        int j = 0;
        int count = 0;
        int[] c = new int[n + m];

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[count++] = a[i++];
            } else {
                c[count++] = b[j++];
            }
        }
        while (i < n) {
            c[count++] = a[i++];
        }
        while (j < m) {
            c[count++] = b[j++];
        }

        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}
