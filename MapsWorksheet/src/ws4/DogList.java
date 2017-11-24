/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class DogList {

    private LinkedList<Dog> dList;

    public DogList() {
        dList = new LinkedList<>();
    }

    public void addDog(Dog d) {
        dList.add(d);
    }

    public int getOldest() {
        ArrayList<Integer> a = new ArrayList<>();
        for (Dog d : dList) {
            a.add(d.getAge());
        }
        Collections.sort(dList);
        return dList.getLast().getAge();
    }

    public double getAverageAge() {
        ArrayList<Integer> a = new ArrayList<>();
        for (Dog d : dList) {
            a.add(d.getAge());
        }
        double ageAvg = 0;
        for (int i = 0; i < a.size(); i++) {
            ageAvg += a.get(i);
        }
        return ageAvg / a.size();
    }

    public TreeMap<String, LinkedList<String>> getBreeds() {
        TreeMap<String, LinkedList<String>> map = new TreeMap<>();
        LinkedList<String> values;

        for (Dog d : dList) {
            if ((!map.containsKey(d.getBreed()))) {
                map.put(d.getBreed(), new LinkedList<>());
            } else {
                values = map.get(d.getBreed());
                values.add(d.getName());
                map.put(d.getBreed(), values);
            }
        }

        return map;
    }

    @Override
    public String toString() {
        String res = "";
        Collections.sort(dList);
        for (Dog d : dList) {
            res += d.toString() + "\n";
        }
        return res;
    }
}
