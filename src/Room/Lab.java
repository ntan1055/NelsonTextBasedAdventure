package Room;

import Player.Student;

public class Lab
{
    Student Survivalist;
    int xLoc, yLoc;

    public Lab(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterLab(Student x)
    {
        System.out.println("The lab room seems perfectly tranquil. You can look around the room for supplies to survive.");
        Survivalist = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveLab(Student x)
    {
        Survivalist = null;
    }
}
