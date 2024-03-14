/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp3;

/**
 *
 * @author lerishav
 */

//               LISTING 3-4
public class DiceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int roll; 
        String msg = "Here are 100 random rolls of the dice:";
        
        for ( int i = 0; i < 100; i++){
            roll = randomInt(1, 6);
            System.out.print(roll + " ");
        }
        System.out.println();
    }
    
    
    
}
