/*
 * @Henry Huang
 * Resistors.java
 * March 1, 2019
 * This program is designed to determine the total ohms of resistors by inputting
 * the colour on the resistors.
 */

package resistors;

/**
 *
 * @author hehua8751
 */ 

import java.util.*;
import javax.swing.*;
public class Resistors {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String colour [] = new String [10];
        colour [0] = "Black";
        colour [1] = "Brown";
        colour [2] = "Red";
        colour [3] = "Orange";
        colour [4] = "Yellow";
        colour [5] = "Green";
        colour [6] = "Blue";
        colour [7] = "Viloet";
        colour [8] = "Grey";
        colour [9] = "White";
        
        //Ask user for an input
        String codeEnter = JOptionPane.showInputDialog("What is your resistors colour code?"
                + "\nSeparate each colour by hyphens\nEx:Red-Orange-Black");
        
        //Split the input into single word and store them in array
        String input[] = codeEnter.split("-");
        
        //Declaring int variables and initialize them
        int one = 10;    //Variable for the number attach to the first colour
        int two = 10;    //Variable for the number attach to the second clour
        int three = 10;  //Variable for the number attach to the third colour
        
        // Compare the colour at first position from the "colour" array to the 
        // "colour" arraylist and attach number for the varible for the first number
        for (int i = 0; i < colour.length; i++)
        {
            if (input[0].equalsIgnoreCase(colour[i]))
           {
                one = i;
            }
                while (one != 10)
                    {
                        break;
                    }
        }
        
        // Compare the colour at second position from the "colour" array to the 
        // "colour" arraylist and attach number for the varible for the second number
        for (int k = 0; k < colour.length; k ++)
        {
             if (input[1].equalsIgnoreCase(colour[k]))
           {
               two = k;
           }
              while (two != 10)
                    {
                        break;
                    }
        }
        
        // Compare the colour at third position from the "colour" array to the 
        // "colour" arraylist and attach number for the varible for the third number
        for (int m = 0; m < colour.length; m++)
        {
             if(input[2].equalsIgnoreCase((colour[m])))
            {
               three = m;
            }
              while (three != 10)
                    {
                        break;
                    }
    }
        
        //Declare variable and calculate the total ohms of the resistor
        double value = Math.pow(one * two, three);
        
         if (one == 10 || two == 10 || three == 10)
        {
            JOptionPane.showMessageDialog(null,"Please Enter A Vaild Colour!");
        }
         else
         {
             //Display the result to the user
            JOptionPane.showMessageDialog(null ,"The value of the "
                 + "resistors is " + value + " ohms.");
         }
      
    }
    
}
