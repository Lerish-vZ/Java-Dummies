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

public class TickTockInner {

    /**
     * @param args the command line arguments
     */
    
    private String tickMessage = "Tick..."; //these messages are defined in the outer class (inner classes can access them)
    private String tockMessage = "Tock...";
    
    public static void main(String[] args) {
        TickTockInner t = new TickTockInner();
        t.go();
    }
    /*
    Because an inner class can be used only by an instantiated object, you
    can’t use it directly from the static main method. As a result, the main
    method in this program simply creates an instance of the application
    class (TickTockInner).
    */
    
    private void go(){
        //create a timer that calls the Ticker class at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        
        //display a message box to prevent the program from ending immediately
        JOptionPane.showMessageDialog(null, "Click OK to exit program.");
        System.exit(0); //calls the exit method of the System class, which immediately shuts down the Java Virtual Machine. It's not required but the timer will continue a few more times after you have pressed ok if you do not use this.
    }
    
    class Ticker implements ActionListener {
        private boolean tick = true; 
        
        public void actionPerformed (ActionEvent event){
            if (tick){
                System.out.println(tickMessage); //accesss a field of the outer class.
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
