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
public class Student {
    private int sId;
    private String sName;
    private int sAge;
    
    public Student(int id, String name, int age)
    {
        sId = id;
        sName = name;
        sAge = age;
    }

public int getSId(){
return sId;
}

public String getSName(){
    return sName;
}

public int getSAge(){
    return sAge;
}

public void setSId(int id)
{
    sId = id;   
}
public void setSName(String name)
{
    sName = name;   
}

public void setSAge(int age)
{
    sAge = age;   
}

}
