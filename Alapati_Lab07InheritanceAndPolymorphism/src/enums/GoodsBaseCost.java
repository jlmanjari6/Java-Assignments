/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * This is GoodsBaseCost enumerator holding the initial costs at low and heavy
 * weights for each constant.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16, 2017.
 */
public enum GoodsBaseCost {

    ANIMALS(1000, 2000), CHEMICAL(1000, 3000), WOOD(900, 2000), VEHICLES(1100, 2500),
    OTHERS(800, 1600);

    private final double initialCostForLowWeight;
    private final double initialCostForHeavyWeight;

    /**
     * This is parameterized constructor.
     *
     * @param initialCostForLowWeight
     * @param initialCostForHeavyWeight
     */
    private GoodsBaseCost(double initialCostForLowWeight, double initialCostForHeavyWeight) {
        this.initialCostForLowWeight = initialCostForLowWeight;
        this.initialCostForHeavyWeight = initialCostForHeavyWeight;
    }

    /**
     * This is get method to return initial cost for low weight
     *
     * @return initialCostForLowWeight
     */
    public double getInitialCostForLowWeight() {
        return initialCostForLowWeight;
    }

    /**
     * This is get method to return initial cost for heavy weight
     *
     * @return initialCostForHeavyWeight
     */
    public double getInitialCostForHeavyWeight() {
        return initialCostForHeavyWeight;
    }

}
