/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp2;

import javax.swing.JOptionPane;

/**
 *
 * @author lerishav
 */

//                  LISTING 2-4
public class DialogApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Enter an Integer:");
        int x = Integer.parseInt(s); //what the user inputs into the box is automatically a string so you have to convert it.
        System.out.println("You entered " + x + ".");
    }
    
}
