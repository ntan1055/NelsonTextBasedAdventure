package Room;

import Player.Student;

public class Classroom
{
    Student Survivalist;
    int xLoc, yLoc;

    public Classroom(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterClassroom(Student x)
    {
        System.out.println("The smell of fresh blood suddenly filled the air, and you are repulsed by it. Trying not to throw up, you find the corpse of...");
        Survivalist = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveClassroom(Student x)
    {
        Survivalist = null;
    }
}
