/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class SetDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Set<String> mySet = new HashSet<>();
//        mySet.add("Northwest");
//        mySet.add("Java");
//        mySet.add("OOPS");
//        mySet.add("Northwest");
//        System.out.println(mySet.size());
//        System.out.println(mySet);
//        
//        Set<String> mySet1 = new TreeSet<>();
//        mySet1.add("Northwest");
//        mySet1.add("java");
//        mySet1.add("OOPS");
//        mySet1.add("northwest");
//        mySet1.add("%northwest");
//        mySet1.add("(northwest");
//        mySet1.add("  northwest");
//        System.out.println(mySet1.size());
//        System.out.println(mySet1);
        HashSet<String> dogSet = new HashSet<String>();
        dogSet.add("Midge");
        dogSet.add("Zelda");
        dogSet.add("Eve");
        dogSet.add("Carmen");
        dogSet.add("Leonard");
        dogSet.add("Zelda");
        dogSet.add(new String("Zelda"));
        System.out.println("Dog set contains " + dogSet.size() + " elements: " + dogSet);
        System.out.println("Midge is in set: " + dogSet.contains("Midge"));
        System.out.println("Odie is in set: " + dogSet.contains("Odie"));
        dogSet.remove("Midge");
        System.out.println("Dog set contains " + dogSet.size() + " elements: " + dogSet);
        System.out.println("Midge is in set: " + dogSet.contains("Midge"));
        
        
        TreeSet<String> catSet = new TreeSet<String>();
        catSet.add("Maude");
        catSet.add("Garfield");
        catSet.add("Button");
        catSet.add("Moskowitz");
        catSet.add("Albert");
        catSet.add("Albert");
        System.out.println();
        System.out.println(catSet);
        System.out.println();
        System.out.println("Maude is in set: " + catSet.contains("Maude"));
        System.out.println();
        for (String cat : catSet) {
            System.out.println(cat);
        }
        System.out.println();
        
        Iterator<String> iter = catSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(new Integer(1));
        System.out.println(s);
            
            
    }

}
