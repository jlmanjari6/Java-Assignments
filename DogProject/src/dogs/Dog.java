/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author S530719
 */
public class Dog {
    private String name;
    private String breed;
    
    public Dog(String nameIn, String breedIn)
    {
        name = nameIn;
        breed = breedIn;
    }
    
    public String getName(){
        return name;
    }
    
    public String getBreed(){
        return breed;/* afnke 
        sfgf
        */
    }
    
    public void setName(String nameIn){
        name = nameIn;
    }
    
    public void setBreed(String breedIn){
        breed = breedIn;
    }
    
    public String toString(){
        return name + " " + breed;
    }
    
    }
           
