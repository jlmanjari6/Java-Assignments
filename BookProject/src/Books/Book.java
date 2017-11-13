/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

/**
 *
 * @author S530719
 */
public class Book {
    private int isbn;
    private String bookName;
    private double price;
    
    public Book()
    {
        this.isbn = 10;
        this.bookName = "xyz";
        this.price = 90.9;
    }
    
    public Book(int isbnIn, String bookNameIn, double priceIn)
    {
        isbn = isbnIn;
        bookName = bookNameIn;
        price = priceIn;
    }
    
    public Book(double priceIn, int isbnIn, String nameIn)
    {
        this.price = priceIn;
        this.isbn = isbnIn;
        this.bookName = nameIn;
    }
    
     public Book(double priceIn, int isbnIn, String nameIn, int priceIn1)
    {
        this.price = priceIn;
        this.isbn = isbnIn;
        this.bookName = nameIn;
        this.price = priceIn1; 
        priceIn1 = 10;
    }
    
    
    public int getIsbn()
    {
        return isbn;
    }
    
    public String getBookName()
    {
        return bookName;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", bookName=" + bookName + ", price=" + price + '}';
    }
    
   
    
}
