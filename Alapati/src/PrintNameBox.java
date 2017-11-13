/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class PrintNameBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Wizard = "Manjari Javvaji";
        System.out.println("+-------------------------+");
        System.out.println("| Lakshmi Manjari Alapati |");
        //System.out.println(Wizard.indexOf("Harry"));
        
        System.out.println(Wizard.substring((Wizard.indexOf(" ") + 1), (Wizard.length())));
      System.out.println(Wizard.substring(0,5));
      System.out.println(Wizard.substring(2));
      System.out.println(Wizard.length());
        System.out.println(Wizard.charAt(0));
        System.out.println(Wizard.charAt(0) + "." + Wizard.charAt(Wizard.indexOf(" ") + 1) + ".");
        
    }
    
}
