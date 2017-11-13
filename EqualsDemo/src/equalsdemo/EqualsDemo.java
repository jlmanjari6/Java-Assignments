/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsdemo;

/**
 *
 * @author S530719
 */
public class EqualsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Hello";
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("***********************");
        System.out.println("str == str1: " + (str == str1));
        System.out.println("str == str2: " + (str == str2));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("***********************");
        System.out.println("str equals str1: " + str.equals(str1));
        System.out.println("str equals str2: " + str.equals(str2));
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("***********************");
        System.out.println("str hashcode: " + str.hashCode());
        System.out.println("str1 hashcode: " + str1.hashCode());
        System.out.println("str2 hashcode: " + str2.hashCode());
        System.out.println("***********************");
        String hexString = Integer.toHexString(System.identityHashCode(str));
        String hexString1 = Integer.toHexString(System.identityHashCode(str1));
        String hexString2 = Integer.toHexString(System.identityHashCode(str2));
        System.out.println("HexaDecimal Code str: " + hexString);
        System.out.println("HexaDecimal Code str1: " + hexString1);
        System.out.println("HexaDecimal Code str2: " + hexString2);
        System.out.println("***********************");
        
        Duck d1 = new Duck(5, "Blue", true);
        Duck d2 = new Duck(4, "Blue", false);
        Duck d3 = new Duck(4, "Blue", false);
      //  d1 = d3;        
        System.out.println("d1 hashcode: " + d1.hashCode());
        System.out.println("d2 hashcode: " + d2.hashCode());
        System.out.println("d3 hashcode: " + d3.hashCode());
        String hexString3 = Integer.toHexString(System.identityHashCode(d1));
        String hexString4 = Integer.toHexString(System.identityHashCode(d2));
        String hexString5 = Integer.toHexString(System.identityHashCode(d3));
        System.out.println("HexaDecimal Code d1: " + hexString3);
        System.out.println("HexaDecimal Code d2: " + hexString4);
        System.out.println("HexaDecimal Code d3: " + hexString5);
        System.out.println(d2 == d3);
        System.out.println(d1 == d3);
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1 == d3);
        
        String s1="hai";
        String s2="hai";
        String s3=new String("hai");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1==s2);
    }

}
