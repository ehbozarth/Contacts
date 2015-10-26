import java.util.HashMap;

/**
 * Created by earlbozarth on 10/26/15.
 */
public class Exercise4 {

    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question";
        HashMap<String, Integer> frequencies = new HashMap<>();
        String [] words = sentence.split(" ");

        for(String word : words){
            String cleanedWord = word.toLowerCase().replace(",", "");
            if(frequencies.get(cleanedWord) == null){
                frequencies.put(cleanedWord, 1);
            }//End of If
            else{
                int counter = frequencies.get(cleanedWord);
                frequencies.put(cleanedWord, (counter +1));
            }//End of Else
        }//End of for Loop

        System.out.println(frequencies);
    }//End of Main Method

}//End of Exercise4 Class
