package com.example.project;

public class IdGenerate{
    
    //Initializes private static String variable currentId and sets it to the String 99.
    private static String currentId = "99";

    // Empty constructor.
    public IdGenerate(){}

    //Returns the current Id.
    public static String getCurrentId()
    {
        //returns the current id
        return currentId;
    }

    //Resets the currentId back to 99.
    public static void reset()
    {
        //sets currentId to 99
        currentId = "99";
    }

    //Adds 1 to currentId.
    public static void generateID()
    {
        //Turns the string currentId into an integer ID to add 1 to it.
        int ID = Integer.parseInt(currentId) + 1;
        //Converts ID back to a String using concatenation.
        currentId = "" + ID;
    }

}