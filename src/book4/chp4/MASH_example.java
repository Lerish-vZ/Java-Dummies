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
public class MASH_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
    // add the original officers
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
    // replace Tuttle with Murdock
        officers.set(2, "Murdock");
        System.out.println("\nTuttle is replaced:");
        System.out.println(officers);
    }

}
