package com.example.project;


public class Main
{
    public static void main(String[] args) 
    {
        // BookStore store = new BookStore(); 
        // Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        // Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        // Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        // Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        // Book b5 = new Book("Test","Author",1900, "1234", 1);
        // store.addBook(b1);
        // store.addBook(b4);
        // store.insertBook(b2, 1);
        // store.insertBook(b3,2);
        // store.insertBook(b5,4);
        // System.out.print(store.bookStoreBookInfo());
        // System.out.println("Array Length: " + store.getBooks().length);

        //  IdGenerate.reset();
        // BookStore store = new BookStore(); //create a new bookstore with 6 empty books
        // IdGenerate.generateID();
        // User u1 = new User("John",IdGenerate.getCurrentId());
        // IdGenerate.generateID();
        // User u2 = new User("Jane",IdGenerate.getCurrentId());
        // IdGenerate.generateID();
        // User u3 = new User("Mary",IdGenerate.getCurrentId());
        // IdGenerate.generateID();
        // User u4 = new User("Alex",IdGenerate.getCurrentId());
        // store.addUser(u1);
        // store.addUser(u2);
        // store.addUser(u3);
        // store.addUser(u4);
        // System.out.println(store.bookStoreUserInfo());

        // store.removeUser(u2);
        // User[] expected = {u1,u3,u4,null,null,null,null,null,null,null};
        // System.out.println(store.getUsers() == expected);
        // System.out.println(store.getUsers()[0]);
        // System.out.println(expected[0]);
        // System.out.println(store.getUsers()[1]);
        // System.out.println(expected[1]);
        // System.out.println(store.getUsers()[2]);
        // System.out.println(expected[2]);
        // System.out.println(store.getUsers()[3]);
        // System.out.println(expected[3]);

        // store.removeUser(u1);
        // User []expected2 = {u3,u4,null,null,null,null,null,null,null,null};
        // System.out.println(store.getUsers() == expected2);
        // System.out.println(store.getUsers()[0]);
        // System.out.println(expected2[0]);
        // System.out.println(store.getUsers()[1]);
        // System.out.println(expected2[1]);
        // System.out.println(store.getUsers()[2]);
        // System.out.println(expected2[2]);
        // System.out.println(store.getUsers()[3]);
        // System.out.println(expected2[3]);

        // store.removeUser(u4);
        // User []expected3 = {u3,null,null,null,null,null,null,null,null,null};
        // System.out.println(store.getUsers() == expected3);
        // System.out.println(store.getUsers()[0]);
        // System.out.println(expected3[0]);

        // store.removeUser(u3);
        // User []expected4 = {null,null,null,null,null,null,null,null,null,null};
        // System.out.println(store.getUsers() == expected);
        // System.out.println(store.getUsers()[0]);
        // System.out.println(expected4[0]);


        System.out.println("Remove Book Testing: ");
        BookStore store = new BookStore(); 
        Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        Book b5 = new Book("Test","Author",1900, "1234", 1);
        store.addBook(b1);store.addBook(b2);store.addBook(b3);store.addBook(b4);store.addBook(b5);
        System.out.println(store.bookStoreBookInfo());  
        System.out.println("Array Length: " + store.getBooks().length);
        System.out.println();

        store.removeBook(b1);store.removeBook(b1);
        System.out.println(store.bookStoreBookInfo());   
        System.out.println("Array Length: " + store.getBooks().length);
        System.out.println();

        store.removeBook(b1); //b1 should be removed. testing consolidation
        System.out.println(store.bookStoreBookInfo());  
        System.out.println("Array Length: " + store.getBooks().length);
        System.out.println();

        store.removeBook(b5);
        System.out.println(store.bookStoreBookInfo());        
        System.out.println("Array Length: " + store.getBooks().length);
        System.out.println();

        store.removeBook(b3);store.removeBook(b3);store.removeBook(b3);store.removeBook(b3);store.removeBook(b3);
        System.out.println(store.bookStoreBookInfo());        
        System.out.println("Array Length: " + store.getBooks().length);
    }


    
}