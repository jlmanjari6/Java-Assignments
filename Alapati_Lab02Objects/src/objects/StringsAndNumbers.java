/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author S530719 - Lakshmi Manjari Alapati
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String string1 = "   Why";
        String string2 = " choose ";
        String string3 = "   Northwest  ";
        String string4 = "among";
        String string5 = " other     ";
        String string6 = " Universities ";
                         
        String concatString1 = string1.concat(string2).concat(string3).concat(string4).concat(string5)
                                .concat(string6); 
        System.out.println("******** String Class ********\n");     
        System.out.print("The length of the concatenated string is: ");
        System.out.println(concatString1.length());
               
        String concatString2 = string1.trim().concat(" ").concat(string2.trim()).concat(" ")
                                .concat(string3.trim()).concat(" ").concat(
                                string4.trim()).concat(" ").concat(string5.trim()).concat(" ")
                                .concat(string6.trim());
        System.out.println("Whole sentence: ".concat(concatString2).concat("?"));
        System.out.print("The length of the trimmed string: ");
        System.out.println(concatString2.length());           
      
        System.out.print("Index of first 'i' in Universities is: ");
        System.out.println(concatString2.substring(concatString2.indexOf("Universities"), 
                            concatString2.indexOf("Universities")+
                            ("Universities".length())).indexOf("i"));
      
        String string7 = "computer Applied science Applied Computer science science Applied computer"
                                + " Appleid computer Science Applied computer Applied";
        System.out.print("The first occurrence of word Computer is: ");
        System.out.println(string7.indexOf("Computer"));      
     
        String string8 = string3.trim().concat(" is one ").concat(string4).concat(" the ")
                            .concat(string6.trim()).concat(" which provides ")
          .concat(string7.substring(string7.indexOf("Applied"),string7.indexOf("Applied") + "Applied".length()))
          .concat(" ")
          .concat(string7.substring(string7.indexOf("Computer"), string7.indexOf("Computer") + "Computer".length()))
          .concat(" ").concat(string7.substring(string7.indexOf("Science"), string7.indexOf("Science") + "Science".length()));
        System.out.print("String of strings: ");
        System.out.println(string8);
        
        System.out.println("\n ******** Math Class ******** \n ");
        
        int value1 = 27;
        int value2 = 4;
        System.out.print("27 power 4 is: ");
        System.out.println(Math.pow(value1, value2));
        
        System.out.print("Secant of 27 is: ");
        System.out.println(Math.round(1/Math.cos(value1)));
        
        double myNumber = 43.35;
        System.out.print("Square root of 43.35 is: ");
        System.out.println(Math.sqrt(myNumber));
        System.out.print("Ceil Value of 43.35 is: ");
        System.out.println(Math.ceil(myNumber));
        System.out.print("Floor value is: ");
        System.out.println(Math.floor(myNumber));
        
        int myNumber1 = 30;
        int myNumber2 = 60;
        System.out.print("Cos(30)-rounded: ");// 0
        System.out.println(Math.round(Math.cos(myNumber1)));
        System.out.print("Cos(60)-rounded: ");// -1
        System.out.println(Math.round(Math.cos(myNumber2)));
        System.out.print("Tan(30)-rounded: ");// -6
        System.out.println(Math.round(Math.tan(myNumber1)));
        System.out.print("Tan(60)-rounded: ");// 0
        System.out.println(Math.round(Math.tan(myNumber2)));     
     
        System.out.print("Trigonometry: ");
        System.out.println(Math.ceil((1/Math.sin(value1)) * (Math.pow(3, 2)/Math.sqrt(Math.pow(4, 2) 
                            + 5 * 3 * 2 + 3))));
        System.out.println("\n");
        
        System.out.println("******** Random Class ********\n" + "\n" + "**Without Seed value**\n");
        Random r = new Random();
        System.out.print("First Random value:");
        System.out.println(r.nextInt(300));
        System.out.print("Second Random value:");
        System.out.println(r.nextInt(300));
        System.out.print("Third Random value:");
        System.out.println(r.nextInt(300)); 
        System.out.print("Fourth Random value:");
        System.out.println(r.nextInt(300));
        System.out.print("Fifth Random value:");
        System.out.println(r.nextInt());
        System.out.print("Sixth Random value:");
        System.out.println(r.nextInt());
        System.out.print("Seventh Random value:");
        System.out.println(r.nextInt());
        System.out.println("No, I don't get the same result each time.");
        
        System.out.println("\n**With Seed value**\n");
        Random r2 = new Random();
        r2.setSeed(20);
        System.out.print("First Random value:");
        System.out.println(r2.nextInt(300));
        System.out.print("Second Random value:");
        System.out.println(r2.nextInt(300));
        System.out.print("Third Random value:");
        System.out.println(r2.nextInt(300)); 
        System.out.print("Fourth Random value:");
        System.out.println(r2.nextInt(300));
        System.out.print("Fifth Random value:");
        System.out.println(r2.nextInt());
        System.out.print("Sixth Random value:");
        System.out.println(r2.nextInt());
        System.out.print("Seventh Random value:");
        System.out.println(r2.nextInt());
        System.out.println("Yes, I get the same result each time.");
        System.out.println("\n");
        System.out.println("The difference I noticed is, the numbers tend to change everytime the program is "
                + "being executed, when no seed is passed. But when the long value 20 is set as seed, the numbers "
                + "have not been changed and producing the same set of numbers everytime.");
        
        
       
        
        
        
        



        
        
    }
    
}
