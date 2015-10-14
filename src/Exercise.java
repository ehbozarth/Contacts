import java.util.ArrayList;

/**
 * Created by earlbozarth on 10/14/15.
 */
public class Exercise {

    public static void main(String[] args) {

        Contact alice = new Contact();
        alice.name = "Alice";
        alice.age = 25;
        Contact bob = new Contact();
        bob.name = "Bob";
        bob.age = 35;



        //ArrayList nameList = new ArrayList();
        //ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(alice);
        contacts.add(bob);
        //nameList.add("Charlie");
        //nameList.add("Austin");

        //String [] nameList = new String []{"Alice", "Bob", "Charlie", "Austin"};

        //for(String name : nameList){
        for (Contact contact : contacts){

            if (contact.name.startsWith("A")){
        //for (Object name : nameList){
            //String nameString = (String) name; *Casting an object variable
            //if(nameString.startsWith("A")){
                System.out.println(contact.name);
            }//End of if name starts with A

        }//End of for loop

    }//End of Main method

}//End of Exercise Class
