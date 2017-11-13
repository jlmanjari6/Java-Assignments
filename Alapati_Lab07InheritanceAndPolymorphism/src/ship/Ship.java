/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 * This is Ship class being inherited by PassengerShip and CargoShip classes.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class Ship {

    private String manufacturerName;
    private int modelSeries;
    private Point sourceLocation;
    private Point destinationLocation;
    private String shipName;
    private String model;

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
    public Ship(String manufacturerName, int modelSeries, String shipName,
            Point sourceLocation, Point destinationLocation, String model) {
        this.manufacturerName = manufacturerName;
        this.modelSeries = modelSeries;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.shipName = shipName;
        this.model = model;
    }

    /**
     * This is no-argument constructor.
     */
    public Ship() {
    }

    /**
     * This is get method to return manufacturer name.
     *
     * @return manufacturerName
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * This method sets the value for manufacturer name.
     *
     * @param manufacturerName
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /**
     * This is get method to return model series
     *
     * @return modelSeries
     */
    public int getModelSeries() {
        return modelSeries;
    }

    /**
     * This method sets the value for model series.
     *
     * @param modelSeries
     */
    public void setModelSeries(int modelSeries) {
        this.modelSeries = modelSeries;
    }

    /**
     * This is get method to return source location
     *
     * @return sourceLocation
     */
    public Point getSourceLocation() {
        return sourceLocation;
    }

    /**
     * This method sets the value for source location
     *
     * @param sourceLocation
     */
    public void setSourceLocation(Point sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * This is get method to return destination location
     *
     * @return
     */
    public Point getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * This method sets the value for destination location
     *
     * @param destinationLocation
     */
    public void setDestinationLocation(Point destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /**
     * This is get method to return ship name
     *
     * @return shipName
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * This method sets the value for ship name
     *
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /**
     * This is get method to return model
     *
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * This method sets the value for model
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * THis is toString method to return details
     *
     * @return formattedDetails
     */
    @Override
    public String toString() {
        return "Ship{" + "manufacturerName=" + manufacturerName + '}';
    }
}
