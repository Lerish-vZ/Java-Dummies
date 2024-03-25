/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp6;

import java.util.Scanner;

/**
 *
 * @author lerishav
 */

//Using a string in a switch statement when the string is received form the user (input)
public class CarWashStringApp {

    /**
     * @param args the command line arguments
     */
    
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("The car wash application.\n\n");
        System.out.print("Enter the package code: ");
        
        String s = sc.next();
        
        String details = "";
        
        switch(s.toUpperCase()){
            case "PRESIDENTIAL":
                details += "\tNew Car Scent, plus...\n";
            case "ELITE":
                details += "\tTire Treatment, plus...\n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus...\n";
            case "SUPER":
                details += "\tWax, plus...\n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes: \n");
        System.out.println(details);
                    
        }
    }
    
}
