/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author S530719
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog("Snoopy", "abc breed");
        Dog d2 = new Dog("Puppy", "def breed");
        
        System.out.println("Dog d1: " + d1.getName() + " " + d1.getBreed());
        System.out.println("Dog d2: " + d2.getName() + " " + d2.getBreed());
        System.out.println(d1.toString());
        System.out.println(d1);
        
    }
    
}
