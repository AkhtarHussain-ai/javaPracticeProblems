//Find last index of a character in a string

package JAVA3_ARRAYS_PROGRAMS;

public class LastIndexOfCharacter59 {
    public static int lastIndex(String str, Character x){
        for(int i= str.length()-1;i>=0;i--){
            if(str.charAt(i) == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        Character x = 'e';
        int index = lastIndex(str,x);
        if( index == -1){
            System.out.println("Character not found");
        }
        else {
            System.out.println(" Last index: " + index);
        }
    }
}
