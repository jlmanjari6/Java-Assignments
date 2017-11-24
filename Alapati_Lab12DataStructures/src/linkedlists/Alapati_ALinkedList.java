/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Alapati_ALinkedList<E> {

    private Node<E> listStart;
    private int listLength;
    private LinkedList<Node<E>> list;

    /**
     * Constructor Creates an empty linked list with the head of the list
     * pointing to null. Initializes the length of the list to 0.
     */
    public Alapati_ALinkedList() {
        list = new LinkedList<>();
        listStart = null;
        listLength = 0;
    }

    /**
     * Returns true if the list is empty; false otherwise.
     *
     * @return true if the list is empty; false otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Adds an object to the beginning of the list.
     *
     * @param myObject The object to be added to the beginning of the list.
     */
    public void addFirst(E myObject) {
        list.addFirst(new Node(myObject));
    }

    /**
     * Removes the first object from the list.
     *
     * @return the node that was removed from the list.
     * @throws NoSuchElementException if the list is empty
     */
    public Node<E> removeFirst() {
        return list.removeFirst();
    }

    /**
     * Returns the number of nodes in the list.
     *
     * @return the number of nodes in the list.
     */
    public int size() {
        return list.size();
    }

    /**
     * Returns a string representation of the linked list. The string
     * representation consists of each node in the list, printed using the
     * toString method of the Node class, with each node printed on a new line.
     *
     * @return a string representation of the linked list.
     */
    @Override
    public String toString() {
        String result = "";
        for (Node n : list) {
            result += n.data.toString() + "\n";
        }
        return result;
    }
}
