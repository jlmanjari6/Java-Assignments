/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresdemo;

import java.util.*;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> list = new LinkedList<>();

        // add some elements
        list.add(23);
        list.add(2);
        list.add(45);
        list.add(7676);
        System.out.println(list.get(0));
        
        // print the list
        System.out.println("LinkedList:" + list);
        list.set(0, 32);

        // set Iterator as descending
        Iterator x = list.descendingIterator();

        // print list with descending order
        while (x.hasNext()) {
            System.out.println(x.next());
        }
        System.out.println("");
        // set Iterator as descending
        Iterator x2 = list.listIterator();

        // print list with descending order
        while (x2.hasNext()) {
            System.out.println(x2.next());
        }

        System.out.println("");
        // set Iterator as descending
        Iterator x3 = list.iterator();

        // print list with descending order
        while (x3.hasNext()) {
            System.out.println(x3.next());
        }
    }
}
