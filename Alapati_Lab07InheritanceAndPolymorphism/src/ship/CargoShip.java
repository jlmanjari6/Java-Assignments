/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.GoodsBaseCost;
import java.util.ArrayList;

/**
 * This is CargoShip class inheriting the Ship class, additionally holding the
 * goods.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class CargoShip extends Ship {

    private ArrayList<Good> goods;

    /**
     * This is no-argument constructor.
     */
    public CargoShip() {
    }

    /**
     * This is parameterized constructor.
     *
     * @param manufacturerName
     * @param modelSeries
     * @param shipName
     * @param sourceLocation
     * @param destinationLocation
     * @param model
     */
    public CargoShip(String manufacturerName, int modelSeries, String shipName,
            Point sourceLocation, Point destinationLocation, String model) {
        super(manufacturerName, modelSeries, shipName, sourceLocation,
                destinationLocation, model);
        goods = new ArrayList<>();
    }

    /**
     * this method is used to add goods options taken from a string to an array list.
     * @param options
     * @return goods
     */
    public ArrayList<Good> addGoods(Good options) {
        goods.add(options);
        return goods;
    }

    /**
     * This method returns the distance between source and destination of type
     * double.
     *
     * @return distance.
     */
    public double getDistance() {
        return Math.sqrt(Math.pow((super.getDestinationLocation().getX()
                - super.getSourceLocation().getX()), 2)
                + Math.pow((super.getDestinationLocation().getY()
                        - super.getSourceLocation().getY()), 2));
    }

    /**
     * This method returns the cost based on the stock weight and distance, of
     * type double.
     *
     * @return calculatedCost.
     */
    public double calcCostBasedOnWeightNDist() {
        Good good = goods.get(goods.size() - 1);
        if (good.getStockWeight() >= 2000) {
            if (getDistance() >= 1000) {
                return GoodsBaseCost.valueOf(good.getType().toUpperCase())
                        .getInitialCostForHeavyWeight() + 2.60 * getDistance();
            } else {
                return GoodsBaseCost.valueOf(good.getType().toUpperCase())
                        .getInitialCostForHeavyWeight() + 1.33 * getDistance();
            }
        } else {
            if (getDistance() >= 1000) {
                return GoodsBaseCost.valueOf(good.getType().toUpperCase())
                        .getInitialCostForLowWeight() + 2.60 * getDistance();
            } else {
                return GoodsBaseCost.valueOf(good.getType().toUpperCase())
                        .getInitialCostForLowWeight() + 1.33 * getDistance();
            }
        }
    }

    /**
     * This method applies tax on the value returned from
     * calcCostBasedOnWeightNDist() and returns the final cost needs to be
     * payable to the ship, of type double. The tax is applied based on the type
     * of stock.
     *
     * @return CalculatedCostWithTax.
     */
    public double calculateCostWithTax() {
        Good good = goods.get(goods.size() - 1);
        if (good != null) {
            switch (good.getType().toUpperCase()) {
                case "CHEMICAL":
                    return calcCostBasedOnWeightNDist() + calcCostBasedOnWeightNDist()
                            * 14 / 100;
                case "WOOD":
                    return calcCostBasedOnWeightNDist() + calcCostBasedOnWeightNDist()
                            * 10 / 100;
                case "FOOD":
                    return calcCostBasedOnWeightNDist() + calcCostBasedOnWeightNDist()
                            * 12 / 100;
                case "OTHER":
                    return calcCostBasedOnWeightNDist() + calcCostBasedOnWeightNDist()
                            * 8 / 100;
                default:
                    return calcCostBasedOnWeightNDist() + calcCostBasedOnWeightNDist()
                            * 8 / 100;
            }
        }
        return 0.0;
    }

    /**
     * This is toString method to print details.
     *
     * @return formattedString
     */
    @Override
    public String toString() {
        return "The total cost calculated to carry the stock is: $"
                + String.format("%4.2f", calculateCostWithTax());
    }
}
