/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2;

import java.util.LinkedList;
import java.util.TreeMap;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Thesaurus {

    LinkedList<String> values = new LinkedList<>();
    TreeMap<String, LinkedList<String>> thesaurus;

    public Thesaurus() {
        thesaurus = new TreeMap<>();
    }

    public void addWord(String word) {
        thesaurus.put(word, new LinkedList<>());
    }

    public void addSynonym(String word, String synonym) {
        if(!(thesaurus.containsKey(word))){
            thesaurus.put(word, new LinkedList<>());
        }
        values = thesaurus.get(word);
        values.add(synonym);
        thesaurus.put(word, values);
    }
    
    public LinkedList<String> getSynonyms(String word){
        return thesaurus.get(word);
    }

    @Override
    public String toString() {
        return "Thesaurus{" + "thesaurus=" + thesaurus + '}';
    }
    
    

}
