/**
 * Created by earlbozarth on 10/8/15.
 */
public class Person {
    public String name;
    public int age;
    public double height;
    public Author author;

    public void setName(String newName){
        this.name = newName;
    }//End of setName

    public String getName(){
        return this.name;

    }//End of getName
}//End of Person Class

class Author{
    public String name;
    public String[] books;
}//End of Author Class