/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

/**
 *
 * @author S530719
 */
public class BookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book = new Book(123, "abc", 34.45);
        System.out.println(book);
        System.out.println(book.toString());
        
        Book book2 = new Book(45.3, 234 , "def");
        System.out.println(book2);
        System.out.println(book2.toString());
        
        Book book3 = new Book();
        System.out.println(book3);//1/Math.sin(27)
        int a =(int) Math.sin(90);
             //  System.out.println(Math.(1,a ));
             System.out.println(1/(Math.cos((27*3.14)/180)));
             System.out.println(Math.cos(Math.toDegrees(0)));
             
             System.out.println(Math.pow(2,4) + Math.sqrt(4) + Math.sin(Math.toRadians(90)));
            Math.sq
             double a1 = (1/Math.sin(Math.toRadians(27)))*(Math.pow(3, 2)/ Math.sqrt((Math.pow(4, 2) + (5)*(3)*(2) + 3)));
             System.out.println(a1);
             System.out.println(Math.ceil(24.6));
             System.out.println(Math.floor(24.6));
             byte b = -128;
    }
    
}
