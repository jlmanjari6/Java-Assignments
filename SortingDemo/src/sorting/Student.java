/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author S530719
 */
public class Student implements Comparable<Student> {

    private int id;
    private String fName;
    private String lName;
    private double gpa;

    public Student(int id, String lName, String fName, double gpa) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", gpa=" + gpa + '}';
    }

    @Override
    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id);
//        return Double.compare(this.gpa, o.gpa);
//Integer i = new Integer(this.id);
//Integer j = new Integer(o.id);
//return i.compareTo(j);
//        return lName.compareTo(o.lName);    
//        return fName.compareTo(o.fName);

return this.id - o.getId();
    }

}
