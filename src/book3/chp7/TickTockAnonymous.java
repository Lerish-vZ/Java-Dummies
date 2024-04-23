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

    private void go() {
        //create a timer that calls the Ticker class at one second intervals
        Timer t = new Timer(1000,
                new ActionListener() { //The second parameter of the TimerClass constructor is an object that implements the ActionListener interface. This object is created here via an anonymous class. ActionListener is specified as the type for the class.
            private boolean tick = true;

            public void actionPerformed(ActionEvent event) { //This method can freely access fields defined in the outer class.
                if (tick) {
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        });
        
        t.start();
        JOptionPane.showMessageDialog(null, "Click OK to exit program.");
        System.exit(0);
    }
}
