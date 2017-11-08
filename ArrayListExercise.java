/*************************************************************************
  *  Compilation:  javac ArrayListExercise.java
  *  Author: David Freitag
  *  Purpose: To practice using ArrayList 
  ************************************************************************
  *  Follow the directions below
  ************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
   static Scanner keyboard = new Scanner(System.in);      
   public static void main(String[] args) {
      
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      do {
         
         //////////////////////////////////////////////////////////////////////
         // Insert 1 line of code here to remove all values from the ArrayList. 
         //////////////////////////////////////////////////////////////////////
            list.clear();
            
            
         doArrayLoop(list);
      } while (getYorN("\nDo you want to do it again? (Y/N)"));
   }
   
   //------------------------------------------------------------------------------------------------- 
   
   private static void doArrayLoop(ArrayList<Integer>list) {
      int value;
      do {
         value = getInteger ("Enter integers (input ends with 0): ");
         if (value != 0) {
            
            /////////////////////////////////////////////////////////////////
            // Insert code here to add a value to the ArrayList. 
            /////////////////////////////////////////////////////////////////
            list.add(value);
         }
      } while (value != 0);
      
      // display the entire list 
      System.out.println("The list contains: " + list.toString() + "\n");
      
      do {
         value = getInteger ("Which integers should be deleted? (input ends with 0): ");
         if (value !=0) {
            
            /////////////////////////////////////////////////////////////////
            // Insert code here to delete values from the ArrayList. 
            // Display an error message if the value is not in the list.   
            /////////////////////////////////////////////////////////////////
            list.remove(value);
         }
      } while (value != 0);
      
      /*//////////////////////////////////////////////////////////////////////
       * Insert code below to display: 
       *     the entire list (again)
       *     the size of the list 
       *     the largest number
       *     the smallest number 
       ///////////////////////////////////////////////////////////////////////*/
      System.out.println("\nThe list now contains: " + list.toString());
      System.out.println("The list size is " + list.size());
      System.out.println("The maximum number is " + getMaxValue(list));
      
   }
   
   public static Integer getMaxValue(ArrayList<Integer> list) {
      if (list == null || list.size() == 0)
         return null;
      
      int result = list.get(0);              //Gets the first element of the ArrayList (0 subscript)
      for (int i = 1; i < list.size(); i++)  //Loop while less than the size of the ArrayList
         if (result > list.get(i))           //Compares result to an element of the ArrayList
         result = list.get(i);
      
      return result;
   }
   
   public static Integer getMinValue(ArrayList<Integer> list) {
      return (java.util.Collections.min(list));    //Uses the Collections class to get the minimum value
   }
   
   
   
///////////////////////////////////////////////////////////////////////////////////////////////////////
   
    /** Gets a String from the keyboard. Rejects null entry or any number of spaces.
     * @param msg is the text that will be displayed the user to ask them to enter a value.
     * @return Returns a String from the keyboard. 
     */ 
   public static String getString(String msg) {
      String answer = "";
      System.out.println(msg);
      try {
         answer = keyboard.nextLine(); 
      }
      catch (Exception e) {
         System.err.println("Error reading input from user. Ending program.");
         System.exit(-1);
      } 
      
      while (answer.replace(" ", "").equals("")) {
         System.err.println("Error: Missing input.");
         try {
            System.out.println(msg);
            answer = keyboard.nextLine(); 
         }
         catch (Exception e) {
            System.err.println("Error reading input from user. Ending program.");
            System.exit(-1);
         } 
      }
      return answer;            
   }
   
   /** Gets an Integer from the keyboard. Rejects null, spaces and non-integers.
     * @param msg is the text that will be displayed the user to ask them to enter a number.
     * @return Returns an int from the keyboard. 
     */  
   public static int getInteger(String msg) {
      System.out.println(msg);
      while (!keyboard.hasNextInt()) {
         keyboard.nextLine();
         System.err.println("Invalid integer. Try again.");
      }
      int number = keyboard.nextInt();
      keyboard.nextLine(); //flushes the buffer
      return number;
   }
   
   /** Gets a Yes or No answer from the keyboard. Calls getString to rejects null input and spaces.
     * @param msg is the text that will be displayed the user.
     * @return Returns a boolean value. True = yes; False = no. 
     */ 
   public static boolean getYorN(String msg) {
      String answer = getString(msg);
      
      while (answer.compareToIgnoreCase("y")   != 0 
                && answer.compareToIgnoreCase("yes") != 0 
                && answer.compareToIgnoreCase("n")   != 0 
                && answer.compareToIgnoreCase("no")  != 0) {
         
         if (answer.replace(" ", "").equals("")) {
            System.err.println("Error: Missing y/n input.");
         } else {
            if (answer.compareToIgnoreCase("y")   != 0 
                   && answer.compareToIgnoreCase("yes") != 0 
                   && answer.compareToIgnoreCase("n")   != 0 
                   && answer.compareToIgnoreCase("no")  != 0) {
               System.err.println("Error: Unexpected input.");
            }
         }
         answer = getString(msg);
      } 
      
      if  (answer.compareToIgnoreCase("y")   == 0  
              || answer.compareToIgnoreCase("yes") == 0) {
         return true;
      } 
      else {
         return false;
      }
   }
   
    /** Closes the scanner.
     */ 
   public static void closeScanner() {
      try { 
         if(keyboard != null) {
            keyboard.close(); 
         }
      } 
      catch (Exception e) { // (Exception) catches all errors java might throw here
         System.err.println("Error closing reader.");
      }
   }
}