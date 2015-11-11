/**
 * Created by earlbozarth on 11/11/15.
 */
public class Exercise11 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello")); //false
        System.out.println(isPalindrome("racecar")); //true


    }

    static boolean isPalindrome (String s){
        String reverse = "";
        boolean isPalindrome = false;
        int length = s.length();
        for( int i = length -1 ; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
//            if(reverse.equals(s)){
//                isPalindrome = true;
//            }
//            else{
//                isPalindrome = false;
//            }
//        }
        }
        return reverse.equals(s);
//        return isPalindrome;
    }

}
