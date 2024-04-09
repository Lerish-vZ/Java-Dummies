/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp8;

/**
 *
 * @author lerishav
 */
public class CrazyWithZeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int answer = divivdeTheseNumbers(5, 0);
        }
        catch (Exception e) {
            System.out.println("Tried twice, still didn't work!");
        }
    }
    
    public static int divideTheseNumbers(int a, int b)
        throws Exception {
        int c;
        
        try {
            c = a / b;
            
        }
    
    }
}
