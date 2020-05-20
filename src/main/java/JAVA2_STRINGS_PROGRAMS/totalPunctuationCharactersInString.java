package JAVA2_STRINGS_PROGRAMS;

public class totalPunctuationCharactersInString {
    public static void main(String[] args) {

        String str = "This is my house, May I know where u live?";
        punctuationCount(str);
    }

    public static void punctuationCount(String string){
        int count=0;
        int length = string.length();

        for (int i=0; i<length;i++){
            if (string.charAt(i) == '.' || string.charAt(i) == ',' || string.charAt(i) == '/'
                    || string.charAt(i) == ':' ||string.charAt(i) == ';' || string.charAt(i) == '"' ||
                    string.charAt(i) == '[' ||string.charAt(i) == ']' || string.charAt(i) == '?'){
                count++;
            }
        }
        System.out.println("The total number of punctuation character is: " + count);
    }
}
