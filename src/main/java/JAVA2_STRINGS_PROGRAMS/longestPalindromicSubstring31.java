package JAVA2_STRINGS_PROGRAMS;

public class longestPalindromicSubstring31 {
    public static void main(String[] args) {
        String s = "abcddcbagoodteacher";

        System.out.println(longestString(s));

    }

    public static String longestString(String s){
        int length = s.length();
        int left = 0;
        int right = 0;

        if(s == null || length < 2){
            return s;
        }

        boolean[][] isPalindrome = new boolean[length][length];

        for(int j=1;j<length;j++){
            for(int i=0; i<j ;i++){
                boolean innerWordPlaindrome = isPalindrome[i+1][j-1] || (j-i) <=2;

                if(s.charAt(i) == s.charAt(j) && innerWordPlaindrome){
                    isPalindrome[i][j] = true;
                    if(j-i > right-left){
                        left = i;
                        right = j;
                    }
                }

            }
        }
        return s.substring(left, right+1);

    }
}
