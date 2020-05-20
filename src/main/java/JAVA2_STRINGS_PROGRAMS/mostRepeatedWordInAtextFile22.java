package JAVA2_STRINGS_PROGRAMS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mostRepeatedWordInAtextFile22 {
    public static void main(String[] args) throws IOException {

        String line;

        Map<String, Integer> words = new HashMap<>();

        FileReader file = new FileReader("/Users/Akhtar/Projects/IdeaProjects/PracticeTestcom/src/main/resources/stringWords.text");

        BufferedReader br = new BufferedReader(file);

        while ((line = br.readLine()) !=null){
            if(!line.trim().equals("")){
                String[] string = line.toLowerCase().split(" ");

                for(String word:string){
                    if(word == null || word.trim().equals("")){
                        continue;
                    }
                    String processedWord = word.replace("," , "");


                    if (words.containsKey(processedWord)){
                        words.put(processedWord,words.get(processedWord)+1);
                    }
                    else{
                        words.put(processedWord,1);
                    }
                }
            }

        }

        br.close();

        Set<Map.Entry<String,Integer>> hmap = words.entrySet();
        int MaxValue = 0;

        for(Map.Entry<String,Integer> data:hmap){
            if(data.getValue() > MaxValue){
                MaxValue = data.getValue();
            }

        }
        System.out.println("The max length of word is: " + MaxValue);

        for(Map.Entry<String,Integer> data:hmap){
            if(data.getValue() == MaxValue){
                System.out.println("The word is : " + data.getKey());
            }
        }

    }
}
