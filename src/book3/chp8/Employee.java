/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book3.chp8; //in book package is: com.lowewriter.payroll;

/**
 * Represents an employee.
 *
 * @author lerishav
 * @author www.book3chp8.com
 * @version 1.5
 * @since 1.0
 */
public class Employee {

    private String lastName;
    private String firstName;
    private Double salary;

    /**
     * Represents the employee's address
     */
    public Address address;

    /**
     * Creates an employee with the specified name.
     *
     * @param lastName The employee's last name.
     * @param fistName The employee's first name.
     */
    public Employee(String lasName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    /**
     * Gets the employee's last name.
     *
     * @return A string representing the employee's last name.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets the employee's last name.
     *
     * @param lastName A String containing the employee's last name.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
