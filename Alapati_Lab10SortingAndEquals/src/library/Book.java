/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Genre;
import java.util.Random;

/**
 * Book represents a written or printed work consisting of pages glued together
 * along one side and bound in covers
 *
 * @author Lakshmi Manjari Alapati
 * @version Nov 6, 2017.
 */
public class Book extends Item {

    private Author[] authors;
    private String bookID;
    private int copyrightYear;
    private double edition;
    private Genre genre;
    public static int rackCounter = 0;
    private String rackNo;

    /**
     * Initializes the variables of this class and the super class.
     *
     * @param authors
     * @param copyrightYear
     * @param edition
     * @param genre
     * @param title
     */
    public Book(Author[] authors, int copyrightYear, double edition, Genre genre, String title) {
        super(title);
        this.authors = authors;
        this.copyrightYear = copyrightYear;
        this.edition = edition;
        this.genre = genre;
        bookID = generateUniqueID();
        rackNo = generateRackID();
    }

    /**
     * Returns an array of Author
     *
     * @return authors
     */
    public Author[] getAuthors() {
        return authors;
    }

    /**
     * Sets Authors of a book
     *
     * @param authors
     */
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    /**
     * Returns the copyright year of the book
     *
     * @return copyrightYear
     */
    public int getCopyrightYear() {
        return copyrightYear;
    }

    /**
     * Sets the copyright year of the book
     *
     * @param copyrightYear
     */
    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    /**
     * Returns edition of the book
     *
     * @return edition
     */
    public double getEdition() {
        return edition;
    }

    /**
     * Sets edition of the book
     *
     * @param edition
     */
    public void setEdition(double edition) {
        this.edition = edition;
    }

    /**
     * Returns genre of the book
     *
     * @return genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Sets genre of the book
     *
     * @param genre
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * This method concatenates LIBRARY_CODE, "_B_", counter and returns it.
     *
     * @return uniqueId
     */
    @Override
    public String generateUniqueID() {
        return LIBRARY_CODE + "_B_" + counter;
    }

    /**
     * This method generates rack identification number to keep the book at a
     * particular location in the library.
     *
     * @return rackId
     */
    @Override
    public java.lang.String generateRackID() {
        String randomString = "";
        String rackId = "";
        for (int i = 0; i < 2; i++) {
            char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            int select = new Random().nextInt(arr.length);
            randomString += arr[select];
        }

        rackId = randomString.toUpperCase() + "." + rackCounter + "." + copyrightYear;
        rackCounter++;
        return rackId;
    }

    /**
     * Invoke super.toString() and concatenate bookID, rackNo, edition and
     * authors.
     *
     * @return formattedAuthors
     */
    @Override
    public String toString() {
        String authorsList = "";
        for (Author a : authors) {
            String temp = ", ";
            if (a.equals(authors[authors.length - 1])) {
                temp = "";
            }
            authorsList += a.toString() + temp;
        }

        return "\n" + super.toString() + ", BookID: " + bookID + ", RackNo: "
                + rackNo + ", Edition: " + edition + ", Authors: " + authorsList;
    }

}
