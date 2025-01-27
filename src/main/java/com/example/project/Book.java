package com.example.project;

public class Book{
    // Initializes private attributes for the title, author, year published, isbn, and quantity of the Book.
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //Constructor with 5 parameters for the title, author, year published, isbn and quantity.
    public Book(String title, String author, int yearPublished, String isbn, int quantity)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    

    //Returns the String title.
    public String getTitle()
    {
        // returns title
        return title;
    }

    //Sets the String title to the given String newTitle.
    public void setTitle(String newTitle) 
    {
        //sets title to newTitle.
        title = newTitle;
    }

    //Returns the String author.
    public String getAuthor() 
    {
        //returns author.
        return author;
    }

    //Sets the String author to the given String newAuthor.
    public void setAuthor(String newAuthor) 
    {
        //sets author to newAuthor.
        author = newAuthor;
    }

    //Returns the int yearPublished.
    public int getYearPublished() 
    {
        // returns yearPublished
        return yearPublished;
    }

    //Sets the int yearPublished to the given int newYear.
    public void setYearPublished(int newYear) 
    {
        // sets yearPublished to newYear.
        yearPublished = newYear;
    }
    
    //Returns the String isbn
    public String getIsbn() 
    {
        //returns isbn
        return isbn;
    }

    //Sets the String isbn to the given String newIsbn.
    public void setIsbn(String newIsbn) 
    {
        //sets isbn to newIsbn.
        isbn = newIsbn;
    }

    //Returns the int quantity.
    public int getQuantity() 
    {
        //returns quantity.
        return quantity;
    }

    //Sets the int quantity to the given int newQuantity.
    public void setQuantity(int newQuantity) 
    {
        //sets quantity to newQuantity.
        quantity = newQuantity;
    }

    //Creates and returns a string to display the title, author, year published, isbn and quantity for each book.
    public String bookInfo()
    {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}