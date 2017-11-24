/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class HerdOfHorses implements Iterable {

    private HashSet<Horse> horseHerd;

    public HerdOfHorses() {
        horseHerd = new HashSet<>();
    }

    @Override
    public Iterator iterator() {
        return horseHerd.iterator();
    }

    public void addHorseToHerd(Horse horse) {
        horseHerd.add(horse);
    }

    public Horse findHorse(String horseName) {
        for (Horse h : horseHerd) {
            if (h.getName().equals(horseName)) {
                return h;
            }
        }
        return null;
    }
    
    public int getSize(){
        return horseHerd.size();
    }

}
