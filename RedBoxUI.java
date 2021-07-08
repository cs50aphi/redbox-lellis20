import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RedBoxUI
{
   public static void main(String [] args)
   {
      RedBoxMachine rm = new RedBoxMachine();
      Scanner sn = new Scanner(System.in);
      int option = 0;
      String title = "";

      System.out.println("Welcome to Redbox!");
      System.out.println("What can I help you with today?");
      System.out.println();

      while(true)
      {
         printMenu();
         option = Integer.parseInt(sn.nextLine());
         // CHECK AVAILABLE TITLES
         if(option == 1)
         {
            //Complete the code to List Available Titles.
            ArrayList<String> availableTitles = new ArrayList<String>();
            availableTitles = rm.getAvailableMovies();
            System.out.println(availableTitles);

            System.out.println("PRESS ENTER TO GO BACK TO THE MENU");
            sn.nextLine();
         }
         // RENT
         else if(option == 2)
         {
            System.out.println("What movie would you like to rent?");
            title = sn.nextLine();

            // Complete the code to rent a movie. This code should let the user
            // know if the movie was rented successfully or not (not could occur if
            // the movie they enter is not available).
            if (rm.rent(title))
            {
               System.out.println("This movie is available. Please take it below.");
            }
            else
            {
               // No need check if available, won't be an object on dvdList if it's not available
               System.out.println("Sorry, this movie is not available. Please select one from the list.");
            }
         }
         // RETURN
         else if(option == 3)
         {
            System.out.println("What movie would you like to return?");
            title = sn.nextLine();
            rm.returnMovie(title);
            System.out.println("Thank you, " + title + " has been successfully returned!");


            // Complete the code to return a movie. Make sure to include a
            // message after the movie has been returned.

         }
         // SEARCH FOR MOVIE TITLE
         else if(option == 4)
         {
            System.out.println("What movie would you like to search for?");
            title = sn.nextLine();
            int index = rm.searchForMovie(title);
            // -1 indicates no match was found
            if (index == -1)
            {
               System.out.println("Sorry, we could not find " + title + " at this kiosk. " + index);
            }
            // Any non -1 value means a match was found
            else
            {
               System.out.println("Yes, " + title + " is available in this kiosk.");
            }

            // Complete the code to search for a movie.  Make sure to include
            // messages that inform the user whether the movie was found or not.

         }
         else if(option == 5)
         {
            System.out.println("Thank you for using Redbox!");
            System.out.println("Have a great day and come back soon!");
            System.exit(0);
         }
         else
         {
            System.out.println("Invalid Option! Please Try Again.");
         }
      }
   }

   //Prints all available options to the console.
   public static void printMenu()
   {
      System.out.println();
      System.out.println("1-List Available Titles");
      System.out.println("2-Rent Movie");
      System.out.println("3-Return Movie");
      System.out.println("4-Search for Movie");
      System.out.println("5-Quit");
      System.out.println();
   }
}
