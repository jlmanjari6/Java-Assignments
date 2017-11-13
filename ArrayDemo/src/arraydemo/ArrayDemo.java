/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S530719
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
  public static void main(String[] args) throws FileNotFoundException 
  {
     Scanner scan = new Scanner(new File("C:\\Users\\S530719\\Documents\\NetBeansProjects\\ArrayDemo\\src\\arraydemo\\input.txt"));
     int numArray[] = new int[11];
    
         for(int i=0;i<numArray.length;i++){
        numArray[i] = scan.nextInt();
    
  }
     for(int i=numArray.length-1;i>=0;i--){
         System.out.println(numArray[i] + " ");
     }
     
     for(int i=0;i<numArray.length;i++){
         if(numArray[i] < 0){
             System.out.println(numArray[i] + " ");
         }
     }
     
      for(int i=0;i<numArray.length;i++){
         if(i%2 == 0){
             System.out.println(numArray[i] + " ");
         }
     }
     
     String s[] = new String[16];
   
         for(int i =0 ; i< s.length; i++){
             s[i] = scan.next();
         }
   
     
     for(int i =0;i< s.length;i++){
         System.out.println(s[i]);
     }
     
     for(int i=0;i<s.length;i++){
         if(s[i].charAt(0) >= 'H' ){
             System.out.println(s[i]);
         }
     }
  }
  }
