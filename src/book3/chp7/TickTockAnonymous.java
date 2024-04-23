/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book3.chp7;

/**
 *
 * @author lerishav
 */

import java.awt.event.*;
import javax.swing.*;

public class TickTockAnonymous {

    private String tickMessage = "Tick..."; //these messages are defined in the outer class (inner classes can access them)
    private String tockMessage = "Tock...";
    
    public static void main(String[] args) {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }
    
     private void go(){
        //create a timer that calls the Ticker class at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        
        //display a message box to prevent the program from ending immediately
        JOptionPane.showMessageDialog(null, "Click OK to exit program.");
        System.exit(0); //cllas the exit method of the System class, which immediately shuts down the Java Virtual Machine. It's not required but the timer will continue a few more times after you have pressed ok if you do not use this.
    }
}
