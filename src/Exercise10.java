/**
 * Created by earlbozarth on 11/10/15.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int num = 12345;
        //int numReversed = 54321
        int numReveresed = 0;
        String numStr = String.valueOf(num);
//        while(num != 0){
//            //Multiplies numReversed by power of 10 to move over to left 5 turns to 50
//            numReveresed = numReveresed * 10;
//            //numReversed = numReversed + remainder of num (the last digit inside num i.e. 5 then, 4, 3, etc) (50+4),(540+3)
//            numReveresed = numReveresed + num%10;
//            //Num is now num divided by power of 10 to then shrink number and lose the 0 (12345-->12340-->1234)
//            num = num/10;
//        }
//        System.out.println(numReveresed);
//        String numReverse = "";
//        for(int i = numStr.length()-1; i >=0; i--){
//            numReverse += numStr.charAt(i);
//        }
//        System.out.println(numReverse);

        String numStrReversed = new StringBuilder(numStr).reverse().toString();

        System.out.println(numStrReversed);
    }//End of Main Method

}//End of Exercise10
