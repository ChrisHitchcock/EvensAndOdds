package evensandodds;
import java.util.*;

/**
 * Name: Chris Hitchcock
 * Date: November 8th, 2016
 * Version: 0.2
 * Description: This code tests the List class
 * @author chhit5249
 */
public class EvensAndOdds {

    /**
     * Everything happens here
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable/object declaration
        int l;
        Scanner kb = new Scanner(System.in);
        
        //Prompt for length and set length
        System.out.println("How many numbers do you wish to generate?");
        l = kb.nextInt();
        
        //Create the List and print out the even/odd lists
        List nums = new List(l);
        System.out.println(nums.evenOdds());
    }

}
