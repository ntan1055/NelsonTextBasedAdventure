package Player;

public class Student
{
    String firstName;
    String familyName;
    int xLoc, yLoc;

    public int getxLoc()
    {
        return xLoc;
    }

    public void setxLoc(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public int getyLoc()
    {
        return yLoc;
    }

    public void setyLoc(int yLoc)
    {
        this.yLoc = yLoc;
    }

    public Student (String firstName, String familyName, int xLoc, int yLoc)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
}
