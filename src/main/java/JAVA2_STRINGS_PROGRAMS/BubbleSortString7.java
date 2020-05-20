package JAVA2_STRINGS_PROGRAMS;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortString7 {
    public static void main(String[] args) {
        String temp;
        String[] str = {"Ajeet", "Steve", "Rick", "Becky", "Mohan"};
        int count = str.length;

        for(int i =0 ; i<count ; i++){
            for(int j = i+1; j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("The Sorted String is: ");
        for (int i=0;i<count;i++){
            System.out.print(str[i] + ", ");
        }
    }
}
