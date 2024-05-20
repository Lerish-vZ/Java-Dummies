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

     
public void enqueue(E item) 
        →7
{
list.addLast(item);
    }

    public E dequeue() 
        →12
{
return list.poll();
    }

    public boolean hasItems() 
        →a17
{
return !list.isEmpty();
    }

    public int size() 
        →a22
{
return list.size();
    }

    public void addItems(GenQueue<? extends E> q) 
        →a27
{
while (q.hasItems()) {
            list.addLast(q.dequeue());
        }
    }

}
