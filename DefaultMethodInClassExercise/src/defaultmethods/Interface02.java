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
interface Interface02 {

    default int goo(String myString) {
        System.out.println("Inside Interface02 – goo");
        return myString.lastIndexOf("o");
    }

}
