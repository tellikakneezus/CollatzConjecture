
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    
    
    public static void main(String[] args){
        Collatz coll = new Collatz();
        Double[] sequence;
        double longestSequenceLength = 0;
        double longestSequence = 1;
        
        for(double i = 1; i < 1000000000; i++){
            sequence = coll.run(i);
            
            
            
            if(sequence.length > longestSequenceLength){
                longestSequence = i;
                longestSequenceLength = sequence.length;
            }
            
            
        }
        
        System.out.println("Number that generates longest sequence = " + longestSequence + ". Sequence length: " + longestSequenceLength);
    }
    
    
}
