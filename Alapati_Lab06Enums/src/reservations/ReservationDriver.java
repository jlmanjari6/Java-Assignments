/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is a driver class that reads data from input file and calls all the
 * enums and public methods from other classes.
 *
 * @author Lakshmi Manjari Alapati
 */
public class ReservationDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("inputFile.txt"));

        ReservationList reservationList = new ReservationList();

        while (sc.hasNext()) {
            String[] data = sc.nextLine().split(" ");
            Route route = new Route(data[0], data[1], data[2], data[3]);
            Reservation reservation = new Reservation(route, Airline.valueOf(data[4]), data[5], Hotel.valueOf(data[6]), Meal.valueOf(data[7]));
            reservationList.addReservation(reservation);
        }

        System.out.println("******************************************************************************************\n"
                + "Reservation List\n"
                + "******************************************************************************************");
        for (Reservation reservation : reservationList.getReserveList()) {
            System.out.println(reservation);
        }

        System.out.println("\n****************************************************************************************\n"
                + "Reservations that have source location \"DAL\"\n"
                + "******************************************************************************************");
        for (Reservation reservation : reservationList.findAllSourceLocations("DAL")) {
            System.out.println(reservation);
        }

        System.out.println("\n******************************************************************************************\n"
                + "Reservations that have source location \"MCI\"\n"
                + "********************************************************************************************");
        for (Reservation reservation : reservationList.findAllSourceLocations("MCI")) {
            System.out.println(reservation);
        }
    }

}
