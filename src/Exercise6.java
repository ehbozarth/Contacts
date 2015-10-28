import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by earlbozarth on 10/28/15.
 */
public class Exercise6 {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList(Arrays.asList("alice","bob","charlie","david","allen","barbie","colin","dan"));

        //Take the first 5 names in
        namesList = new ArrayList(namesList.subList(0,5));
        solveViaTempLists(namesList);
        solveViaDirectModification(namesList);
        solveViaStream(namesList);

    }//End of Main Method

    static void solveViaDirectModification(ArrayList<String> namesList){
        //Make every String upperCase
        for(int i = 0; i< namesList.size();i++){
            String s = namesList.get(i).toUpperCase();
            namesList.set(i,s);
        }//End of for loop

        //Removing names starting with A while looping through list with Iterator
        Iterator<String> it = namesList.iterator();
        while(it.hasNext()){
            String aName = it.next();
            if(aName.startsWith("A")){
                it.remove();
            }
        }//End of While Loop

        System.out.println("Direct: " + namesList);

    }//End of solveViaDirectModification

    static void solveViaTempLists(ArrayList<String> namesList){
        //Make every string inside Uppercase
        ArrayList<String> tempNames = new ArrayList<>();
        for(String upperName : namesList){
            tempNames.add(upperName.toUpperCase());
        }//End of For Loop
        namesList = tempNames;

        //Remove the ones that start with "A"
        tempNames = new ArrayList<>();
        for(String aName : namesList){
            if(!aName.startsWith("A")){
                tempNames.add(aName);
            }
        }//end of For Loop
        namesList = tempNames;

        System.out.println("Temp: " + namesList);
    }//End of solveViaTempLists


    static void solveViaStream(ArrayList<String> nameList){
        List<String> newNamesList =
                nameList
                .stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name)->{
                    return !name.startsWith("A");
                })
                .collect(Collectors.toList());

        System.out.println("Stream: " + newNamesList);
    }//End of solveViaStream

}//End of Exercise6 Class
