package interview;

import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput 
{
    private Scanner scanner;
    private PrintStream printStream;

    public UserInput(InputStream inputStream, PrintStream printStream) 
    {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public Tool getToolForRental() 
    {
        Tool tool = null;
        do
        {
            printStream.println("Enter the tool you would like to rent (Tool Code) [CHNS,LADW,JAKD,JAKR]: ");
            String tool_code = scanner.next();
            tool = ToolList.tool_list.stream().filter(
                t -> t.getToolCode().equals(tool_code.toUpperCase())).findFirst().orElse(null);
        
        }while (tool == null);
        return tool;
    }

    public LocalDate getStartDate() 
    {
        LocalDate start_date = null;
        try 
        {
            printStream.println("Enter the start month of rental: ");
            int month = Integer.parseInt(scanner.next());
            printStream.println("Enter the start day of rental: ");
            int day = Integer.parseInt(scanner.next());
            printStream.println("Enter the start year of rental: ");
            int year = Integer.parseInt(scanner.next());
            
            start_date = LocalDate.of(year, month, day);
        }
        catch (Exception e) 
        {
            printStream.println("An Error occured. Please make sure to enter a valid start date.");
            return null;
        }
        return start_date;
    }

    public int getRentalDays() 
    {
        printStream.println("Enter how many days for the rental: ");
        int rental_days = -1;

        try
        {
            int user_input = Integer.parseInt(scanner.next());
            if (user_input < 0)
            {
                throw new Exception();
            }
            else
            {
                rental_days = user_input;
            }
        }
        catch (InputMismatchException e)
        {
            printStream.println("An error occured. Please make sure you are entering an Integer value. ");
        }
        catch (Exception e)
        {
            printStream.println("An error occured. Please make sure you are entering an Integer value between greater than 0. ");
        }
        return rental_days;
    }

    public int getDiscount() 
    {
        printStream.println("Enter Discount you want to give (as a whole number): ");
        int discount = -1;
        try
        {
            int user_input = Integer.parseInt(scanner.next());
            if (user_input < 0 || user_input > 100)
            {
               throw new Exception();
            }
            else
            {
                discount = user_input;
            }
        }
        catch (InputMismatchException e)
        {
            printStream.println("An error occured. Please make sure you are entering an Integer value. ");
        }
        catch (Exception e)
        {
            printStream.println("An error occured. Please make sure you are entering an Integer value between 0 and 100. ");
        }
        
        return discount;
    }

}
