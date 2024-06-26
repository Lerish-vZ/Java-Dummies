/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book3.chp6;

/**
 *
 * @author lerishav
 */
public class TestEquality2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Martinez", "Anthony");
        Employee emp2 = new Employee("Martinez", "Anthony");
        
        if(emp1.equals(emp2))
            System.out.println("These employees are the same.");
        else 
            System.out.println("These are different employees.");
    }
    
}

 class Employee {
        private String lastName; 
        private String firstName;
       
        public Employee(String lastName, String firstName){
            this.lastName = lastName;
            this.firstName = firstName;
        }
        
        public String getLastName(){
            return this.lastName;
        }
        
        public String getFirstName(){
            return this.firstName;
        }
        
        public boolean equals(Object obj){
            //an object must equal itself
            if (this == obj)
                return true;
            
            //no object equals null
            if (this == null)
                return false;
            
            //objects of different types are never equal
            if (this.getClass() != obj.getClass())
                return false;
            
            //cast to an Employee, then compare the fields
            Employee emp = (Employee) obj;
            
            return this.lastName.equals(emp.getLastName()) && this.firstName.equals(emp.getFirstName());
        }
    }
