/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book4.chp2;

/**
 *
 * @author lerishav
 */

import java.util.*;
public class CopyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayOrigianl[] = {42, 55, 21};
        int arrayNew[] = Arrays.copyOf(arrayOrigianl, 3);
        
        printIntArray(arrayNew);
    }
    
    static void printIntArray(int arrayNew[]){
        for (int i: arrayNew) {
            System.out.println(i);
            System.out.println("");
        }
        System.out.println();
    }
}
