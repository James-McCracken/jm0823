package interview;

public class ToolType 
{
    private String tool_name;
    private double daily_charge;
    private boolean weekday_charge;
    private boolean weekend_charge;
    private boolean holiday_charge;

    ToolType(String tool_name,double daily_charge, boolean weekday_charge, 
             boolean weekend_charge, boolean holiday_charge)
    {
        this.tool_name = tool_name;
        this.daily_charge = daily_charge;
        this.weekday_charge = weekday_charge;
        this.weekend_charge = weekend_charge;
        this.holiday_charge = holiday_charge;
    }

    public String getToolName()
    {
        return tool_name;
    }
    public double getDailyCharge()
    {
        return daily_charge;
    }
    public boolean getWeekdayCharge()
    {
        return weekday_charge;
    }
    public boolean getWeekendCharge()
    {
        return weekend_charge;
    }
    public boolean getWeekholidayCharge()
    {
        return holiday_charge;
    }
}
