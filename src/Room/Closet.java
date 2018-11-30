package Room;

import Player.Student;

public class Closet
{
    Student Survivalist;
    int xLoc, yLoc;

    public Closet(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterRoom(Student x)
    {
        System.out.println("You enter the closet room. Here are supplies for survival.");
        Survivalist = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveSchool(Student x)
    {
        Survivalist = null;
    }
}
