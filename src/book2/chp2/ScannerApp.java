/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp2;

import java.util.Scanner;

/**
 *
 * @author lerishav
 */

/* Standard Input: A stream designed to receive input data.
   Standard Output: A stream designed to display text output onscreen.
   Standard Error: Another stream designed for output. 
*/

//                  LISTING 2-3
public class ScannerApp {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println("You entered " + x + ".");
    }
    
}
