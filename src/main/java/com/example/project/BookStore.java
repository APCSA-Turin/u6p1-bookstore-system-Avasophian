package com.example.project;

public class BookStore{

    // Initializes the arrays books and users
    // books, while not being created with ArrayList, is a dynamic array so it is initialized to 0.
    // However, it can be changed by various methods.
    // users is a static (not literally) array, it will always have length 10.
    // Unlike in books, if users has no user for a certain index, it will be 'null' instead of completely empty.
    private Book[] books = new Book[0];
    private User[] users = new User[10];

    // Empty constructor.
    public BookStore(){}

    // Returns the User array users.
    public User[] getUsers()
    {
        // returns the array of users
        return users;
    }

    // Sets the User array users to the User array u.
    public void setUsers(User[] u)
    {
        // sets the array users to the array u
        users = u;
    }

    // Returns the Book array books.
    public Book[] getBooks()
    {
        // returns the array of books books
        return books;
    }

    // Adds a new user to the first index that's equal to null (basically, the first empty slot) in the array users.
    // For example, if users = u1, u2, u3, u4, u5, null, null, null, null, null
    // and addUser(u6) is called
    // then the result will be users = u1, u2, u3, u4, u5, u6, null, null, null, null
    public void addUser(User user)
    {
        //Iterates through users with a loop.
        for (int i = 0; i < users.length; i++)
        {
            //Checks for the first null value in users.
            if (users[i] == null)
            {
                //Sets the first null value to user and ends the loop
                users[i] = user;
                break;
            }
        }

    } 

    // If the User user is present in the users array, removes user and consolidates the array with consolidateUsers().
    // For example, if users = u1, u2, u3, u4, u5, u6, u7, u8, u9, u10
    // and removeUser(u3) is called
    // then the result will be users = u1, u2, u4, u5, u6, u7, u8, u9, u10, null
    public void removeUser(User user)
    {
        //Iterates through users with a loop.
        for (int i = 0; i < users.length; i++)
        {
            // Checks to see if users at the index is equal to the user that needs to be removed.
            if (users[i] == user)
            {
                users[i] = null;
                consolidateUsers();
                // Terminates the loop once user is removed.
                break;
            }
        }
    }

    // Removes any null values from in between users and places them all at the back of the array, essentially consolidating it.
    // For example, if users = u1, u2, null, null, u3, u4, u5, null, null, null
    // this method will make users = u1, u2, u3, u4, u5, null, null, null, null, null.
    public void consolidateUsers()
    {
        int j = 0;
        User [] newUsers = new User[users.length];
        //Iterates through users with a loop.
        for (int i = 0; i < users.length; i++)
        {
            // Checks to see if users[i] is equal to null.
            // If users[i] is equal to null, that index is skipped in newUsers
            if (users[i] != null)
            {
                newUsers[j] = users[i];
                j ++;
            }
        }
        // sets users to newUsers (the consolidated array)
        users = newUsers;
    }

    // Adds a new Book (aptly named book) to the end of the array books.
    // For example, if books = b1, b2, b3
    // and addBook (b4) is called
    // this method will make books = b1, b2, b3, b4.
    public void addBook(Book book)
    {
        // Creates a new Book array with the length of the original books array + 1.
        // This is because this method will add 1 book to the books array each time it is called. 
        Book[] newBooks = new Book[books.length + 1];

        // Iterates through the original books array.
        for (int i = 0; i < books.length; i++)
        {
            // Sets each value in newBooks to the corresponding value in the original books array.
            newBooks[i] = books[i];
        }

        // Iterates through the new newBooks array.
        for (int i = 0; i < newBooks.length; i++)
        {
            //Checks for the first null value.
            //Because newBooks has one higher length than the original books array, there will always be a null value in newBooks.
            if (newBooks[i] == null)
            {
                //sets newBooks equal to book at the first null value and terminates the loop.
                newBooks[i] = book;
                break;
            }
        }
        //sets books to newBooks, updating the array and making it dynamic.
        books = newBooks;
    }

