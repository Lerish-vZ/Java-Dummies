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
//how to prevent fall through in a switch statement
public class CarWashApp2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("The car wash application!!\n\n");
        System.out.print("Enter the package code: ");
        
        String s = sc.next();
        char p = s.charAt(0);
        
        String details = "";
        
        switch (p){
            case 'E':
            case 'e':
                details = packageE() + packageD() + packageC + packageB() + packageA();
                break;
            case 'D':
            case 'd':
                details = packageD() + packageC + packageB() + packageA();
                break;
            case 'C':
            case 'c':
                details = packageC + packageB() + packageA();
                break;
            case 'B':
            case 'b':
                details = packageB() + packageA();
                break;
            case 'A':
            case 'a':
                details = packageA();
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes: \n");
        System.out.println(details);
    }
    
    
    
}
