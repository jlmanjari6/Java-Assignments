/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 * This is Point class holding x and y coordinates of a location.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class Point {

    private double x;
    private double y;

    /**
     * This is parameterized constructor.
     *
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This is get method to return x
     *
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * This method sets the value for x
     *
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * This is get method to return y
     *
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * This method sets the value for y
     *
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

}
