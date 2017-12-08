/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class MapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n\nTree Map");
        System.out.println("##############");
        
        HashMap<String, String> stateMap = new HashMap<>();
        stateMap.put("Missouri", "MO");
        stateMap.put("Texas", "TX");
        stateMap.put("Illinois", "IL");
        stateMap.put("New York", "NY");
        stateMap.put("New Jersey", "NJ");
        stateMap.put("New York", "NYC");

        System.out.println(stateMap);
        System.out.println("remove: " + stateMap.remove("Illinois"));
        System.out.println("remove: " + stateMap.remove("Illinois"));

        System.out.println(stateMap.entrySet());
        System.out.println(stateMap.get("New York"));
        System.out.println(stateMap.keySet());
        System.out.println(stateMap.values());

        System.out.println(stateMap.containsKey("Illinois"));
        System.out.println(stateMap.containsKey("Texas"));

        System.out.println(stateMap.containsValue("TX"));
        System.out.println(stateMap.containsKey("IL"));
        
        System.out.println("\n\nHash Map");
        System.out.println("##############");
        
        HashMap<String, ArrayList<String>> movieMap = new HashMap<>();

        movieMap.put("Mahesh Babu", new ArrayList<String>() {
            {
                add("Khaleja");
            }
        });
        movieMap.get("Mahesh Babu").add("1");
        movieMap.put("Mahesh Babu", movieMap.get("Mahesh Babu"));
        movieMap.put("Allu Arjun", new ArrayList<String>() {
            {
                add("Arya");
                add("Happy");
            }
        });
        System.out.println(movieMap.put("Tarak", new ArrayList<String>() {
            {
                add("Jai lava kusa");
                add("Simhadri");
            }
        }));

        System.out.println(movieMap.entrySet());
        System.out.println(movieMap.get("New York"));
        System.out.println(movieMap.get("Mahesh Babu"));
        System.out.println(movieMap.keySet());
        System.out.println(movieMap.values());
    }

}
