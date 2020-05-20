package JAVA2_STRINGS_PROGRAMS;

public class sortedStringOnLength29 {
    public static void main(String[] args) {
        String[] string = {"abc", "abcd", "ab"};
        String temp;
        int count = string.length;

        for(int i=0;i<count;i++){
            for (int j = i+1;j<count;j++){
                if(string[i].length() > string[j].length()) {
                    temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }
            }
        }

        System.out.print("the sorted string is: ");
        for (int i=0;i<count;i++){
            System.out.print(string[i] + " ");
        }
    }
}
