import java.util.ArrayList;

/**
 * Created by earlbozarth on 10/14/15.
 */
public class Exercise {

    public static void main(String[] args) {
        /*
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        nameList.add("Austin");
        */
        String [] nameList = new String []{"Alice", "Bob", "Charlie", "Austin"};

        for(String name : nameList){

            if(name.startsWith("A")){
                System.out.println(name);
            }//End of if name starts with A

        }//End of for loop

    }//End of Main method

}//End of Exercise Class
