public class DVD
{
   //Declare the class variables.

   /** the title of the DVD */
   String title = "";

   /** the number of available copies */
   int copies = 1;

   /** Constructs a DVD object and sets the number of copies
    *  to 1.
    *  @param t the title of the DVD
    */

   public DVD(String t)
   {
      title = t;
      copies = 1;
   }

   /** Increments the number of available copies of this DVD.
    */
   public void incrementCopies()
   {
      copies++;
   }

   /** Decrements the number of available copies of this DVD.
    */
   public void decrementCopies()
   {
      if (copies > 0)
      {
         copies--;
      }
   }

   /** Gets the title of this DVD.
    *
    *  @return the title of the DVD.
    */
   public String getTitle()
   {
      return title;
   }

   /** Gets the number of available copies for this DVD.
    *
    *  @return the number of available copies.
    */
   public int getNumCopies()
   {
      return copies;
   }

   /** Returns a representation of this DVD object as a
    *  String in the format <title> copies: <num. copies>.
    *
    *  @return the String representation of the DVD.
    */

   public String toString()
   {
      return title + "copies: " + copies;
   }

}
