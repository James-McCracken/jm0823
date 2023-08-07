package interview;

public class Tool 
{
    private String tool_code;
    private ToolType tool_type;
    private String brand_name;

    Tool(String tool_code, ToolType tool_type, String brand_name)
    {
        this.tool_code = tool_code;
        this.tool_type = tool_type;
        this.brand_name = brand_name;
    }

    String getToolCode()
    {
        return tool_code;
    }
    ToolType getToolType()
    {
        return tool_type;
    }
    String getToolBrandNname()
    {
        return brand_name;
    }
    String printToolType()
    {
        double d = tool_type.getDailyCharge();
        boolean b1 = tool_type.getWeekdayCharge();
        boolean b2 = tool_type.getWeekendCharge();
        boolean b3 = tool_type.getWeekholidayCharge();

        String s = String.format(
            "DailyCharge: %.02f,Weekday Charge: %b, Weekend Charge: %b, Holiday Charge: %b",
            d ,b1 ,b2 ,b3);
    
        return s;
    }
}
