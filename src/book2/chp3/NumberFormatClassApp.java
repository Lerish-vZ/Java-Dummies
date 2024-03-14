/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book2.chp3;
import java.text.NumberFormat;
/**
 *
 * @author lerishav
 */
//                      LISTING 3-6
public class NumberFormatClassApp {

    /**
     * @param args the command line arguments
     */
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    
    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPaintBallGun();
    }
    
    public static void printMyAllowance(){
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: " + cf.format(myAllowance));
    }
    
    public static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: " + cf.format(costOfPaintBallGun));
    }
}
