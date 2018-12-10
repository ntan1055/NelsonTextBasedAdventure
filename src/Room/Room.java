package Room;

import Player.Student;
import Room.Hallway;
import Room.Classroom;
import Room.Lab;
import Room.Closet;
import Room.emergencyExit;

public class Room
{
    Student Survivalist;
    int xLoc, yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }
    public void enterSchool(Student x)
    {
        Survivalist = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public boolean enterHallway(Student x, int xLoc, int yLoc)
    {
        if(xLoc.getxLoc())
    }

    public void leaveSchool(Student x)
    {
        Survivalist = null;
    }
}
