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
        do{
            System.out.print("Enter knight's position: ");
            kSquare = sc.nextLine();
            kPos = convertSquareToPos(kSquare);
        } while (kPos == null);
        
        board[kPos.x][kPos.y] = 1;
        
        System.out.println("\nThe knight is at square " + convertSquareToPos(kPos));
        
        System.out.println("From here the knight can move to: ");
        
        for (int move = 0; move < moves.length; move++){
            int x, y;
            
            x = moves[move][0]; // the x for this move
            y = moves[move][1]; // the y for this move
            
            Pos p = calculateNewPos(kPos, x, y);
            
            if(p != null){
                System.out.println(convertSquareToPos(p));
                board[p.x][p.y] = 2;
            }
        }
        printBoard(board);
    }
    
    //this method converts squares such as a1 or d5 to x, y coordinates such as [0][0] or [3][4]
    public static Pos convertSquareToPos(String square){
        int x = -1; 
        int y = -1;
        char ranks, file;
        
        file = square.charAt(0);
        if(file == 'a') x = 0;
        if(file == 'b') x = 1;
        if(file == 'c') x = 2;
        if(file == 'd') x = 3;
        if(file == 'e') x = 4;
        if(file == 'f') x = 5;
        if(file == 'g') x = 6;
        if(file == 'h') x = 7;
    }
    
}
