/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.ArrayDeque;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class AStack<E> {
    private ArrayDeque<E> myStack;

    public AStack() {
        this.myStack = new ArrayDeque<>();
    }
    
    public void push(E element) {
        myStack.push(element);
    }
    
    public E pop() {
        return myStack.pop();
    }
    
    public E peek(){
        return myStack.peek();
    }
    
    public int size(){
        return myStack.size();
    }
    
    public boolean isEmpty() {
        return myStack.isEmpty();
    }   
    
}
