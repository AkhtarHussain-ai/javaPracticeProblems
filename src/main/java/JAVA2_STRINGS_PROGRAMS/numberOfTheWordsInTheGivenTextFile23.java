package JAVA2_STRINGS_PROGRAMS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class numberOfTheWordsInTheGivenTextFile23 {
    public static void main(String[] args) throws IOException {

        String line;
        int count =0;

        FileReader file = new FileReader("/Users/Akhtar/Projects/IdeaProjects/PracticeTestcom/src/main/resources/stringWords.text");

        BufferedReader br = new BufferedReader(file);

        while ((line = br.readLine()) !=null){
            if(!line.trim().equals("")) {
                line.replace(",","");
                String[] string = line.toLowerCase().split(" ");
                count = count + string.length;
            }
        }
        System.out.println("Total number of words: " + count);
    }
}
