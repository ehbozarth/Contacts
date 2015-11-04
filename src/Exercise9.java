import java.util.ArrayList;

/**
 * Created by earlbozarth on 11/4/15.
 */
public class Exercise9 {
    public static void main(String[] args) {

        String [] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList<>();

        for(String name : names){
            int index = 0;
            for(String sortedName : sortedNames){
                if(name.compareTo(sortedName) > 0){
                    index++;
                }
                else{
                    break;
                }
            }//End of Inner For Loop
            sortedNames.add(index, name);
        }//End of Outer For Loop
        System.out.println(sortedNames);

    }//End of Main Method


}//End of Main Class
