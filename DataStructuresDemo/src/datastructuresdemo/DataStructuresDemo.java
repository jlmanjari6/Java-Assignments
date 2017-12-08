/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class DataStructuresDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);
        list.add(1);
        list.add(10);
        list.add(23);
        list.add(3);
        list.add(2323);
        System.out.println(list);
        Iterator<Integer> myIterator;
        myIterator = list.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
        list.remove(2);
        list.remove(new Integer(2323));
        System.out.println(list);
        System.out.println("remove: " + list.remove());
        list.add(0, 1);
        System.out.println("remove: " + list.removeFirst());
        System.out.println(list);
        Iterator<Integer> descendingIterator = list.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
        System.out.println(list);
        System.out.println(list.contains(-1));
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        Stack<Integer> s = new Stack<>();
        System.out.println(s);
//                System.out.println(s.peek());
//        System.out.println(s.pop());
        System.out.println(s.search(110));
        s.add(2);
        s.add(12);
        s.add(12);
        s.add(2323);
        s.push(10);
        s.push(100);
        s.push(110);
        System.out.println(s);
        System.out.println("peek: " + s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search(110));
        System.out.println(s.search(2323));
        System.out.println(s.search(12));
        System.out.println(s.search(2));
    }
}
