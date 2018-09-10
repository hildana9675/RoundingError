/* Hildana.M
 * RoundingError.java
 * This program compares the square of the square root of any number
 *  
 */

package roundingerror;
import static java.lang.Math.sqrt;
import javax.swing.*;
/**
 *
 * @author himel9675
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int number; 
        
        //ask user for the number 
        String input = JOptionPane.showInputDialog("Please"
                + " enter a number.");
        
        //convert String to Int
        number = Integer.parseInt(input);
        
        //calculation 
        double squareOfSquare;
        double rError;
        
        squareOfSquare = Math.pow(sqrt(number), 2); 
        rError = number - squareOfSquare; //the rounding error  
        
        //Display the results
     	JOptionPane.showMessageDialog(null, "The square of the square: "
		+ squareOfSquare + "\n The round of error: "
                + rError );
        
    }
}
