
/**
 * Write a description of class Collatz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.geom.*;
import java.util.ArrayList;

public class Collatz
{

    ArrayList<Point2D.Double> goesToOne;

    public Collatz(){
        goesToOne = new ArrayList<Point2D.Double>();
    }

    public Double[] run(double number){
        double temp = number;
        boolean alreadyAdded = false;
        
        ArrayList<Double> sequence = new ArrayList<Double>();

        sequence.add(temp);
        
        while(temp != 1){
            for(Point2D.Double pnt: goesToOne){
                if(pnt.getX() == temp){
                    goesToOne.add(new Point2D.Double(number, temp));
                    temp = 1;
                    alreadyAdded = true;
                    break;
                }

            }
            if(alreadyAdded == false){
                if(temp%2 == 0) temp /= 2; else temp = (temp*3) + 1;
                sequence.add(temp);
            }

        }

        if(alreadyAdded == false){
            goesToOne.add(new Point2D.Double(number, temp));
        }

        
        return sequence.toArray(new Double[sequence.size()]);
        
    }

}
