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
        System.out.println("Welcome to the Knight Move calculator.\n");
        
        do {
            showKnightMoves();
        } while (getYorN("Do it again?"));
    }
    
    public static void showKnightMoves() {
        //The first dimension is the file (a, b, c, etc.)
        //The second dimension is the rank (1, 2, 3, etc.)
        //Thus, board[3][4] is square d5.
        //A value of 0 means the square is empty
        // 1 means the knight is in the square. 2 Means the knight could move to the square
        
        int[][] board = new int[8][8];
        
        String kSquare; // the knight's position as a square
        Pos kPos; // the knight's position as a Pos
        
        //get the knight's initial position
    }
    
}
