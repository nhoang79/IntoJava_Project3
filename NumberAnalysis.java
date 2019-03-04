import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Project 3 :
              #12 Number Analysis Class
 */

/**
 *
 * @author Ngan
 */
public class NumberAnalysis 
{
    private int arrayNumber[] = new int [12];
    int index = 0;
    
    /**A constructor that accepts a file name as its argument & read contents
     * of file into an array
     */
    public NumberAnalysis(String fileName) throws FileNotFoundException
    {
        File readFile = new File(fileName); //Opening file
        Scanner inputFile = new Scanner(readFile); //Read file
        while (inputFile.hasNext())
        {
            arrayNumber[index] = inputFile.nextInt();
            System.out.print(arrayNumber[index] + " ");
            index++;
        }
       
        inputFile.close();
    }
    
    // A method that display LOWEST number in array
    public int displayLowest()
    {
        int lowestNum = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++)
        {
            if (arrayNumber[i] < lowestNum)
            {
                lowestNum = arrayNumber[i];
            }
        }
        System.out.print(lowestNum);
        return lowestNum;
    }
    
    // A method that display HIGHEST number in array
    public int displayHighest()
    {
        int highestNum = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++)
        {
            if (arrayNumber[i] > highestNum)
            {
                highestNum = arrayNumber[i];
            }
        }
        System.out.println(highestNum);
        return highestNum;
    }

    // A method that display the SUM of integer in array
    public int total()
    {
        int accumulator = 0; //to hold the sum of integers
        for (int i = 0; i < arrayNumber.length; i++)
        {
            accumulator = accumulator + arrayNumber[i];
        }
        System.out.println(accumulator);
        return accumulator;
    }
    
    // A method that display the AVERAGE value in array
    public int average()
    {
        int average = 0; //to hold the average of integers from the array
        int sum = 0;
        final int TOTAL = 12; //12 is the total number of integers in the array
        for (int i = 0; i < arrayNumber.length; i++)
        {
            sum = (sum + arrayNumber[i]);
        }
        average = sum/TOTAL;
        System.out.println(average);
        return average;
    }
    
}
