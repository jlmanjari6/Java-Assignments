/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author S530719
 */
public class EnumTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DayOfWeek day = DayOfWeek.MONDAY;
        System.out.println("Today is: " + day);
        String s = day.name();
        String s2 = day.toString();
        System.out.println(s);
        System.out.println(s2);
        DayOfWeek day2 = DayOfWeek.MONDAY;
        System.out.println(DayOfWeek.valueOf(day2.name()));
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println(d.name());
        }
    }

}
