/**
 * Project 3:  
 *           #5 Month class
 * 
 * @author Ngan
 */
public class Month {
    
    //Declaring fields for Month class
    int monthNumber;
    
    //No-arg Constructor that set monthNumber to 1
    public Month()
    {
        monthNumber = 1;
    }
    
    /** Constructor that accepts number of month as an argument
     *  & set monthNumber to the value passed as the argument
     *  If a value less than 1 or greater than 12 is passed,
     *  the constructor should set monthNumber to 1.
     */
    public Month(int numOfMonth)
    {
        monthNumber = numOfMonth;
        if (numOfMonth < 1 || numOfMonth > 12)
        {
            monthNumber = 1;
        }
    }
    
    /** Constructor that accepts name of the month such as "January"
     *  or "February" as argument & set monthNumber to its responding value.
     */
    
    public Month(String nameOfMonth)
    {  
       switch (nameOfMonth)
       {
           case "JANUARY":
               monthNumber = 1;
               break;
           case "FEBRUARY":
               monthNumber = 2;
               break;
           case "MARCH":
               monthNumber = 3;
               break;
           case "APRIL":
               monthNumber = 4;
               break;
           case "MAY":
               monthNumber = 5;
               break;
           case "JUNE":
               monthNumber = 6;
               break;
           case "JULY":
               monthNumber = 7;
               break;
           case "AUGUST":
               monthNumber = 8;
               break;
           case "FSEPTEMBER":
               monthNumber = 9;
               break;
           case "OCTOBER":
               monthNumber = 10;
               break;
           case "NOVEMBER":
               monthNumber = 11;
               break;
           case "DECEMBER":
               monthNumber = 12;
               break;
           default:
               System.out.println("ERROR: invalid month");
               monthNumber = 1;
               break;
       }
    }
    
    /** A setMonthNumber method that accepts an integer as argument, which is 
     *  assigned to the monthNumber field. If a value is less than 1 or greater
     *  than 12 is passed, the method should set monthNumber to 1
     */
    public int setMonthNumber(int monthValue)
    {
        monthNumber = monthValue;
        if (monthNumber < 1 || monthNumber > 12)
        {
            monthNumber = 1;
        }
        return monthNumber;
        
    }
    
    // A getMonthNumber that returns the value in the monthNumber field
    public int getMonthNumber()
    {
        return monthNumber;
    }
    
    /* A getMonthName method that returns the name of the month. 
    *  If the monthNumber contains 1, then this method should return "January"
    */
    
    public String getMonthName(int monthNumber)
    {
        switch (monthNumber)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        return null;
    }
    
    //A toString method that returns the same value as the getMonthName method
    public String toString()
    {
        switch (monthNumber)
        {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.print("Invalid month");
                break;  
        }
        return null;
    }
    
    /**An equals method that accepts a Month object as an argument
     * If the argument object holds same data as the calling object, this method
     * should return true. Otherwise, it should return false.
     */
    public boolean equals (Month argumentObject)
    {
        boolean resultOne;
        //Determine if the argument object holds same data as calling object
        if (monthNumber == (argumentObject.monthNumber))
        {
            resultOne = true;
            System.out.println("True");
        }
        else
        {
            resultOne = false;
            System.out.println("False");
        }
        return resultOne;
    }
    
    /**A greaterThan method that accepts a Month object as an argument
     * If the calling object's monthNumber field is greater than the argument's
     * monthField, return true. Otherwise, the method returns false.
     */
    public boolean greaterThan(Month argumentObject)
    {
        boolean resultTwo;
        if (monthNumber > (argumentObject.monthNumber))
            {
              resultTwo = true; //calling object's monthNumber is 
                                // greater argument object's monthNumber
              System.out.println("True");
            }
        else
            {
                resultTwo = false; //calling object's monthNumber is NOT 
                                  //greater argument object's monthNumber
                System.out.println("False");
            }
        return resultTwo;
    }
    
    /**A lessThan method that accepts a Month object as an argument.
     * If the calling object's monthNumber field is less than the argument's
     * monthNumber field, return true. Otherwise, method returns false
     * 
     */
    public boolean lessThan(Month argumentObject)
    {
        boolean resultThree;
        if (monthNumber < (argumentObject.monthNumber))
            {
              resultThree = true; //calling object's monthNumber is less 
                                // than argument object's monthNumber
              System.out.println("True");
            }
        else
            {
                resultThree = false; //no, argumentObject's area is NOT less
                                // than callingObject's area
                System.out.println("False");
                                
            }
        return resultThree;
    }
    
    
    
    
}
