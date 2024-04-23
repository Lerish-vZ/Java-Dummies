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
    
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";
    
    public static void main(String[] args) {
        TickTockInner t = new TickTockInner();
        t.go();
    }
    
    private void go(){
        //create a timer that calls the Ticker class at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
    }
}
