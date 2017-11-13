/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePackage;

/**
 *
 * @author S530719
 */
public class Sample {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    
    public Sample(int idIn, String nameIn, String authorIn){
        bookId= idIn;
        bookName = nameIn;
        bookAuthor = authorIn;
    }
    
    public int getBookId(){
        return bookId;
    }
    
    public String getBookName(){
        return bookName;
    }
    
    public String getBookAuthor(){
        return bookAuthor;
    }
    
    public void setBookId(int id){
        bookId = id;
    }
    
    public void setBookName(String name){
        bookName = name;
    }
    
    public void setBookAuthor(String author){
        bookAuthor = author;
    }
    
    public String toString(){
        return bookAuthor + ": " + bookName;
    }
    
    
}
