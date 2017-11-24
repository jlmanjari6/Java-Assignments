/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Registration implements Runnable {

    private String batchName;
    private int noOfStudents;
    private int noOfseatsRegistered;
    private static int totalSeats = 25;
    private static ReentrantLock regisLock = new ReentrantLock();
    

    public Registration(String batchName, int noOfStudents) {
        this.batchName = batchName;
        this.noOfStudents = noOfStudents;
        noOfseatsRegistered = 0;
    }

    @Override
    public void run() {
        for (int i = 1; i <= noOfStudents; i++) {
            regisLock.lock();
            try {
                if (totalSeats <= 0) {
                    throw new Exception("No seats available");
                } else {
                    totalSeats--;
                    noOfseatsRegistered++;
                    System.out.println("Seat registered for student No: " + i
                            + " of batch: " + batchName + " at " + new Date());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + " " + i);
            }
            finally{
                regisLock.unlock();
            }
        }
        System.out.println("Summary: " + batchName + " has completed registration with a total "
                + "number of " + noOfseatsRegistered + " seats.");
    }

}
