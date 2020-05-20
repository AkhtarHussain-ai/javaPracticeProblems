package JAVA2_STRINGS_PROGRAMS;
public class ReverseWordsInString6 {
    public void ultaWords(String str){

        String[] words = str.split(" ");
        String reverseString = "";

        for(int i=0; i<words.length;i++){
            String word = words[i];

            String reverseWord = "";
            for(int j= word.length()-1;j>=0;j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println("The String Entered is : " + str);
        System.out.println("The reverse words in the String is : " + reverseString);

    }

    public static void main(String[] args) {
        ReverseWordsInString6 rw = new ReverseWordsInString6();
        rw.ultaWords("Welcome to BeginnersBook");
    }
}


//Output : emocleW ot kooBsrennigeB


/*
        String string = "Welcome to BeginnersBook";
        //Stores the reverse of given string
        String reversedStr = "";

        //Iterate through the string from last and add each character to variable reversedStr
        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        //Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
    }
 */

//Output : kooBsrennigeB ot emocleW