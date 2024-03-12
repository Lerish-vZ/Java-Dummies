/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp2;

/**
 *
 * @author lerishav
 */
public class ScopeApp {

    /**
     * @param args the command line arguments
     */
    static int x; //class variable. Both main method and myMethod can access it
    
    public static void main(String[] args) {
        x = 5; 
        System.out.println("main: x = " + x);
        myMethod();
   }
    
    public static void myMethod() {
        int y; //is local variable. Scope begins when initialized thus line 26 and ends line 35
        y = 10; 
        
        if(y == x + 5){
            int z;  //local variable that is declared and initialized in the if statement
            z = 15;
            System.out.println("myMehtod: z = " + z);
        }
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    }
    
}
