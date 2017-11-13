/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author S530719
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student(1, "abc", 21);
        Student s2 = new Student(2,"def", 22);     
   
        System.out.println(s1.getSName());
        s1.setSName("xyz");
         System.out.println(s1.getSName() + "\n");
         
         System.out.println(s1.getSId());
        s1.setSId(890);
         System.out.println(s1.getSId() + "\n");
         
         System.out.println(s1.getSAge());
        s1.setSAge(24);
         System.out.println(s1.getSAge());
    }
    
}
