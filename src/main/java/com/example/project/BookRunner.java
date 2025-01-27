package com.example.project;
import java.util.Scanner; 


public class BookRunner 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        //Strings to display some of the "main menus"
        String displayMain = "0: Exit program\n1: User Menu\n2: Book Store Menu";
        String displayUser = "0: Finish. To add User to user array, go to Book Store Menu\n1: Create new User (do this first!)\n2: Change User's name\n3: Give User Books\n4: Print info of User\n5: Generate new ID for user\n6: Reset IDs";
        String displayBookStore = "0: Exit the BookStore\n1: Add User from User Menu\n2: Consolidate Users\n3: Remove a User\n4: Add a Book\n5: Remove a Book\n6: Print info of Books\n7: Print info of Users\n8: Create a Book to Add\n9: Insert a Book";
        System.out.println();
        System.out.println("𝓦𝓮𝓵𝓬𝓸𝓶𝓮 𝓽𝓸 𝓽𝓱𝓮 𝓑𝓸𝓸𝓴𝓼𝓽𝓸𝓻𝓮!");
        //For the choices of the user throughout the program.
        String userMainChoice;
        String userUserChoice;
        String userStoreChoice;
        User u = null;

        while (true)
        {
            clearScreen();
            System.out.println("╭──────────.★..─╮");
            System.out.println();
            System.out.println(displayMain);
            System.out.println();
            System.out.println("╰─..★.──────────╯");
            userMainChoice = scan.nextLine();
            clearScreen();
            if (userMainChoice.equals("0"))
            {
                break;
            } 
            else if (userMainChoice.equals("1")) 
            {
                boolean userCreated = false;
                u = null;
                while (true)
                {
                    clearScreen();
                    String userName;
                    System.out.println("╭─────────────────────────────────༺♡༻─────────────────────────────────╮");
                    System.out.println();
                    System.out.println(displayUser);
                    System.out.println();
                    System.out.println("╰─────────────────────────────────༺♡༻─────────────────────────────────╯");
                    userUserChoice = scan.nextLine();            
                    clearScreen();
                    //Ends the loop if user chooses 0
                    if (userUserChoice.equals("0"))
                    {
                        if (userCreated == false)
                        {
                            System.out.println("•───────•°•❀•°•───────•");
                            System.out.println("You haven't created your User first, are you sure you want to exit? (y/n)");
                            String choice = scan.nextLine();  
                            if (choice.equals("y"))
                            {
                                break;
                            }
                        }
                        else if (userCreated == true)
                        {
                            System.out.println("•───────•°•❀•°•───────•");
                            System.out.println("You cannot edit this user once you exit and must go straight to the Bookstore or create a new one, are you sure you want to? (y/n)");
                            String choice = scan.nextLine();  
                            if (choice.equals("y"))
                            {
                                break;
                            }
                        } 
                    }
                    //For creating a new object of the User class.
                    else if (userUserChoice.equals("1")) 
                    {
                        System.out.println("•───────•°•❀•°•───────•");
                        System.out.println("Enter the User's name.");
                        userName = scan.nextLine();        
                        IdGenerate.generateID(); 
                        User u1 = new User(userName, IdGenerate.getCurrentId());
                        u = u1;
                        System.out.println("Your user is: ");
                        System.out.println(u.userInfo());
                        userCreated = true;
                        scan.nextLine();
                    } 

                    //Allows the player to set a new name of the User class.
                    else if (userUserChoice.equals("2")) 
                    {
                        System.out.println("•───────•°•❀•°•───────•");
                        if (userCreated == false)
                        {
                            System.out.println("You need to create your User first!");
                        }
                        else if (userCreated == true)
                        {
                            System.out.println("Enter the new name that you want.");
                            String newName = scan.nextLine();
                            u.setName(newName);
                        }
                        scan.nextLine();
                    } 
                    //Allows the player to give the user Books.
                    else if (userUserChoice.equals("3"))
                    {
                        System.out.println("•───────•°•❀•°•───────•");
                        if (userCreated == false)
                        {
                            System.out.println("You need to create your User first!");
                        }
                        else if (userCreated == true)
                        {
                            System.out.println("How many Books do you want to give the User? (Max 5).");
                            int length = scan.nextInt();
                            if (length > 5)
                            {
                                length = 5;
                            }
                            scan.nextLine();
                            Book[] booksForUser = new Book[length];
                            for (int i = 0; i < length; i++)
                            {
                                System.out.println("What do you want to name the Book: ");
                                String name = scan.nextLine();
                                System.out.println("Who is the Book's Author: ");
                                String author = scan.nextLine();
                                System.out.println("When was the Book published: ");
                                int year = scan.nextInt();
                                scan.nextLine();
                                System.out.println("What is the ISBN of the book: ");
                                String isbn = scan.nextLine();
                                System.out.println("How many of the book does User have: ");
                                int quantity = scan.nextInt();
                                scan.nextLine();
                                Book b = new Book(name, author, year, isbn, quantity);
                                System.out.println("Your Book is: ");
                                System.out.println(b.bookInfo());
                                booksForUser[i] = b;
                            }
                            u.setBooks(booksForUser);
                        }
                        scan.nextLine();
                    }
                    //Allows the player to see the information of their user.
                    else if (userUserChoice.equals("4"))
                    {
                        System.out.println("•───────•°•❀•°•───────•");
                        if (userCreated == false)
                        {
                            System.out.println("You need to create your User first!");
                        }
                        else if (userCreated == true)
                        {
                            System.out.println("Your user: ");
                            System.out.println(u.userInfo());
                        }
                        scan.nextLine();
                    }
                    //Allows the player to generate a new ID for their user.
                    else if (userUserChoice.equals("5"))
                    {
                        System.out.println("•───────•°•❀•°•───────•");
                        if (userCreated == false)
                        {
                            System.out.println("You need to create your User first!");
                        }
                        else if (userCreated == true)
                        {
                           IdGenerate.generateID();
                           System.out.println("Current ID: " + IdGenerate.getCurrentId());
                           u.setId(IdGenerate.getCurrentId());
                        }
                        scan.nextLine();
                    }
                    // Allows the player to reset the ID, but doesn't assign it to their user.
                    else if (userUserChoice.equals("6"))
                    {
                        System.out.println("•───────•°•❀•°•───────•");
                        IdGenerate.reset();
                        System.out.println("Current ID: " + IdGenerate.getCurrentId());
                    }
                    clearScreen();
                }
            } 
            else if (userMainChoice.equals("2")) 
            {
                System.out.println("•───────•°•❀•°•───────•");
                BookStore bs = new BookStore();
                Book b = new Book(null, null, 0, null, 0);
                clearScreen();
                while (true)
                {
                    System.out.println("╭───────────༺♡༻───────────╮");
                    System.out.println();
                    System.out.println(displayBookStore);
                    System.out.println();
                    System.out.println("╰───────────༺♡༻───────────╯");
                    userStoreChoice = scan.nextLine();
                    // Allows the player to terminate the loop.
                    if (userStoreChoice.equals("0"))
                    {
                        clearScreen();
                        break;
                    } 
                    // Allows the player to add the user from the user menu if they made one. 
                    // If they didn't, directs them to the user menu.
                    else if (userStoreChoice.equals("1"))
                    {
                        if (u == null)
                        {
                            System.out.println("Adding NOTHING!! go to user menu!!");
                        }
                        else
                        {
                            System.out.println("Adding user: " + u.userInfo());
                        }
                        bs.addUser(u);
                        scan.nextLine();
                        clearScreen();
                    } 
                    // Allows the player to consolidate users. 
                    else if (userStoreChoice.equals("2"))
                    {
                        bs.consolidateUsers();
                        System.out.println("Consolidated users.");
                        scan.nextLine();
                        clearScreen();
                    } 
                    // Allows the player to remove a user of their choice.
                    else if (userStoreChoice.equals("3"))
                    {
                        System.out.println("This is the list of users your store currently has:");
                        System.out.println(bs.bookStoreUserInfo());
                        System.out.println("Which user would you like to remove?");
                        int choice = scan.nextInt() - 1;
                        if (choice > 9)
                        {
                            choice = 9;
                        }
                        scan.nextLine();
                        if (bs.getUsers()[choice] != null)
                        {
                            System.out.println("Removing " + bs.getUsers()[choice].getName());
                            bs.removeUser(bs.getUsers()[choice]);
                        }
                        else
                        {
                            System.out.println("That index is null!");
                        }
                        scan.nextLine();
                        clearScreen();
                    } 
                    // Allows the user to add a book to the store.
                    else if (userStoreChoice.equals("4"))
                    {
                        System.out.println("Do you want to use your book from Option 8 (1) or create one here? (2)");
                        String choice = scan.nextLine();
                        if (choice.equals("1"))
                        {
                             bs.addBook(b);
                        }
                        else
                        {
                             System.out.println("What do you want to name the Book: ");
                             String name = scan.nextLine();
                             System.out.println("Who is the Book's Author: ");
                             String author = scan.nextLine();
                             System.out.println("When was the Book published: ");
                             int year = scan.nextInt();
                             scan.nextLine();
                             System.out.println("What is the ISBN of the book: ");
                             String isbn = scan.nextLine();
                             System.out.println("How many of the book does User have: ");
                             int quantity = scan.nextInt();
                             scan.nextLine();
                             Book b1 = new Book(name, author, year, isbn, quantity);
                             b = b1;
                             System.out.println("Your Book is: ");
                             System.out.println(b.bookInfo());
                             bs.addBook(b);
                        }
                        scan.nextLine();
                        clearScreen();
                    } 
                    // Allows a user to remove a book of their choice.
                    else if (userStoreChoice.equals("5"))
                    {
                        System.out.println("This is the list of books your store currently has:");
                        System.out.println(bs.bookStoreBookInfo());
                        System.out.println("Which book would you like to remove?");
                        int choice = scan.nextInt() - 1;
                        if (choice > bs.getBooks().length - 1)
                        {
                            choice = bs.getBooks().length - 1;
                        }
                        scan.nextLine();
                        System.out.println("Removing " + bs.getBooks()[choice].getTitle());
                        bs.removeBook(bs.getBooks()[choice]);
                        scan.nextLine();
                        clearScreen();
                    } 
                    //Prints the info of the books in the store.
                    else if (userStoreChoice.equals("6"))
                    {
                        System.out.println(bs.bookStoreBookInfo());
                        scan.nextLine();
                        clearScreen();
                    } 
                    // Prints the info of the users in the store.
                    else if (userStoreChoice.equals("7"))
                    {
                        System.out.println(bs.bookStoreUserInfo());
                        scan.nextLine();
                        clearScreen();
                    } 
                    // Allows the player to create a new book and edit its features.
                    else if (userStoreChoice.equals("8"))
                    {
                        System.out.println("What do you want to name the Book: ");
                        String name = scan.nextLine();
                        System.out.println("Who is the Book's Author: ");
                        String author = scan.nextLine();
                        System.out.println("When was the Book published: ");
                        int year = scan.nextInt();
                        scan.nextLine();
                        System.out.println("What is the ISBN of the book: ");
                        String isbn = scan.nextLine();
                        System.out.println("How many of the book does User have: ");
                        int quantity = scan.nextInt();
                        scan.nextLine();
                        Book b1 = new Book(name, author, year, isbn, quantity);
                        b = b1;
                        System.out.println("Your Book is: ");
                        System.out.println(b.bookInfo());
                        while (true)
                        {
                            clearScreen();
                            System.out.println("╒═══════✰°");
                            System.out.println();
                            String displayBook = "0: Exit book menu\n 1: Give book new title\n2: Give book new author\n3: Give book new year published\n4: Give book new isbn\n5: Give book new quantity\n6: Print info of book";
                            System.out.println();
                            System.out.println("°✰═══════╛");
                            System.out.println(displayBook);
                            String choice = scan.nextLine();
                            //Terminates the loop.
                            if (choice.equals("0"))
                            {
                                System.out.println("Go to Option 3 to add the book you just made to the store!");
                                scan.nextLine();
                                clearScreen();
                                break;
                            }
                            //Allows the player to edit the title of their book.
                            else if(choice.equals("1"))
                            {
                                System.out.println("Enter the new title for your book: ");
                                String newTitle = scan.nextLine();
                                b.setTitle(newTitle);
                                scan.nextLine();
                                clearScreen();  
                            }
                            //Allows the player to edit the author of their book.
                            else if(choice.equals("2"))
                            {
                                System.out.println("Enter the new author for your book: ");
                                String newAuthor = scan.nextLine();
                                b.setAuthor(newAuthor);
                                scan.nextLine();
                                clearScreen(); 
                            }
                            //Allows the player to edit the year published of their book.
                            else if(choice.equals("3"))
                            {
                                System.out.println("Enter the new year published for your book: ");
                                int newYear = scan.nextInt();
                                b.setYearPublished(newYear);
                                scan.nextLine();
                                clearScreen(); 
                            }
                            //Allows the player to edit the ISBN of their book.
                            else if(choice.equals("4"))
                            {
                                System.out.println("Enter the new ISBN for your book: ");
                                String newIsbn = scan.nextLine();
                                b.setIsbn(newIsbn);
                                scan.nextLine();
                                clearScreen(); 
                            }
                            //Allows the player to edit the quantity of their book.
                            else if(choice.equals("5"))
                            {
                                System.out.println("Enter the new quantity for your book: ");
                                int newQuantity = scan.nextInt();
                                b.setQuantity(newQuantity);
                                scan.nextLine();
                                clearScreen(); 
                            }
                            //Prints the info of the book.
                            else if (choice.equals("6"))
                            {
                                System.out.println(b.bookInfo());
                                scan.nextLine();
                                clearScreen(); 
                            }
                        }
                        scan.nextLine();
                        clearScreen();
                    } 
                    // Allows the user to insert a book to an index of their choosing.
                    else if (userStoreChoice.equals("9"))
                    {
                        System.out.println("Do you want to use your book from Option 8 (1) or create one here? (2)");
                        String choice = scan.nextLine();
                        if (choice.equals("2"))
                        {
                             System.out.println("What do you want to name the Book: ");
                             String name = scan.nextLine();
                             System.out.println("Who is the Book's Author: ");
                             String author = scan.nextLine();
                             System.out.println("When was the Book published: ");
                             int year = scan.nextInt();
                             scan.nextLine();
                             System.out.println("What is the ISBN of the book: ");
                             String isbn = scan.nextLine();
                             System.out.println("How many of the book does User have: ");
                             int quantity = scan.nextInt();
                             scan.nextLine();
                             Book b1 = new Book(name, author, year, isbn, quantity);
                             b = b1;
                        }
                        System.out.println("Your Book is: ");
                        System.out.println(b.bookInfo());
                        System.out.println("This is the list of books your store currently has:");
                        System.out.println(bs.bookStoreBookInfo());
                        System.out.println("Which number would you like your new book to be?");
                        int c = scan.nextInt() - 1;
                        if (c > bs.getBooks().length - 1)
                        {
                            c = bs.getBooks().length - 1;
                        }
                        scan.nextLine();
                        System.out.println("Inserting " + b.getTitle());
                        bs.insertBook(b, c);
                        scan.nextLine();
                        clearScreen();
                    }
                }
            } 
        }
        
    }

    // from https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}

