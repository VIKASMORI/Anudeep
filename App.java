package project.com.LibraryManagementSystem;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Library Management System " );
        Menu m =new Menu();
        m.displayMenu();
    }
}
