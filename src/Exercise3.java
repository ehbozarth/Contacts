import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by earlbozarth on 10/19/15.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String [] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> people = new HashMap<>();
        //Key is the name, value is the contact object other than the person

        for (String name : names) {
            for (String name2 : names) {
                if(!name.equals(name2)){
                    //System.out.println(String.format("%s %s", name, name2));
                    Contact person = new Contact(name2, 0);
                    /*
                    Contact person = new Contact();
                    person.name = name2;
                     */
                    ArrayList<Contact> peopleList = people.get(name);
                    if(peopleList == null){
                        peopleList = new ArrayList<>();
                        peopleList.add(person);
                        people.put(name, peopleList);
                    }//Enf of inner if statement
                    else{
                        peopleList.add(person);
                    }
                }//End of outer if statement
            }//End of inner For Loop
        }//End of outer For Loop
        //Object Key is name, Value is name2
        double randNum = Math.random();
        int index = (int) (randNum * 4);
        System.out.println(names[index]);

        Random rand = new Random();
        index = rand.nextInt(4);
        System.out.println(names[index]);
    }//End of Main Method
}//End of Exercise 3 Class
