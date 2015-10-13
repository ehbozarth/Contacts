/**
 * Created by earlbozarth on 10/8/15.
 */
public class Email {
    public String subjectLine;
    public String body;
    public String destination;
    public int timeStamp;

    public Email(){
        System.out.println("Creating e-mail");
        this.subjectLine = "No Subject";
        this.body = "";
        this.destination = "";
        this.timeStamp = 0;
    }//End of Default Email Constructor

    public Email(String subjectLine, String body, String destination, int timeStamp){
        this.subjectLine = subjectLine;
        this.body = body;
        this.destination = destination;
        this.timeStamp = timeStamp;
    }//End of Email Constructor with Fields

    public void setSubjectLine(String newSubjectLine){
        this.subjectLine = newSubjectLine;
    }//End of setSubjectLine

    public void setBody(String newBody){
        this.body = newBody;
    }//End of setBody

    public void setDestination(String newDestination){
        this.destination = newDestination;
    }//End of setDestination

    public void setTimeStamp(int newTime){
        this.timeStamp = newTime;
    }//End of setTimeStamp

    public String getSubjectLine(){
        return this.subjectLine;
    }//End of getSubjectLine

    public String getBody(){
        return this.body;
    }//End of getBody

    public String getDestination(){
        return this.destination;
    }//End of getDestination

    public int getTimeStamp(){
        return this.timeStamp;
    }//End of getTimeStamp


    public static boolean isValidSubject(String subject){
        return subject.length() != 0;
    }//End of Static Method, Class calls the method and passes the object through paramters
    /*
    Email.isValidSubject(e.getSubjectLine()){}
     */

    public boolean isValidSubject(){
        return isValidSubject(subjectLine);
    }//isValid Subject method that is not static and is called by the object
    //e.isValidSubject();

}//End of Email Class
