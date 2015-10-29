import java.util.*;

/**
 * Created by earlbozarth on 10/29/15.
 */

public class Exercise7 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones","hi"};
        //Reverse The Array --> Jones, Charlie, Brown,etc
        //List<String> reverseList = Arrays.asList(names);
        //Collections.reverse(reverseList);

        ArrayList<String> newNames2 = new ArrayList<>();
        for(int i = names.length - 1; i >=0; i --){
            newNames2.add(names[i]);
        }

        System.out.println(newNames2);


        //Convert Array into HashMap
        //(Jones:Charlie, Brown:Bob, Smith:Alice)
        HashMap m = new HashMap();
        for(int i = 0; i < names.length; i+=2){
            try{
                m.put(names[i], names[i + 1]);
            }
            catch(Exception e){
                //Prevents odd number sizes from crashing for loop
            }
        }
        System.out.println(m);


    }//End of Main Method

}//End of Exercise7 Class
