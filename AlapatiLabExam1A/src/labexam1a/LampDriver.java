/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam1a;

import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class LampDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Testing the Lamp class");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the location for light 1: ");
        String location = scan.nextLine();
        Lamp light1 = new Lamp(location);
        System.out.println(light1);
        System.out.println(light1.getHoursOn()+ " " +light1.isPowered()+ " " + light1.getLocation());
        System.out.println("Enter the hours on, powered status, and location for light 2: ");
        String light2Details = scan.nextLine();
        int hoursOn = Integer.parseInt(light2Details.substring(light2Details.indexOf(light2Details.charAt(0))
                                                        , light2Details.indexOf(" ")));
        
        int index = light2Details.indexOf(" ");
        boolean powered = Boolean.parseBoolean(light2Details.substring(light2Details.indexOf(" "), light2Details.indexOf(" ", index)));
        String locationLight2 = light2Details.substring(light2Details.indexOf(" ", index+1)+1);        
        Lamp light2 = new Lamp(hoursOn, powered, locationLight2);
        System.out.println(light2);;
        light2.increaseHoursOn(20);
        System.out.println(light1);
        System.out.println(light2);
        light2.increaseHoursOn(-100);
        light1.setPowered(true);
         System.out.println(light1);
        System.out.println(light2);
        light1.setPowered(false);
        System.out.println(light1);
        System.out.println("Power used is:" + light1.computePowerUsed(75));
        System.out.println("Power used is:" + light2.computePowerUsed(40));
        System.out.println("Middle part for light1 is: " + light1.middlePartOfLocation());
        System.out.println("Middle part for light2 is: " + light2.middlePartOfLocation());
        System.out.println("Testing on Lamp completed");
        
    }
    
}
