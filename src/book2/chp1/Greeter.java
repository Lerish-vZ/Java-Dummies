/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2.chp1;

/* Import statements must appear at the beginning og the class file, before any class declarations.
    */
import javax.swing.JOptionPane; //used so that you don't have to Fully Qualify the names of the classes when you use them 

/**
 *
 * @author lerishav
 */
public class Greeter {
    
    public void sayHello() {
       /* System.out.println("Hello, World!"); //prints in console.*/
       
       /* Makes a Dialog box pop up with greeting */
        JOptionPane.showMessageDialog(null, 
                "Hello, World!", "Greeter", 
                JOptionPane.INFORMATION_MESSAGE); 
        /* Shows that you can change the greeter class without having to change
        code in the main class. One of the advantages of Object-orientated porgram. */
    }
}
