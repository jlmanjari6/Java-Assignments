/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.util.ArrayList;

/**
 * This is Reservation List class.
 *
 * @author Lakshmi Manjari Alapati
 * @version October 09, 2017
 */
public class ReservationList {

    private ArrayList<Reservation> reserveList;

    /**
     * This is parameterized constructor.
     */
    public ReservationList() {
        this.reserveList = new ArrayList<>();
    }

    /**
     * This is get method to return reservation list.
     *
     * @return reserveList
     */
    public ArrayList<Reservation> getReserveList() {
        return reserveList;
    }

    /**
     * This method will take reservation object as parameter and will add the
     * reservation to reserveList arrayList
     *
     * @param reservation
     */
    public void addReservation(Reservation reservation) {
        reserveList.add(reservation);
    }

    /**
     * This method will take position and reservation object as parameters. If
     * the position passed is less than or equal to the size of the ArrayList,
     * then add the reservation to reserveList at the specified position.
     *
     * @param position
     * @param reservation
     */
    public void addReservation(int position, Reservation reservation) {
        if (position <= reserveList.size()) {
            reserveList.add(position, reservation);
        }
    }

    /**
     * This method will iterate through the reserveList and find all the source
     * locations that matches with the passed string, adds the matched
     * reservations to a new ArrayList and returns it
     *
     * @param source
     * @return matched array list.
     */
    public ArrayList<Reservation> findAllSourceLocations(String source) {
        ArrayList<Reservation> matchedList = new ArrayList<>();
        for (Reservation reservation : reserveList) {
            if (reservation.getRoute().getSource().equals(source)) {
                matchedList.add(reservation);
            }
        }
        return matchedList;
    }

}
