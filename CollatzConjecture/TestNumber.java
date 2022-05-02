
/**
 * Write a description of class TestNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.PriorityQueue;

public class TestNumber
{
    public static void main(String[] args){
        
        int longestSequence = 1;
        double longestSequenceKey = 1;
        int currentSequence = 1;
        PriorityQueue<Double> cache = new PriorityQueue<Double>();
        
        for(double number = 1; number < 1000000000; number++){
            
            double temp = number;
            System.out.println(number);
            
            while(temp != 1){
                
                
                if(temp%2 == 0){
                    temp = temp / 2;

                }else{
                    temp = (temp * 3) + 1;
                }
                
                if(!cache.contains(temp)) cache.add(temp); else break;
                
                
                
                currentSequence++;

                
                
            }
            
            
            
            if(currentSequence > longestSequence){
                longestSequence = currentSequence;
                longestSequenceKey = number;
            }
            
        }
        
        System.out.println("Greatest Sequence: " + longestSequenceKey + ", Length of Sequence: " + longestSequence);
    }
}
