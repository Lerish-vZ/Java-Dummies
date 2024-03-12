/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp2; 
/* A shadowed variable is a variable that would otherwise be accessible but is temporarily 
made unavailable because a variable with the same name has been declared in a more immediate
scope. 
*/
/**
 *
 * @author lerishav
 */
//                  LISTING 2-2

public class ShadowApp {

    /**
     * @param args the command line arguments
     */
    static int x; 
    public static void main(String[] args) {
        x = 5; 
        System.out.println("x = " + x);
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " + ShadowApp.x);
    }
    
}
