package JAVA3_ARRAYS_PROGRAMS;

public class rearrangeAlternativelyWithoutExtraSpace49 {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] a = {1,2,3,4,5};

        int size = a.length;
        int max_element = a[size-1] + 1;
        int small = 0;
        int large = size-1;

        for(int i=0;i<size;i++){
            if(i%2 == 0){
                a[i] = a[i]+ (a[large]) * max_element;
                large --;
            }
            else {
                a[i] = a[i] + (a[small]) * max_element;
                small ++;
            }

        }

        for(int i=0;i<size;i++){
            System.out.print(a[i]/max_element + " ");
        }

    }
}
