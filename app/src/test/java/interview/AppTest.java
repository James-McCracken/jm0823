/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

class AppTest 
{

    @Test void test1() 
    {
        String tool_code = "JAKR";
        int year = 2015;
        int month = 9;
        int day = 3;
        int days_rented = 5;
        int discount = 101;

        ByteArrayInputStream inputStream = 
            new ByteArrayInputStream(String.format("%s\n%d\n%d\n%d\n%d\n%d",
            tool_code,month,day,year,days_rented,discount).getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream ps = new PrintStream(byteArrayOutputStream);
        UserInput userInput = new UserInput(inputStream, ps);
        
        assertEquals("Ridgid", userInput.getToolForRental().getToolBrandNname());
        assertEquals("2015-09-03", userInput.getStartDate().toString());
        assertEquals(5, userInput.getRentalDays());
        assertEquals(-1, userInput.getDiscount());
        
    }

    @Test void test2() 
    {
        String tool_code = "LADW";
        int year = 2020;
        int month = 7;
        int day = 2;
        int days_rented = 3;
        int discount = 10;

        ByteArrayInputStream inputStream = 
            new ByteArrayInputStream(String.format("%s\n%d\n%d\n%d\n%d\n%d",
            tool_code,month,day,year,days_rented,discount).getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        UserInput userInput = new UserInput(inputStream, printStream);

        Tool actual_tool = userInput.getToolForRental();
        LocalDate actal_start_date = userInput.getStartDate();
        int actual_rental_days = userInput.getRentalDays();
        int actual_discount = userInput.getDiscount();

        assertEquals("Werner", actual_tool.getToolBrandNname());
        assertEquals("2020-07-02", actal_start_date.toString());
        assertEquals(3, actual_rental_days);
        assertEquals(10,  actual_discount);

        int actual_days_charged = App.daysCharged(actal_start_date, actual_rental_days, actual_tool);
        double actual_init_cost = App.calculateInitialCost(actual_days_charged,actual_tool);
        double actual_final_price = App.applyDiscount(actual_init_cost, actual_discount);
        assertEquals(3.98,  actual_init_cost);
        assertEquals(3.58,  actual_final_price);
    }
    @Test void test3() 
    {
        String tool_code = "CHNS";
        int year = 2015;
        int month = 7;
        int day = 2;
        int days_rented = 5;
        int discount = 25;

        ByteArrayInputStream inputStream = 
            new ByteArrayInputStream(String.format("%s\n%d\n%d\n%d\n%d\n%d",
            tool_code,month,day,year,days_rented,discount).getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream ps = new PrintStream(byteArrayOutputStream);
        UserInput userInput = new UserInput(inputStream, ps);

        Tool actual_tool = userInput.getToolForRental();
        LocalDate actual_start_date = userInput.getStartDate();
        int actual_rental_days = userInput.getRentalDays();
        int actual_discount = userInput.getDiscount();

        assertEquals("Stihl", actual_tool.getToolBrandNname());
        assertEquals("2015-07-02", actual_start_date.toString());
        assertEquals(5, actual_rental_days);
        assertEquals(25, actual_discount);


        int actual_days_charged = App.daysCharged(actual_start_date, actual_rental_days, actual_tool);
        double actual_init_cost = App.calculateInitialCost(actual_days_charged,actual_tool);
        double actual_final_price = App.applyDiscount(actual_init_cost, actual_discount);
        assertEquals(4.47,  actual_init_cost);
        assertEquals(3.35,  actual_final_price);

    }
    @Test void test4() 
    {
        String tool_code = "JAKD";
        int year = 2015;
        int month = 9;
        int day = 3;
        int days_rented = 6;
        int discount = 0;

        ByteArrayInputStream inputStream = 
            new ByteArrayInputStream(String.format("%s\n%d\n%d\n%d\n%d\n%d",
            tool_code,month,day,year,days_rented,discount).getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream ps = new PrintStream(byteArrayOutputStream);
        UserInput userInput = new UserInput(inputStream, ps);

        Tool actual_tool = userInput.getToolForRental();
        LocalDate acutal_start_date = userInput.getStartDate();
        int actual_rental_days = userInput.getRentalDays();
        int actual_discount = userInput.getDiscount();

        assertEquals("DeWalt", actual_tool.getToolBrandNname());
        assertEquals("2015-09-03", acutal_start_date.toString());
        assertEquals(6, actual_rental_days);
        assertEquals(0, actual_discount);

        int actual_days_charged = App.daysCharged(acutal_start_date, actual_rental_days, actual_tool);
        double actual_init_cost = App.calculateInitialCost(actual_days_charged,actual_tool);
        double actual_final_price = App.applyDiscount(actual_init_cost, actual_discount);
        assertEquals(8.97,  actual_init_cost);
        assertEquals(8.97,  actual_final_price);

    }
    @Test void test5() 
    {
        String tool_code = "JAKR";
        int year = 2015;
        int month = 7;
        int day = 2;
        int days_rented = 9;
        int discount = 0;

        ByteArrayInputStream inputStream = 
            new ByteArrayInputStream(String.format("%s\n%d\n%d\n%d\n%d\n%d",
            tool_code,month,day,year,days_rented,discount).getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream ps = new PrintStream(byteArrayOutputStream);
        UserInput userInput = new UserInput(inputStream, ps);

        Tool actual_tool = userInput.getToolForRental();
        LocalDate actual_start_date = userInput.getStartDate();
        int actual_rental_days = userInput.getRentalDays();
        int actual_discount = userInput.getDiscount();

        assertEquals("Ridgid", actual_tool.getToolBrandNname());
        assertEquals("2015-07-02", actual_start_date.toString());
        assertEquals(9, actual_rental_days);
        assertEquals(0, actual_discount);

        int actual_days_charged = App.daysCharged(actual_start_date, actual_rental_days, actual_tool);
        double actual_init_cost = App.calculateInitialCost(actual_days_charged,actual_tool);
        double actual_final_price = App.applyDiscount(actual_init_cost, actual_discount);
        assertEquals(17.94,  actual_init_cost);
        assertEquals(17.94,  actual_final_price);
    }
    @Test void test6() 
    {
        String tool_code = "JAKR";
        int year = 2020;
        int month = 7;
        int day = 2;
        int days_rented = 4;
        int discount = 50;

        ByteArrayInputStream inputStream = 
            new ByteArrayInputStream(String.format("%s\n%d\n%d\n%d\n%d\n%d",
            tool_code,month,day,year,days_rented,discount).getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream ps = new PrintStream(byteArrayOutputStream);
        UserInput userInput = new UserInput(inputStream, ps);

        Tool actual_tool = userInput.getToolForRental();
        LocalDate actual_start_date = userInput.getStartDate();
        int actual_rental_days = userInput.getRentalDays();
        int actual_discount = userInput.getDiscount();

        assertEquals("Ridgid", actual_tool.getToolBrandNname());
        assertEquals("2020-07-02", actual_start_date.toString());
        assertEquals(4, actual_rental_days);
        assertEquals(50, actual_discount);

        int actual_days_charged = App.daysCharged(actual_start_date, actual_rental_days, actual_tool);
        double actual_init_cost = App.calculateInitialCost(actual_days_charged,actual_tool);
        double actual_final_price = App.applyDiscount(actual_init_cost, actual_discount);
        assertEquals(2.99,  actual_init_cost);
        assertEquals(1.5,  actual_final_price);
    }
    

    
}