/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp8;

import java.util.Scanner;

/*
TYPES OF EXCEPTIONS:
    IllegalArgumentException - You passed an incorrect argument to a method.
    InputMismatchException - The console input doesn't match the data type expected by a method of the Scanner class.
    ArithmeticException - You tried an illegal type of arithmetic operation, such as dividing an interger by zero.
    IOException - A method that performs I/O encountered an unrecoverable I/O error.
    ClassNotFoundException - A necassary class couldn't be found.

CATCH EXCEPTIONS USING A try STATEMENT: 
SYNTAX: 
    try{
        statements that can throw exceptions
        } catch (exception-type identifier) {
        statements executed when exception is thrown
        }
        
*/

/**
 *
 * @author lerishav
 */
public class GetInteger {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " +  i);
    }
    
    public static int GetAnInteger(){
        while(true){
            try {
                return sc.nextInt();
            }
            catch (InputMismatchException e){
                sc.next();
                System.out.print("That's not an integer. Try again: ");
            }
        }
    }
    
}
