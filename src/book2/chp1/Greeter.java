/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2.chp1;

/* Import statements must appear at the beginning og the class file, before any class declarations.

    You can include as many import statements as are necessary to import all the classes used by your program.

    You can import all the classes in a particular package by listing the package name followed by and asterisk wildcard: import javax.swing.*

    Because many programs use the classes that are contained in the java.lang package, you don't have to import that package. Instead, those classes are automatically
         available to all programs. The System class is defined in the java.lang package. As a result, you don;t have to provide an import statement to use this class.
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
