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
public interface Interface01 {

    int foo(int myInt);

    default int goo(String myString) {
        System.out.println("Inside Interface01");
        return myString.length();
    }

}
