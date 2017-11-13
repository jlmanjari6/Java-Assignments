/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S530719
 */
public class WorksheetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        
        String r = new String("I love Java");
String s = new String("  Jumping Jeroos  ");
String t = new String( "bearcat" );
String u = new String( "northwest" );

	       System.out.println(r.indexOf("love")); //2

	System.out.println(s.indexOf("Jump"));//2

	       System.out.println(t.indexOf("cat")); //4

	System.out.println(u.indexOf("dog")); //-1

	System.out.println(u.substring(5)); //west

	System.out.println(u.substring(1, 3)); // or

	System.out.println(r.substring(7)); //Java

   System.out.println(s.substring(0, 3)); //<><>J
   
   String r1 = "computer";
String s1 = "  Java  ";
String t1 = "random access memory";

System.out.println(r1.substring(r1.length()-5)); //puter

System.out.println(t1.toUpperCase().substring( 14 )); //MEMORY

System.out.println(r1.substring( r1.indexOf( "p" ), 6 ));// put

System.out.println(t1.substring( 3, 5 ).concat( t1.substring( 14, 16 ) )); //dome

System.out.println(( r1.substring( 0, 4 ) + "sci" ).toUpperCase()); //COMPSCI

System.out.println(t1.substring( t1.indexOf( "me" ), t1.indexOf( "or" ) )); //mem

System.out.println(t1.substring( t1.indexOf( t1.substring( 14 ) ) )); //memory

String wizard = "Lakshmi Manjari Alapati Bearcat";

        System.out.println(wizard.substring(0, wizard.lastIndexOf(" "))); //Harry

System.out.println(wizard.substring((wizard.lastIndexOf(" ")+1), wizard.length())); //Potter

System.out.println(wizard.substring((wizard.lastIndexOf(" ")+1), wizard.length()) + ", " + wizard.substring(0, wizard.lastIndexOf(" "))); 
//Potter, Harry

System.out.println(wizard.charAt(0) + "." + wizard.charAt(wizard.lastIndexOf(" ") + 1) + "."); //H.P.
System.out.println(wizard.lastIndexOf("a"));


String d = "dd/mm/yyyy";

System.out.println(d.substring(0,2));

System.out.println(d.substring(3,5));

System.out.println(d.substring(6,10));



 
    }
    
}
