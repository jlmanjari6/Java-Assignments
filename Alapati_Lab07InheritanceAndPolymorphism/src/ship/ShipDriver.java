/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.Utility;

/**
 * This is Driver class
 *
 * @author Lakshmi Manjari Alapati
 * @version October 16,2017.
 */
public class ShipDriver {
 
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

PassengerShip p = new Ferry();
Ferry f = new Ferry();
p=f;
f=(Ferry) p;
        Scanner scannerObj = new Scanner(new File("ship.txt"));
        List<Ship> shipList = new ArrayList<>();

        System.out.println("*****************************************************************\n"
                + "Welcome to " + scannerObj.nextLine()
                + "\n*****************************************************************");

        int modelSeries = scannerObj.nextInt();
        scannerObj.nextLine();
        String shipName;
        Point sourceLocation;
        Point destinationLocation;
        String model = "";

        while (scannerObj.hasNext()) {
            if (scannerObj.nextLine().toLowerCase().equals("passenger ship")) {
                String shipType = scannerObj.nextLine();
                shipName = scannerObj.nextLine();
                sourceLocation = new Point(scannerObj.nextDouble(), scannerObj.nextDouble());
                destinationLocation = new Point(scannerObj.nextDouble(), scannerObj.nextDouble());
                scannerObj.nextLine();
                model = scannerObj.nextLine();
                double basePrice = scannerObj.nextDouble();
                scannerObj.nextLine();

                if (shipType.toLowerCase().equals("cruise")) {
                    Cruise cruiseObj = new Cruise(shipName, modelSeries, shipName,
                            sourceLocation, destinationLocation, model, basePrice);
                    String options = scannerObj.nextLine();
                    cruiseObj.addFacilities(options);
                    System.out.println("\nCruise details: ");
                    System.out.println(cruiseObj.toString());
                    System.out.println(Utility.knowHowFarIsYourShipFromOthers(cruiseObj, (ArrayList) shipList));
                    System.out.println("*****************************************************************");
                    shipList.add(cruiseObj);

                } else if (shipType.toLowerCase().equals("ferry")) {
                    double time = Double.parseDouble(scannerObj.nextLine());
                    PassengerShip ferryObj = new Ferry(shipName, modelSeries, shipName,
                            sourceLocation, destinationLocation, model, basePrice,
                            time);
                    String options = scannerObj.nextLine();
                    ferryObj.addFacilities(options);
                    System.out.println("\nFerry details: ");
                    System.out.println(ferryObj.toString());
                    System.out.println(Utility.knowHowFarIsYourShipFromOthers(ferryObj, (ArrayList) shipList));
                    System.out.println("*****************************************************************");
                    shipList.add(ferryObj);
                }
            } else {
                String type = scannerObj.nextLine();
                int stockId = scannerObj.nextInt();
                scannerObj.nextLine();
                double stockWeight = scannerObj.nextDouble();
                scannerObj.nextLine();
                Good good = new Good(type, stockId, stockWeight);
                shipName = scannerObj.nextLine();
                sourceLocation = new Point(scannerObj.nextDouble(), scannerObj.nextDouble());
                destinationLocation = new Point(scannerObj.nextDouble(), scannerObj.nextDouble());
                scannerObj.nextLine();
                scannerObj.nextLine();
                CargoShip cargoObj = new CargoShip(shipName, modelSeries, shipName,
                        sourceLocation, destinationLocation, model);
                cargoObj.addGoods(good);
                System.out.println("\nCargo Ship details: ");
                System.out.println("Cargo Ship Name: " + shipName);
                System.out.println("The distance to be travelled by the ship is "
                        + String.format("%4.2f", cargoObj.getDistance()) + " miles");
                System.out.println("The type of stock on the ship is '" + type
                        + "' weighing " + stockWeight + " tons");
                System.out.println(cargoObj.toString());
                System.out.println(Utility.knowHowFarIsYourShipFromOthers(cargoObj, (ArrayList) shipList));
                System.out.println("*****************************************************************");
                shipList.add(cargoObj);
            }
        }

    }

}
