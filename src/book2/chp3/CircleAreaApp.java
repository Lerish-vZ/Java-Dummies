/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp3;

import java.util.Scanner;

/**
 *
 * @author lerishav
 */
//              LISTING 3-2
public class CircleAreaApp {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the circle area calculator.");
        System.out.print("Enter the radius of your circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * (r * r);
        System.out.println("The area is " + area);
    }
    
}
