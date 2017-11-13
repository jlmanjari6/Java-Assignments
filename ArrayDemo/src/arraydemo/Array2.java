/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S530719
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int[][] numArray2D = new int[4][3];
          Scanner scan = new Scanner(new File("C:\\Users\\S530719\\Documents\\NetBeansProjects\\ArrayDemo\\src\\arraydemo\\input2.txt"));
          for(int row = 0; row < numArray2D.length ; row++){
              for(int col = 0; col < numArray2D[0].length; col++){
                  numArray2D[row][col] = scan.nextInt();
              }              
          }
          
          for(int row = 0; row < numArray2D.length ; row++){
              for(int col = 0; col < numArray2D[0].length; col++){
                  System.out.print(numArray2D[row][col] + " ");
              }              
              System.out.println(" ");
          }
          
          int sum = 0;
            for(int row = 0; row < numArray2D.length ; row++){
              for(int col = 0; col < numArray2D[0].length; col++){
                 sum+= numArray2D[row][col];
              }              
          }
            double avg = sum/12.0;
            System.out.println(avg);
              for(int row = 0; row < numArray2D.length ; row++){
              for(int col = 0; col < numArray2D[0].length; col++){
                 if(numArray2D[row][col] > avg){
                     System.out.println(numArray2D[row][col]);
                 }
              }              
          }
              
    }
    
}
