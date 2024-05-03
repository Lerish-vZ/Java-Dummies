/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book4.chp2;

import java.util.Scanner;

/**
 *
 * @author lerishav
 */
public class KnightMoves {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    //the following static array represents the 8 possible moves a knight can make. This is an 8 x 2 array
    static int[][] moves = {    {-2, +1}, 
                                {-1, +2},
                                {+1, +2},
                                {+2, +1},
                                {+2, -1},
                                {+1, -2},
                                {-1, -2},
                                {-2, -1}    };
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
