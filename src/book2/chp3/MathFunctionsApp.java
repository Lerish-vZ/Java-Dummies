/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp3;

/**
 *
 * @author lerishav
 */
public class MathFunctionsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 100;
        int b = -50;
        int c = 3;
        double x = 25.0;
        double y = 3.0;
        double z = 4.0;
        
        System.out.println("abs(b) = " + Math.abs(b)); //Returns the absolute value of the argument.
        System.out.println("cbrt(x) = " + Math.cbrt(x)); //Returns the cube root of the argument. 
        System.out.println("exp(y) = " + Math.exp(z)); //Returns e raised to the power of the argument.
        System.out.println("hypot(y,z)= " + Math.hypot(y, z)); //Returns the hypotenuse of a right triangle calculated according to the Pythagorean theorem.
        System.out.println("log(y) = " + Math.log(y)); //Returns the natural logarithm (base e) of the argument. 
        System.out.println("log10(y) = " + Math.log10(y)); //Returns the base 10 logarithm of the argument.
        System.out.println("max(a, b) = " + Math.max(a, b)); //Returns the larger of two arguments.
        System.out.println("min(a, b) = " + Math.min(a, b)); //Returns the smaller of the two arguments.
        System.out.println("pow(a, c) = " + Math.pow(a, c)); //Returns the value of the first argument raised to the power of the second argument.
        System.out.println("random() = " + Math.random()); //Returns a random number that's greater than or equal to 0.0 but less than 1.0.
        System.out.println("signum(b) = " + Math.signum(b)); //Returns a number that represents the sign of the argument: -1.0 if the argument is negative, 0.0 if the argument is zero, and 1.0 if the argument is positive.
        System.out.println("sqrt(x) = " + Math.sqrt(y)); //Returns the square root of the argument.
    }

}
