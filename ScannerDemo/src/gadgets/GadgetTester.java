/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgets;

import java.util.Scanner;


/**
 *
 * @author S530719
 */
public class GadgetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gadget g1 = new Gadget(12, "gadget1", 700);
        System.out.println(g1);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter gadget Id: ");
        int gId = scan.nextInt();
                System.out.println(scan.nextLine());
        System.out.println("Enter gadget Name: ");
                 String gName = scan.nextLine();
                 System.out.println(gName);
       // System.out.println(gName.length());
        System.out.println("Enter gadget Price: ");
        double gPrice = scan.nextDouble();
        Gadget g2 = new Gadget(gId, gName, gPrice);
        System.out.println(g2);
        
    }
    
}
