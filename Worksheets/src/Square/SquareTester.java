/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Square;

/**
 *
 * @author S530719
 */
public class SquareTester {
String name = "keerthi";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Square s1 = new Square();
        Square s2 = new Square(4.1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getSideLength());
        
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getSideLength());
        
        s1.setSideLength(2.2);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getSideLength());
        
        s2.setSideLength(3.3);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getSideLength());
    }
    
}