    // Inserts a new Book (aptly named book) to the array books, in index index.
    // For example, if books = b1, b2, b3
    // and insertBook (b4, 1) is called
    // this method will make books = b1, b4, b2, b3
    public void insertBook(Book book, int index)
    {
        // Creates a new Book array with the length of the original books array + 1.
        // This is because this method will add 1 book to the books array each time it is called. 
        Book[] newBooks = new Book[books.length + 1];

        // Iterates through the  array newBooks until i reaches index index.
        for (int i = 0; i < index; i++)
        {
           // Sets each value in newBooks to the corresponding value in original books array.
            newBooks[i] = books[i];
        }
        
        //Iterates through the array newBooks, setting i to index. 
        //Essentially, this 'skips' putting a value where the index is, keeping it at a null value.
        for (int i = index; i < newBooks.length; i++)
        {
            // Sets each value in newBooks to the corresponding value in books array.
            // It is subtracted by 1 to account for the fact that the index index was 'skipped' in newBooks.
            newBooks[i] = books[i - 1];
        }

        // Inserts the Book book at the previously 'skipped' index which is currently null.
        newBooks[index] = book;

        // sets books to newBooks, updating the array and making it dynamic.
        books = newBooks;

    }


    // Removes a certain Book (aptly named book) from the array books
    // For example, if books = b1, b2, b3, and b1 has quantity 2.
    // and removeBook(b1) is called
    // books will remain = b1, b2, b3, but b1 will have quantity 1.
    // If removeBook(b1) is called AGAIN,
    // books = b2, b3.
    public void removeBook(Book book)
    {
        // Checks that the quantity is greater than 0. 
        // Removes one from the quantity, removing a book.
        if (book.getQuantity() > 0)
        {
            //Sets the quantity of book to the quantity minus one.
            book.setQuantity(book.getQuantity() - 1);
        }

        // Checks that the updated quantity is less than or equal to 0.
        // This is because the method removeBook() removes the book completely from the array (modifying its length) if the quantity is less than or equal to 0 after the book is removed.
        if (book.getQuantity() <= 0) 
        {
            // Creates a new Book array with the length of the original books array - 1.
            // This is because this method will remove 1 book from the books array if the quantity has become 0 after a book is removed.
            Book[] newBooks = new Book[books.length - 1];
            int j = 0;
            for (Book b : books)
            {
                //Checks that the b value in books is NOT equal to the book that needs to be removed.
                // if b is NOT equal to the book that needs to be removed, sets newBooks at that same index to b, and increments j.
                // A normal for loop probably would have been better. But nobody is perfect.
                if (b != book)
                {
                    newBooks[j] = b;
                    // Increments j each time b is not equal to the book that needs to be removed.
                    j++;
                }
            }
            //sets books to newBooks, updating the array and making it dynamic.
            books = newBooks;
        }
    }
       
    //Creates and returns a String to display the books within the array books.
    public String bookStoreBookInfo()
    {
        String stringToReturn = "";
        // i keeps track of which number book is being displayed.
        int i = 1;
        for (Book b: books)
        {
            stringToReturn += "Book " + i + ": \n \n";
            // To avoid a NullExceptionError (checking b.bookInfo() on a null index) checks if b is equal to null. If so, adds empty to the String.
            if (b == null)
            {
                stringToReturn += "empty" + "\n";
            }
            // Adds the book info of b to the string.
            else
            {
                stringToReturn += b.bookInfo() + "\n";
            }
            i++;
        }
        //returns the neatly displayed String.
        return stringToReturn;
    }

    public String bookStoreUserInfo()
    {
        String stringToReturn = "";
        // i keeps track of which number user is being displayed.
        int i = 1;
        for (User u: users)
        {
            stringToReturn += "User " + i + ": \n \n";
            // To avoid a NullExceptionError (checking u.bookInfo() on a null index) checks if u is equal to null. If so, adds empty to the String.
            if (u == null)
            {
                stringToReturn += "null" + "\n\n";
            }
            // Adds the user info of u to the string.
            else
            {
                stringToReturn += u.userInfo() + "\n";
            }
            i++;
        
        }
        //returns the neatly displayed String.
        return stringToReturn;
    } 

}