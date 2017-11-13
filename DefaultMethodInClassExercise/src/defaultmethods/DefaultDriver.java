/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethods;

/**
 *
 * @author S530719
 */
public class DefaultDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyClass class1 = new MyClass();
       
        System.out.println(class1.foo(3));
        System.out.println(class1.goo("Good Bye!"));
//        
        Interface01 i=new MyClass();
        System.out.println(i.goo("Hai"));

    }

}
