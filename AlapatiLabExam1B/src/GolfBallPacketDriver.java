
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class GolfBallPacketDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Testing the GolfBallPacket class");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number in the pack and condition fpr packet1: ");
        int number = scan.nextInt();
        String condition = scan.nextLine();
        GolfBallPacket packet1 = new GolfBallPacket(number, condition);
        System.out.println(packet1);
        System.out.println(packet1.getNumberInPack() + " " + packet1.getCost() + " " + packet1.getCondition());
        System.out.println("Enter number in the pack, cost and condition for packet2: ");
        int number2 = scan.nextInt();
        double cost2 = scan.nextDouble();
        String condition2 = scan.next();
        GolfBallPacket packet2 = new GolfBallPacket(number2, cost2, condition2);
        System.out.println(packet2);
        packet1.increaseCost(15.0);
        
        System.out.println(" ");
        System.out.println(packet1);
        System.out.println(packet2);
        
        packet2.increaseCost(-17.2);
        packet1.setNumberInPack(90);
        
        System.out.println(" ");
        System.out.println(packet1);
        System.out.println(packet2);
      
         packet2.setNumberInPack(10);
         System.out.println(packet2);
         System.out.println(packet1.costPerBall());
         System.out.println(packet2.costPerBall());
         System.out.println(packet1.lastWordOfCondition());
         System.out.println(packet2.lastWordOfCondition());
         System.out.println("Testing on GolfBallPacket completed");
         
        
        
    }
    
}
