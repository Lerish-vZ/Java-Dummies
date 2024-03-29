/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp4;

import java.util.Scanner;

/**
 *
 * @author lerishav
 */
/*
RELATIONAL OPERATORS:
    ==  Returns true if the expression on the left evalutes to the same value as the expression on the right.
    !=  Returns true if the expression on the left does not evaluate to the same value as the expression on the right.
    <   Returns true if the expression on the left evaluates to a value that is less than the value of the expression on the right.
    <=  Returns true if the expression on the left evaluates to a value that is less than or equal to the expression on the right.
    >   Returns true if the expression on the left evaluates to a value that is greater then the value the expression on the right.
    >=  Returns true if the expression on the left evaluates to a value that is greater then or equal to the expression on the right.

SIMPLE IF STATEMENT:    
    if (boolean-expression)
        statement
*/
public class MakingChoices {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x; 
        System.out.print("Please enter the amount of apple/s you have: ");
        x = sc.nextInt();
        
        String msg = "You have " + x + " apple" + ((x > 1 ? "s." : "."));
        System.out.println(msg);
        
        String ans = "Yes";
        if (ans.equals("yes")){
            System.out.println("The answer is " + ans + ".");
        } else {
            System.out.println("Incorrect." + ans);
        }
        
        if(ans.equalsIgnoreCase("YES")){
            System.out.println("The answer is Yes.");
        } else {
            System.out.println("Incorrect." + ans);
        }
    }
    
}
