import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by earlbozarth on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        //Remove commas and periods
        sentence = sentence.replace(",", "").replace(".", "");
        //Make it all lower case
        sentence = sentence.toLowerCase();
        //Split into words
        String [] words = sentence.split(" ");

        ArrayList<String> newWords = new ArrayList();

        for(String word : words){
            if(!newWords.contains(word)){
                newWords.add(word);
            }//End of if
        }//End of for Loop

        //Create new string without duplicate words
        String newSentence = "";
        for(String newWord : newWords){
            if(!newSentence.isEmpty()){
                newSentence += " ";
            }
            newSentence += newWord;
        }
        System.out.println(sentence);


    }//End of Main Method
}//End of Exercise 5 Class
