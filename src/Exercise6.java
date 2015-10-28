import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by earlbozarth on 10/28/15.
 */
public class Exercise6 {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList(Arrays.asList("alice","bob","charlie","david","allen","barbie","colin","dan"));

        //Take the first 5 names in
        namesList = new ArrayList(namesList.subList(0,5));
        System.out.println(namesList);

        //Make them upperCase
        ArrayList<String> tempNames = new ArrayList<>();
        for(String upperName : namesList){
            tempNames.add(upperName.toUpperCase());
        }
        namesList = tempNames;
        System.out.println(namesList);

        //Removing names starting with A while looping through list with Iterator
        Iterator<String> it = namesList.iterator();
        while(it.hasNext()){
            String aName = it.next();
            if(aName.startsWith("A")){
                it.remove();
            }
        }

        System.out.println(namesList);

        //Take the first 5 names in one command
        /*
        ArrayList<String> newNamesList = new ArrayList<>();
        int counter = 0;
        for(String name : namesList){
            if(counter < 5){
                newNamesList.add(namesList.get(counter));
            }
            counter++;
        }//End of For Loop

        System.out.println(newNamesList);
        //Make every string inside Uppercase(all letters)
        for(String name: newNamesList){
            String upperName = newNamesList.toString().toUpperCase();
            newNamesList.clear();
            newNamesList.add(upperName);
        }
        System.out.println(newNamesList);
        //Remove ones that start with "A"
        */

    }//End of Main Method

}//End of Exercise6 Class
