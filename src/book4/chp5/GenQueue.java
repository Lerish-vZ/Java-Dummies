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
public class GenQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addLast(item); //adds items to the end of list
    }

    public E dequeue() {
        return list.poll(); // returns first item in list
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q) { 
        while (q.hasItems()) {
            list.addLast(q.dequeue());
        }
    }
    /*
    accepts a parameter that must be another
    GenQueue object whose element type is either the same type as this
    GenQueue object’s elements or a subtype of this GenQueue object’s
    element type. This method uses a while loop to remove all the items
    from the q parameter and add them to this queue.
    */

}
