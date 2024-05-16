/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book4.chp5;
import java.util.*;
/**
 *
 * @author lerishav
 */
public class GenStack<E> {

    /**
     * @param args the command line arguments
     */
    
    private LinkedList<E> list = new LinkedList<E>();
    
    public void push(E item){
        list.addFirst(item);
    }

    
}
