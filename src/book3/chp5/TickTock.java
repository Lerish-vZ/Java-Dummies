/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book3.chp5;

/**
 *
 * @author lerishav
 */

import java.awt.event.*;
import javax.swing.*;

public class TickTock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a timer that calls the Ticker class
        //at one second intervals
        
        Timer t = new Timer(1000, new Ticker());
        t.start();
        
        //display a message box to prevent the program from ending immediately 
        JOptionPane.showMessageDialog(null, "Click OK to exit program");
    }
    
}
