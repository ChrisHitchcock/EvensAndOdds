package evensandodds;

import java.util.*;

/**
 * Name: Chris Hitchcock
 * Date: November 8th 2016
 * Version: 0.2
 * Description: This class creates a list of randomly generated numbers, and 
 * contains a method that sorts them into evens and odds for output.
 * @author chhit5249
 */
public class List {
    //Variable/object declaration
    private int[] numbers;
    private ArrayList<Integer> evens, odds;
    Random r = new Random();

    /**
     * Constructor <p>
     * pre: length passed <br>
     * post: List created
     * @param length 
     */
    public List(int length) {
        //Create an array, generate random numbers, and add those numbers to the array
        numbers = new int[length];
        for (int i = 0; i <= numbers.length - 1; i++) {
            int rand = r.nextInt(99);
            numbers[i] = rand;
        }
    }

    /**
     * This method organizes the random numbers into even numbers and odd numbers
     * using modulus division <p>
     * pre: none <br>
     * post: numbers added to even/odd ArrayLists, and added to output string for return
     * @return output - output string that displays the even and odd lists.
     */
    public String evenOdds() {
        //Variabe/object declaration
        String output;
        evens = new ArrayList();
        odds = new ArrayList();
        
        //For loop which goes through each number in the numbers array and adds them to the correct ArrayList
        for (int x = 0; x <= numbers.length - 1; x++) {
            int check;
            check = numbers[x] % 2;
            if (check == 0) {
                evens.add(numbers[x]);
            } else {
                odds.add(numbers[x]);
            }
        }
        
        //Add the elements from evens/odds ArrayLists to output using for-each loops
        output = "EVENS: \n";
        for (Object nums : evens) {
            output+=nums+" ";
        }
        output += "\nODDS: \n";
        for (Object nums : odds) {
            output+=nums+" ";
        }
        return output;
    }
}
