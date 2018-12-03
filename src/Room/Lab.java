package Room;

import Player.Student;

public class Lab
{
    Student Survivalist;
    private int xLoc, yLoc;

    public Lab(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterLab(Student x)
    {
        System.out.println("The lab room seems perfectly tranquil. There are objects that are perfect for survival.");
        Survivalist = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveSchool(Student x)
    {
        Survivalist = null;
    }
}
