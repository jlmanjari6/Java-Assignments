/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author S530719
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("inp.txt"));
        int time = 0;
        while (reader.hasNext()) {
            try {
                int data = reader.nextInt();
                if (data % 2 == 1) {
                    throw new RejectedException("move along");
                }
                System.out.println(data);
                time += data;
            } catch (InputMismatchException e) {
                System.out.println("Q");
                reader.next();
            } catch (RejectedException e) {
                System.out.println("R:" + e.getMessage());
                reader.next();
            }
        } // end while
        System.out.println("Time is: " + time); 
    } //

}
