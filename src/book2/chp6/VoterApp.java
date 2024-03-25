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
public class VoterApp {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the voting machine error code decoder. \n\n" +
                            "If your voting machine generates an error code, \n" +
                            "you can use this program to determine the exact \ncause of the error. \n");
        System.out.print("Enter the error code: ");
        
        int err = sc.nextInt();
        
        String msg;
        if (err == 1) 
                msg = "Voter marked more than one candidate. \n" + "Ballot rejected.";
        else if (err == 2)
            msg = "Box checked and write-in candidate entered. \nBallot rejected.";
        else if (err == 3)
            msg = "Entire ballot was blank. \nBallot filled in according to secret plan.";
        else if (err == 4)
            msg = "Nothing unusual about the ballot. \nVoter randomly selected for tax audit.";
        else if (err == 5)
            msg = "Voter filled in every box. \nBallot counted twice.";
        else if (err == 6)
            msg = "Voter drooled in voring machine. \nBegining spin cycle.";
        else if (err == 7)
            msg = "Voter lied to pollster after voting. \nVoter's ballot changed to match polling data.";
        else 
            msg = "Voter filled out ballot correctly. \nBallot discarded anyway.";
        System.out.println("msg");
    }
    
}
