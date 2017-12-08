/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Students {

    private TreeMap<Integer, Student> stuMap;

    public Students() {
        stuMap = new TreeMap<>();
    }

    public void addStu(Student stu) {
        stuMap.put(new Integer(stu.getStudentId()), stu);
    }

    public void removeStu(Student stu) {
        stuMap.remove(stu.getStudentId());
    }

    public Student getStu(short id) {
        for (Integer i : stuMap.keySet()) {
            if (i == id) {
                return stuMap.floorEntry(i).getValue();
            }
        }
        return null;
    }

    public Collection<Student> allStudents() {
        return stuMap.values();
    }

    public Iterator<Student> listStudents() {
        Set s = stuMap.entrySet();
//        return stuMap.entrySet().iterator();
        return s.iterator();
    }

}
