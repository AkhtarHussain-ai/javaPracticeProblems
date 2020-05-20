package JAVA2_STRINGS_PROGRAMS;

public class longestCommonPrefix44 {
    public static String longestCommonPrefix(String[] a){
        if(a == null || a.length == 0){
            return "";
        }
        String longestComPrefix = a[0];

        for(int i=1;i<a.length;i++){
            int j=0;

            String currentString = a[i];

            while(j<longestComPrefix.length()
                    && j <currentString.length()
                    && longestComPrefix.charAt(j) == currentString.charAt(j)){
                j++;
            }
            if ( j == 0){
                return "";
            }
            longestComPrefix = longestComPrefix.substring(0,j);
        }
        return longestComPrefix;
    }

    public static void main(String[] args) {
        String[] a = {"geeksforgeeks", "geeks", "geek",  "geezer"};

        System.out.println(longestCommonPrefix(a));
    }
}
