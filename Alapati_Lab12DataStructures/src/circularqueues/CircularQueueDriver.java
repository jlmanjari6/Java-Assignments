/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueues;

import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class CircularQueueDriver {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        CircularQueue<Integer> circularQueue = new CircularQueue(20);
        Scanner scan = new Scanner(System.in);
        System.out.println("*******************************************\n"
                + "Circular Queue\n"
                + "*******************************************");
        System.out.println("Removing empty circular Queue ");
        try {
            circularQueue.removeElement();
        } catch (QueueEmptyException ex) {
            {
                System.out.println(ex);
            }
        }
        System.out.print("Retrieving the front element of empty Queue is ");
        try {
            System.out.println(circularQueue.retrieveElement());
        } catch (QueueEmptyException ex) {
            {
                System.out.println(ex);
            }
        }

        try {
            System.out.println("Please enter 20 elements: ");
            for (int i = 1; i <= 20; i++) {
                circularQueue.insertElement(scan.nextInt());
            }
        } catch (QueueFullException ex) {
            System.out.println(ex);
        }

        System.out.println("Full Circular Queue" + circularQueue.print());

        System.out.print("Retrieving the front element of Queue:  ");
        try {
            System.out.println(circularQueue.retrieveElement());
        } catch (QueueEmptyException ex) {
            {
                System.out.println(ex);
            }
        }

        System.out.println("Removing element from circular Queue......");
        try {
            circularQueue.removeElement();
        } catch (QueueEmptyException ex) {
            {
                System.out.println(ex);
            }
        }

        System.out.println("Length of queue after removal: " + circularQueue.length());
        System.out.println("Circular Queue after removing an element " + circularQueue.print());
        try {
            System.out.println("Please enter an element to add: ");
            circularQueue.insertElement(scan.nextInt());
            System.out.println("The current size of the queue: " + circularQueue.length());
            System.out.println("Please enter an element to add: ");
            circularQueue.insertElement(scan.nextInt());
        } catch (QueueFullException ex) {
            System.out.println(ex);
        }
        System.out.println("Full Circular Queue" + circularQueue.print());
    }

}
