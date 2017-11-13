/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Comparator;

/**
 * BookComparator that compares books
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6,2017
 */
public class BookComparator implements Comparator<Book> {

    public BookComparator() {

    }

    /**
     * This method compares two books by their editions returns the value
     * depending on the result of the comparison, returns -1 if the edition of
     * the book t is less than the edition of the book t1 returns 0 if the
     * editions are equals return 1 if above both conditions are failed
     *
     * @param t
     * @param t1
     * @return result
     */
    @Override
    public int compare(Book t,
            Book t1) {
        if (t.getEdition() == t1.getEdition()) {
            return 0;
        } else if (t.getEdition() < t1.getEdition()) {
            return -1;
        } else {
            return 1;
        }
    }
}
