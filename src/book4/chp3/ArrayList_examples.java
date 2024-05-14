/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book4.chp3;

import java.util.*;

/**
 *
 * @author lerishav
 */
public class ArrayList_examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add(2, "Two and a half");

        /*
        nums looks as follows now: 
            One 
            Two 
            Two and a half
            Three 
            Four
         */
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        } //OR

        System.out.println("");

        //Easiest way to access all the elements: enhanced for loop
        for (String s : nums) {
            System.out.println(s);
        }

        for (String s : nums) {
            int i = nums.indexOf(s);
            System.out.println("Item " + i + ": " + s);
        }

        String s;
        Iterator e = nums.iterator();
        while (e.hasNext()) {
            s = (String) e.next();
            System.out.println(s);
        }

        nums.clear();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        System.out.println(nums);
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        System.out.println(nums);
    }

}
