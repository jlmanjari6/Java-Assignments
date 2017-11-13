/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 * This is Good class holding stock details.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class Good {

    private String type;
    private int stockID;
    private double stockWeight;

    /**
     * This is parameterized constructor.
     *
     * @param type
     * @param stockID
     * @param stockWeight
     */
    public Good(String type, int stockID, double stockWeight) {
        this.type = type;
        this.stockID = stockID;
        this.stockWeight = stockWeight;
    }

    /**
     * This is get method to return type
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This methods sets value for type.
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This is get method to return stockId.
     *
     * @return stockID
     */
    public int getStockID() {
        return stockID;
    }

    /**
     * This method sets value for stockId.
     *
     * @param stockID
     */
    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    /**
     * This is get method to return stock weight
     *
     * @return stockWeight.
     */
    public double getStockWeight() {
        return stockWeight;
    }

    /**
     * This method sets value for stock weight.
     *
     * @param stockWeight
     */
    public void setStockWeight(double stockWeight) {
        this.stockWeight = stockWeight;
    }

}
