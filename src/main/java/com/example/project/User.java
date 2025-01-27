package com.example.project;

public class User{
    //Initializes private attributes for the name and id of the user, as well as the 5 Books they have.
    private String name;
    private String id;
    private Book[] book = new Book[5];

    //Constructor with two parameters that initializes the name and id
    public User(String name, String id)
    {
        this.name = name;
        this.id = id;
    }
 
    //Returns the String name.
    public String getName() 
    {
        //returns name
        return name;
    }

    //Sets the String name to the String newName.
    public void setName(String newName) 
    {
        // sets name to newName
        name = newName;
    }

    //Returns the String id.
    public String getId() 
    {
        //returns id
        return id;
    }

    //Sets the String id to the String newId.
    public void setId(String newId) 
    {
        // sets id to newId
        id = newId;
    }

    //Returns the Book array book.
    public Book[] getBooks() 
    {
        //returns book;
        return book;
    }

    //Sets the Book array book to the Book array newBooks.
    public void setBooks(Book[] newBooks) 
    {
        //sets book to newBooks.
        book = newBooks;
    }

    //Creates and returns a string to display the values in the array book.
    public String bookListInfo()
    {
        String list = "";

        //With an enhanced for loop, iterates through the array book.
        for (Book b : book)
        {
            // To avoid NullExceptionErrors, checks if the Book b is null, and prints empty if it is instead of printing book info.
            if (b == null)
            {
                list += "empty\n";
            }
            // Prints book info if the Book b is NOT null.
            else
            {
                list += b.bookInfo() + "\n";
            }
        }
        // Returns the String of the Book array.
        return list;
    } 

    //Creates and returns a string to display the name, id and books information for each user.
    public String userInfo()
    {
        return  "Name: " + name + "\nId: " + id + "\nBooks: \n" + bookListInfo();
    } 
       
}