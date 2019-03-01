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
        //Create an arraylist for the colour string for further use
        ArrayList <String> code = new ArrayList <String> ();
        code.add("Black");
        code.add("Brown");
        code.add("Red");
        code.add("White");
        code.add("Orange");
        code.add("Yellow");
        code.add("Green");
        code.add("Blue");
        code.add("Violet");
        code.add("Grey");
        
        //Create an arraylist for the the number that attch to the colour for further use
        ArrayList <String> number = new ArrayList <String> ();
        number.add("0");
        number.add("1");
        number.add("2");
        number.add("9");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        
        //Ask user for an input
        String codeEnter = JOptionPane.showInputDialog("What is your resistors colour code?"
                + "\nSeparate each colour by hyphens\nEx:Red-Orange-Black");
        
        //Split the input into single word and store them in array
        String colour[] = codeEnter.split("-");
        //System.out.print(colour[0] + "\n" + colour[1] +"\n" + colour[2]);
        
        //Declaring int variables and initialize them
        int one = 0;    //Variable for the number attach to the first colour
        int two = 0;    //Variable for the number attach to the second clour
        int three = 0;  //Variable for the number attach to the third colour
        
        
        // Compare the colour at first position from the "colour" array to the 
        // "colour" arraylist and attach number for the varible for the first number
        for (int i = 0; i < code.size(); i++)
        {
           if (colour[0].equalsIgnoreCase(code.get(i)))
           {
              System.out.println(colour[0]);
              one = Integer.parseInt(number.get(i));
              System.out.println(one);
           }
        }
        
        // Compare the colour at second position from the "colour" array to the 
        // "colour" arraylist and attach number for the varible for the second number
        for (int k = 0; k < code.size(); k ++)
        {
             if (colour[1].equalsIgnoreCase(code.get(k)))
           {
               System.out.println(colour[1]);
               two = Integer.parseInt(number.get(k));
               System.out.println(two);
           }
        }
        
        // Compare the colour at third position from the "colour" array to the 
        // "colour" arraylist and attach number for the varible for the third number
        for (int m = 0; m < code.size(); m++)
        {
                    if(colour[2].equalsIgnoreCase((code.get(m))))
            {
               System.out.println(colour[2]);
               three = Integer.parseInt(number.get(m));
               System.out.println(three);
            }
        }
        
        //Declare variable and calculate the total ohms of the resistor
        double value = Math.pow(one * two, three);
        System.out.println(value);
        
        //Display the result to the user
        JOptionPane.showMessageDialog(null ,"The value of the "
                 + "resistors is " + value + " ohms.");
       
         
    }
    
}
