package JAVA2_STRINGS_PROGRAMS;

public class replaceLowerCaseWithUpperCaseViceVersa {
    public static void main(String[] args) {

        String str = "This Is a Testing String";
        StringBuffer newString = new StringBuffer(str);


        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                newString.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
            else {
                newString.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(newString);
    }

}
