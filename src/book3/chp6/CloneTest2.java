/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book3.chp6;

/**
 *
 * @author lerishav
 */
public class CloneTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee emp1 = new Employee("Martinez", "Anthony");
       emp1.setSalary(40000.0);
       
       emp1.adress = new Adress("1300 N. First Street", "Fresno", "CA", "93702");
       System.out.println("*** after cloning ***\n");
       
       Employee emp2 = (Employee)emp1.clone();
       
       printEmployee(emp1);
       printEmployee(emp2);
       
       emp2.setLastName("Smith");
       emp2.address = new Address("2503 N. 6th Street", "Fresno", "CA", "93722");
       
       System.out.println("*** after changing emp2 ***\n");
       printEmployee(emp1);
       printEmployee(emp2);
    }
    
    private static void printEmployee(Employee e){
        System.out.println(e.getFirstName() + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
    
}


class Employee implements Cloneable{
    private String lastName; 
    private String firstName; 
    private Double salary;
    
    public Employee(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public Double getSalary(){
        return this.salary;
    }
    
    public void setSalary(Double salary){
        this.salary = salary;
    }
    
    public Object clone(){
        Employee emp;
        emp = new Employee(this.lastName, this.firstName);
        emp.setSalary(this.salary);
        return emp;
    }
    
    public String toString() {
        return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + ", " + this.salary + "]";
                
    }
}
    
