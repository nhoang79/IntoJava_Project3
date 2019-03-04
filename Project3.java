import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*
 * Project 3 : Main method in Project3.java will test the following class: 
 *           #5. Month Class 
 *           #12. Number Analysis Class
 */

/**
 *
 * @author Ngan
 */
public class Project3 {

    public static void main(String[] args) throws FileNotFoundException 
    {
        //Creating an object from Month class & test the no-arg constructor
        Month monthObject1 = new Month();
        System.out.println("Month number of monthObject1 is " 
                                + monthObject1.monthNumber + ". \n");
        
        /**Creating a 2nd object from Month class & test the constructor that
         * accepts an integer as its argument & set that integer value to
         * monthNumber field
         * If an in valid integer (less than 1 or greater than 12) is enter
         * the monthNumber field will be set to 1
        */
        
        System.out.print("Enter an integer from 1 to 12: "); //To get an integer
        Scanner keyboard = new Scanner(System.in);       //value from the user
        int userInput = keyboard.nextInt(); //store that integer to userInput
        
        Month monthObject2 = new Month(userInput);
        System.out.println("Month number of monthObject2 is " 
                            + monthObject2.monthNumber + ".");
        
        /** Testing constructor that accepts name of the month such as "January"
         *  or "February" as argument & set monthNumber to its responding value.
         * 
         */
        System.out.print("\nPlease enter a name of a month in all CAPS: ");
                                                        //To get month's name
        Scanner keyboard2 = new Scanner(System.in);       //value from the user
        String stringInput = keyboard2.nextLine(); //store string to userInput
        
        Month monthObject3 = new Month(stringInput);
        System.out.println("Month number of monthObject3 is " 
                            + monthObject3.monthNumber + ".");
       
        
        //Testing setMonthNumber & getMonthNumber method from Month Class
        Month monthObject4 = new Month();
        monthObject4.setMonthNumber(userInput); // using userInput above to set 
                                                // month number to monthNumber 
                                                // field in Month class
        System.out.print("\nMonth number of monthObject4 using setMonthNumber"
                        + " method is ");
        System.out.println(monthObject4.getMonthNumber());
        
        //Testing getMonthName method
        System.out.print("The name of the monthObject4 is ");
        monthObject4.getMonthName(userInput);
        
        
        //Testing toString method
        System.out.print("toString method should return the same value "
                + "as the getMonthName method for monthObject4, which is ");
        monthObject4.toString();
        System.out.println(".");
        
        //Testing equals method by comparing monthObject1's month number to
        //monthObject2's month number
        System.out.print("\nTesting equals method: ");
        System.out.print("\nTrue/False? Month number of monthObject1 is equal "
                + "to monthObject2's month number: ");
        monthObject1.equals(monthObject2);
        
        //Testing greaterThan method by comparing monthObject1's month number to
        //monthObject2's month number
        System.out.print("\nTesting greaterThan method: ");
        System.out.print("\nTrue/False? Month number of monthObject1 is greater"
                + " than monthObject2's month number: ");
        monthObject1.greaterThan(monthObject2);
        
        //Testing greaterThan method by comparing monthObject2's month number to
        //monthObject3's month number
        System.out.print("\nTrue/False? Month number of monthObject2 is greater"
                + " than monthObject3's month number: ");
        monthObject2.greaterThan(monthObject3);
        
        //Testing lessThan method by comparing monthObject2's month number to
        //monthObject3's month number
        System.out.print("\nTesting lessThan method: ");
        System.out.print("\nTrue/False? Month number of monthObject2 is less"
                + " than monthObject3's month number: ");
        monthObject2.lessThan(monthObject3);
        
        
       

        //Separating Demo of Month Class and Demo of NumberAnalysis Class
        System.out.print("\n\n\n\n");
        System.out.println("The following output are results of testing"
                        + " NumberAnalysis Class");
        System.out.println("The 12 random numbers in text file are ");
        
        //Creating a file with 12 random numbers
        int number; 
        Random randomNum = new Random();
        PrintWriter outputFile = new PrintWriter("Numbers.txt");
                                 //Creat a file called Numbers.txt
        for(int index = 0; index < 12; index++)
        {
            number = randomNum.nextInt(1000);
            outputFile.println(number);
        }
        outputFile.close(); //close file
        
        //Displaying the twelve random numbers written in the Numbers.txt file
        File display = new File("Numbers.txt"); //Open Numbers.txt file
        Scanner readNum = new Scanner(display); //Read integers from 
                                                //Numbers.txt file
        for (int content = 0; content < 12; content++)
        {
            int fileNum = readNum.nextInt(); //Storing content from Numbers.txt
                                            // into fileNum
        }
        
        //Close File
        readNum.close();
        
      //Creating an object from NumberAnalysis class & testing its constructor
      NumberAnalysis objectOne = new NumberAnalysis("Numbers.txt");
      
      //Testing displayLowest method
      System.out.print("\n\nThe lowest integer is ");
      objectOne.displayLowest();
      
      //Testing displayHighest method
      System.out.print("\nThe highest integer is ");
      objectOne.displayHighest();
      
      /**Testing total method that will display the sum of all the integers in
       * the array.
       */ 
       System.out.print("The total value of array is ");
       objectOne.total();
       
       /**Testing the average method that will display the average of the 12
        * integers from the array.
        */
       System.out.print("The average value of array is ");
       objectOne.average();
        
    }
}
