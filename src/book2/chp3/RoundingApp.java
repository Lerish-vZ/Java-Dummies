/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp3;

/**
 *
 * @author lerishav
 */
//              LISTING 3-5
public class RoundingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 29.4;
        double y = 93.5;
        double z = -19.3;
        
        // Returns the integer that is closest to the argument.
        System.out.println("round(x) = " + Math.round(x)); //= 29
        System.out.println("round(y) = " + Math.round(y)); //= 94
        System.out.println("round(z) = " + Math.round(z)); //= -19
        
        System.out.println();
        
        //Returns the smallest double value that is an integer and is greater than or equal to the value of the argument.
        System.out.println("ceil(x) = " + Math.ceil(x)); //= 30.0
        System.out.println("ceil(y) = " + Math.ceil(y)); //= 94.0
        System.out.println("ceil(z) = " + Math.ceil(z)); //= -19.0
        
        System.out.println();
        
        //Returns the largest double value that is an integer and is less than or equal to the value of the argument.
        System.out.println("floor(x) = " + Math.floor(x)); //= 29.0
        System.out.println("floor(y) = " + Math.floor(y)); //= 93.0
        System.out.println("floor(z) = " + Math.floor(z)); //= -20.0
        
        System.out.println();
        
        //Returns the double value that is an integer and is closest to the value of the argument.
        System.out.println("rint(x) = " + Math.rint(x)); //= 29.0
        System.out.println("rint(y) = " + Math.rint(y)); //= 94.0
        System.out.println("rint(z) = " + Math.rint(z)); //= -19.0
    }

}
