/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book4.chp1;

/**
 *
 * @author lerishav
 */
import java.util.Scanner;
public class CountVowels_example {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        
        int vowelCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( (c == 'A') || (c == 'a') ||
                    (c == 'E') || (c == 'e') ||
                    (c == 'I') || (c == 'i') ||
                    (c == 'O') || (c == 'o') ||
                    (c == 'U') || (c == 'u') ) 
                vowelCount++;
            }
        System.out.println("That string contains: " + vowelCount + " vowels.");
        }
    }
    
