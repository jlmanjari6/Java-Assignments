/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Limit;

/**
 *
 * @author Vineeth Agarwal
 */
public class Faculty extends Member {
    private String department;
    public Faculty(String department,String name, int age) {
        super(name, age);
        this.department=department;
        this.setItems(new Item[Limit.FACULTY.getItemLimit()]);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDepartment: " + department;
    }
    
    
    
}
