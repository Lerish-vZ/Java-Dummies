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
public class VoterApp2 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to the voting machine error code decoder. \n\n" +
                            "If your voting machine generates an error code, \n" +
                            "you can use this program to determine the exact \ncause of the error. \n");
        System.out.print("Enter the error code: ");
        
        int err = sc.nextInt();
        
        String msg;
        
        switch(err) {
            case 1:
                msg = "Voter marked more than one candidate. \nBallot rejected.";
            case 2:
                msg = "Voter marked more than one candidate. \nBallot rejected.";
            case 3:
                msg = "Voter marked more than one candidate. \nBallot rejected.";
            case 4:
                msg = "Voter marked more than one candidate. \nBallot rejected.";
            case 5:
                msg = "Voter marked more than one candidate. \nBallot rejected.";
            case 6:
                msg = "Voter marked more than one candidate. \nBallot rejected.";
            case 7:
                msg = "Voter marked more than one candidate. \nBallot rejected.";    
        }
    }
    
}
