/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book4.chp4;

import java.util.*;

/**
 *
 * @author lerishav
 */
public class LinkedList_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();

        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        
        officers.add(2, "Tuttle");
        
        for (String s : officers) {
            System.out.println(s);
        }
    }

}
