/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp5;

import java.util.Scanner;

/**
 *
 * @author lerishav
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean keepPlaying = true; 
        System.out.println("Let's play a guessing game!");
        
        while(keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;
            
            number = (int)(Math.random() * 10) + 1;
            
            System.out.println("\nI'm thinking of a number between 1 and 10.");
            System.out.print("What do you think it is? ");
            
            do {
                guess = sc.nextInt();
                validInput = true; 
                
                if ((guess < 1) || (guess > 10)){
                    System.out.print("I said, between 1 and 10. Try again.");
                    
                    validInput = false;
                }
            } while (!validInput); {
                if (guess == number){
                    System.out.println("You're right!");
                } else 
                    System.out.println("You're wrong! The number was " + number + ".");
                }
            
            }
            
            do {
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                
                if(answer.equalsIgnoreCase("Y"));
                else if(answer.equalsIgnoreCase("N")){
                    keepPlaying = false;
                } else {
                    validInput = false;
                }
            } while (!validInput);
        }
        System.out.println("\nThank yu for playing!");
                
    }
    
}
