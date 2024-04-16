/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book3.chp3;

/**
 *
 * @author lerishav
 */
public class CountTestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       prinCount();
       for(int i = 0; i < 10; i++){
           CountTest c1 = new CountTest();
           printCount();
       }
    }
    
    private static void printCount(){
        System.out.println("There are now "+ CountTest.getInstanceCount() 
                            + " instances of the CountTest class.");
                
    }
    
}

class CountTest {
    private static int instanceCount = 0;
    
    public CountTest() {
        instanceCount++;
    }
    
    public static int getInstanceCount() {
        return instanceCount;
    }
}
