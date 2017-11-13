/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Square;

/**
 *
 * @author S530719
 */
public class Square {
    private double sideLength;
    
    /**
     * 
     * @param sideLengthIn 
     */
    public Square(double sideLengthIn)
    {
        sideLength = sideLengthIn;
    }
    
    /**
     * default constructor
     */
    public Square()
    {
        sideLength = 0.0;
    }
    
    /**
     * 
     * @return sideLength
     */
    public double getSideLength()
    {
        return sideLength;
    }    
    /**
     * 
     * @param sideLength 
     */
    public void setSideLength(double sideLength)
    { 
        this.sideLength = sideLength;
    }
    
    /**
     * 
     * @return area
     */
    public double getArea()
    {
        return sideLength*sideLength;
    }
    
    /**
     * 
     * @return perimeter
     */
    public double getPerimeter()
    {
        return 4*sideLength;
    }   
}
