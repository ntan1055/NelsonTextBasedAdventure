package Room;

import Player.Student;

public class Hallway
{
    Student Survivalist;
    int xLoc, yLoc;

    public Hallway(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterHallway(Student x)
    {
        System.out.println("As you step into the broken-down building, you could feel that something was wrong here. What could it be?");
        Survivalist = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveHallway(Student x)
    {
        Survivalist = null;
    }
}
