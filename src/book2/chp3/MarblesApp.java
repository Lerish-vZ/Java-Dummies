/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp3;

import java.util.Scanner;

/**
 *
 * @author lerishav
 */

/*
Unary Operators: Operators that work on just one operand. 
Binary Operators: Operators that work on just one operand.
Ternary Operators: Operators that work on three operands. (Java has only one of these and it is the conditional operator.)
*/

//              LISTING 3-1
public class MarblesApp {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declarations 
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;
        
        //get the input data
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt(); //to save the input from user in variable numberOfMarbles
        System.out.print("Nuumber of children: ");
        numberOfChildren = sc.nextInt();
        
        //calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;
        
        //print the result 
        System.out.println("Give each child " + marblesPerChild + 
                " marbles.");
        System.out.println("You will have " + marblesLeftOver + 
                " marbles left over.");
    }
    
}
