import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by earlbozarth on 10/13/15.
 */
public class Contacts {
    public static void main(String [] args){
        Contact bob = new Contact("Bob", 30);
        Contact alice = new Contact("Alice", 20);
        Contact charlie = new Contact("Charlie", 25);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(bob);
        contacts.add(alice);
        contacts.add(charlie);

        //int pos = contacts.indexOf(contacts.contains(alice));

        Contact contactToFind = null;


        //Finding position of object in Array List
        //int pos = 0;
        for(Contact c : contacts){
            if(c.name.equals("Alice")){
                contactToFind = c;
                break;
            }//End of if name equals Alice
            //pos++;
        }//End of for loop

        ArrayList<Contact> contactsUnder30 = new ArrayList<>();

        for (Contact d : contacts){
            if (d.age < 30){
                //contactToFind = d;
                //break;
                contactsUnder30.add(d);
            }
        }

        //Finding Object in Hashmap
        HashMap <String , Contact> contactMap = new HashMap<>();
        contactMap.put("Bob", bob);
        contactMap.put("Alice", alice);
        contactMap.put("Charlie", charlie);
        
        //contactToFind = contactMap.get("Alice");
        
        if (contactToFind == null){
        //if (pos + 1 > contacts.size()){
            System.out.println("Couldn't Find Contact");
        }
        else {
            System.out.println("Found Contact");
        }

       
        
        
        

    }//End of main Class

}//End of Contacts Class
