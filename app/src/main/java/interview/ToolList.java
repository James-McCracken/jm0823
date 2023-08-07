package interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ToolList 
{
    private static ToolType ladder = 
        new ToolType("Ladder",1.99,
            true, true, false);
    private static ToolType chainsaw = 
        new ToolType("Chainsaw",1.49,
            true, false, true);
    private static ToolType jackhammer = 
        new ToolType("Jackhammer",2.99,
            true, false, false);

    //creates tools keep in seperate class/function/localstore?
    private static Tool tool1 = 
        new Tool("CHNS", chainsaw,"Stihl");
    private static Tool tool2 = 
        new Tool("LADW", ladder,"Werner");
    private static Tool tool3 = 
        new Tool("JAKD", jackhammer,"DeWalt");
    private static Tool tool4 =
        new Tool("JAKR", jackhammer,"Ridgid");

    public static ArrayList<Tool> tool_list = 
        new ArrayList<Tool>(Arrays.asList(tool1, tool2, tool3, tool4));
}
