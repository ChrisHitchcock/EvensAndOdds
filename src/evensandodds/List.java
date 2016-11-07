/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evensandodds;
import java.util.*;
/**
 *
 * @author chhit5249
 */
public class List {
    private int[] numbers;
    private ArrayList<Integer> evens, odds;
    Random r = new Random();
    public List(int length)
    {
        numbers = new int[length];
        
        for (int i = 0;i<=numbers.length-1;i++)
        {
            int rand = r.nextInt(99);
            numbers[i]=rand;
        }
    }
    
    public String evenOdds()
    {
       String output = "ph";
       evens = new ArrayList();
       odds = new ArrayList();
       for (int x = 0;x <= numbers.length-1; x++)
       {
           int check;
           check = numbers[x]%2;
           if (check==0)
           {
               evens.add(numbers[x]);
           } else {
               odds.add(numbers[x]);
           }
       }
       //Collections.sort(odds);
       //Collections.sort(evens);
       output = "EVENS:\n"+evens+"\nODDS:\n"+odds;
       return output;
    }
}
