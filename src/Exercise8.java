import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by earlbozarth on 11/2/15.
 */
public class Exercise8 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(new File("people.csv"));

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            //Split line into array of columns
            String [] columns =  line.split(",");
            //Add first & last names to Array list names
            names.add(columns[1] + " " + columns[2]);




        }//End of While Loop
        //System.out.println(names);

        //
        String searchTerm= "ali";
        ArrayList<String> results = new ArrayList<>();
        //Fill up results with all the names that contain SearchTerm (case-sensitive)

        for(String name : names){
            if(name.toLowerCase().contains(searchTerm.toLowerCase())){
                results.add(name);
            }//End of if
        }//End of For Loop

        System.out.println(results);

        //Use Streams
        final String searchTerm2 = searchTerm;
        List<String> results2 =
                names
                .stream()
                .filter((name) -> {
                return name.toLowerCase().contains(searchTerm2);
                })
                .collect(Collectors.toList());
        System.out.println(results2);


    }//End of Main Method

}//End of Exercise 8 Class
