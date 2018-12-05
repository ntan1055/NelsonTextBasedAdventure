package Room;

import Player.Student;

public class emergencyExit
{
    Student Survivalist;
    private int xLoc, yLoc;

    public emergencyExit(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterRoom(Student x)
    {
        System.out.println("You have collected everything that you needed. Now is the time to go back into the world.");
        Survivalist = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveSchool(Student x)
    {
        Survivalist = null;
    }
}
