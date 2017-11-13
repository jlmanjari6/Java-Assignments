/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums2;

/**
 *
 * @author S530719
 */
public enum PizzaCost {
    LARGE(15,10), MEDIUM(10, 6), SMALL(7, 4);
    
    private double price;
    private int size;
    
    private PizzaCost(double price, int size)
    {
        this.price = price;
        this.size = size;
    }
    
public double getPrice()
{
return price;
}

public int getSize(){
    System.out.println(getPrice());
    return size;
}

}
