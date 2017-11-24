/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class ws3 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner scan = new Scanner(new File("C:\\Users\\S530719\\Documents\\NetBeansProjects\\MapsWorksheet\\src\\ws3\\words"));
        HashMap<String, Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();

        while (scan.hasNext()) {
            String word = scan.next();
            if (!(map.containsKey(word))) {
                map.put(word, 1);
            } else {
                int a = map.get(word);
                a++;
                map.put(word, a);
            }
        }

        System.out.println(map);

        System.out.println("Number of distinct words: ");
        for (Map.Entry pair : map.entrySet()) {
            if (pair.getValue().equals(1)) {
                System.out.println(pair.getKey());
            }
        }
       
        
        System.out.println("Most frequently occurring word: " + map.entrySet() );
        

    }

}
