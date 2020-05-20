
//Recursively remove all adjacent duplicates

package JAVA3_ARRAYS_PROGRAMS;

public class removeAdjacentDuplicate63 {
    public static String duplicateCharacter(String s){
        String str1 = new String();
        int i;

        for(i=1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                str1 += s.charAt(i-1);
            }
            else {
                while (i <s.length() && s.charAt(i) == s.charAt(i-1)){
                    i++;
                }
            }
        }
        //for last character

        if( i == s.length() && s.charAt(i-1) != s.charAt(i-2)){
            str1 += s.charAt(i-1);
        }

        if(checkDuplicate(str1)){
            return duplicateCharacter(str1);
        }
        return str1;
    }

    public static boolean checkDuplicate(String str1){
        for(int i=1;i<str1.length();i++){
            if(str1.charAt(i) == str1.charAt(i-1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCharacter("MISSISSIPIE"));
    }
}




//class test2 {
//    public static String checkDuplicate(String S){
//
//        int size = S.length();
//        int j=0;
//
//        char[]   chArr = new char[size];
//        for(int i=0;i<size;i++){
//            char current_char = S.charAt(i);
//            if(j > 0 && chArr[j-1] == current_char){
//                j--;
//            }
//            else {
//                chArr[j] = current_char;
//                j ++;
//            }
//
//        }
//
//        return new String(chArr,0,j);
//    }
//
//    public static void main(String[] args) {
//        String s = "abbaca";
//        System.out.println(checkDuplicate(s));
//    }
//}

