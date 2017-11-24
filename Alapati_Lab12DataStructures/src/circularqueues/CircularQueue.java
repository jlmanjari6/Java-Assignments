/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueues;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class CircularQueue<E> {

    private int front;
    private int rear;
    private E[] circularQueueElements;
    private int maxSize;
    private int count = 0;
    int temp;
    private int currentSize;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueueElements = (E[]) new Object[this.maxSize];
        currentSize = 0;
        front = 0;
        rear = 0;
    }

    public void insertElement(E item) throws Exception {
        if (isFull()) {
            throw new QueueFullException("Circular Queue is full. Element cannot be added");
        } else {
            circularQueueElements[rear] = item;
            rear = (rear + 1) % circularQueueElements.length;
            currentSize++;
        }
    }

    public void removeElement() throws Exception {
        if (isEmpty()) {
            throw new QueueEmptyException("Circular Queue is empty. Element cannot be retrieved and removed");
        } else {
            circularQueueElements[front] = null;
            front = (front + 1) % circularQueueElements.length;
            currentSize--;
        }
    }

    public E retrieveElement() throws Exception {

        if (isEmpty()) {
            throw new QueueEmptyException("Circular Queue is empty. Element cannot be retrieved");
        } else {
            return circularQueueElements[front];
        }
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public boolean isFull() {
        return (currentSize == circularQueueElements.length);
    }

    public int length() {
        return currentSize;
    }

    public String print() {
        int print = 0;
        String elements = "";
        for (int i = front; print < maxSize; i++) {
            elements += "\n" + circularQueueElements[i];
            print++;
            if (i == maxSize - 1) {
                i = -1;
            }
        }
        return "Queue Elements" + elements;
    }
}
