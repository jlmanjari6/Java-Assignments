/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author S530719
 */
public class CourseTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//        Scanner scanObj = new Scanner(new File("input"));
//        PrintWriter outputObj = new PrintWriter(new File("output"));
//        while(scanObj.hasNext())
//        {
//            int courseId = scanObj.nextInt();
//            scanObj.nextLine();
//            String courseName = scanObj.nextLine();
//            double courseFee = scanObj.nextDouble();
//            Course courseObj = new Course(courseId,courseName,courseFee);
//            System.out.println(courseObj); 
//            outputObj.println(courseObj);
//        }
//        scanObj.close();   
//        outputObj.close();
int outerLoop = 10;
int innerLoop = 3;
while (outerLoop > 1)
{
   if ( outerLoop > 6 )
      innerLoop = -1;
   else if ( outerLoop * 2 >= 10)
      innerLoop = 10;
   else
      innerLoop = 2; 
   while (innerLoop < 10 )
   {
       if ( innerLoop > outerLoop )
		 {
          System.out.print ("innerLoop greater: " );
		 }
       System.out.print ( outerLoop * innerLoop );
       System.out.println();
       innerLoop += 5;
   }
   System.out.println( "After Inner Loop");
   outerLoop-=4;
} 

    }
}
