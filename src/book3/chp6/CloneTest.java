/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book3.chp6;

/**
 *
 * @author lerishav
 */
public class CloneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee emp1 = new Employee("Martinez", "Anthony");
       emp1.setSalary(40000.0);
       
       Employee emp2 = (Employee)emp1.clone();
       
       emp1.setLastName("Smith");
       
        System.out.println(emp1);
        System.out.println(emp2);
    }
    
}
