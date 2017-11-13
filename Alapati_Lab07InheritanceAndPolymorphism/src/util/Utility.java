/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import ship.Point;
import ship.Ship;

/**
 * This is Utility class to calculate the distance between ships.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class Utility {

    /**
     * THis is no-argument constructor
     */
    private Utility() {

    }

    /**
     * This static method returns the distance to be traveled by a ship.
     *
     * @param p1
     * @param p2
     * @return distance.
     */
    public static double getDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2)
                + Math.pow((p2.getY() - p1.getY()), 2));
    }

    /**
     * This static method lets you know how far is your ship from other ships.
     *
     * @param shp
     * @param ships
     * @return result
     */
    public static String knowHowFarIsYourShipFromOthers(Ship shp, ArrayList<Ship> ships) {
        String result = "";
        if (!(ships.size() < 1)) {
            result = "Distance between " + shp.getShipName() + " and";
            for (Ship ship : ships) {
                result += "\n 		  " + ship.getShipName() + ":"
                        + String.format("%4.2f", getDistance(shp.getSourceLocation(),
                                ship.getSourceLocation()));
            }
        }
        return result;
    }
}
