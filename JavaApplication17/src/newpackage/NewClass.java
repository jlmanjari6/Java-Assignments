/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author S530719
 */
public class NewClass {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public NewClass()
    {
    id=10;
    name="abc";
    }
    
    public NewClass(int id ,String name)
    {
        this.id = id;
       this.name =name;
    }
    
}
