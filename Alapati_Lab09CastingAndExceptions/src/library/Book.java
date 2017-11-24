/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Genre;
import java.util.Random;

/**
 *
 * @author Vineeth Agarwal
 */
public class Book extends Item{


    /*declare size*/
    private Author[] authors;
    private int copyrightYear;
    private double edition;
    private String bookID;
    private Genre genre;
    public static int rackCounter=0;
    private String rackNo;

    public Book(Author[] authors, int copyrightYear, 
            double edition, Genre genre, String title) {
        super(title);
        this.authors = authors;
        this.copyrightYear = copyrightYear;
        this.edition = edition;
        this.genre = genre;
        bookID=generateUniqueID();
        rackNo=generateRackID();      
    }
    
    @Override
    public String generateRackID() {
        String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r1=new Random();
        int alp1=r1.nextInt(26);
        int alp2=r1.nextInt(26);
        String rackID=alphabets.substring(alp1,alp1+1)+alphabets.substring(alp2,alp2+1)+"."+
                rackCounter+"."+copyrightYear;
        rackCounter++;
        return rackID;
    }

    @Override
    public String generateUniqueID() {
        
        return LIBRARY_CODE+"_B_"+counter;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public double getEdition() {
        return edition;
    }

    public void setEdition(double edition) {
        this.edition = edition;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String authorsList="";
        for(Author a:authors)
        {
            String temp=", ";
            if(a.equals(authors[authors.length-1]))
            {
                temp="";
            }
        authorsList+=a.toString()+temp;
        }
        
        return super.toString() + ", BookID: "+ bookID +", RackNo: "+ 
            generateRackID() + ", Edition: "+edition +", Authors: "+ authorsList;
    }
        
    
    }
    



