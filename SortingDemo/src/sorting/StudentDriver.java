/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author S530719
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scan = new Scanner(new File("StudentData.txt"));
        while (scan.hasNext()) {
            Student s = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextDouble());
            studentList.add(s);
        }
        System.out.println("ArrayList after reading the input: ");
        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("ArrayList after sorting in a natural order: ");
        Collections.sort(studentList);
        for (Student s : studentList) {
            System.out.println(s);
        }
//
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                if (s1.getlName().compareTo(s2.getlName()) == 0) {
//                    return s1.getfName().compareTo(s2.getfName());
//                } else {
//                    return s1.getlName().compareTo(s2.getlName());
//                } // end if-else
//            } // end compareTo
//
//        }
//        );
//        
//         System.out.println("ArrayList after sorting in a SORTED order: ");
//        Collections.sort(studentList);
//        for (Student s : studentList) {
//            System.out.println(s);
//        }

    }

}
