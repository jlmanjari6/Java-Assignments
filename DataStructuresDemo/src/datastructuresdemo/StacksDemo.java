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
public class StacksDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(23);
        s1.push(24);
        s1.push(25);

        s2.push(434);
        s2.push(343);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        int sizeS2 = s2.size();
        for (int i = 0; i < sizeS2; i++) {
            s2.pop();
        }

        int sizeS1 = s1.size();
        for (int i = 0; i < sizeS1; i++) {
            int e = s1.firstElement();
            s2.push(e);
            s1.remove(s1.indexOf(e));
        }
        
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }
}

//
//        for (int j = 0; j < sizeS1; j++) {
//            s2.push(s1.get(j));
//            s1.pop();
//        }

//        for (int i = 0; i < sizeS1; i++) {
//            s2.push(s1.pop());
//        }