package Runner;

import Player.Student;
import Room.Classroom;
import Room.Closet;
import Room.Hallway;
import Room.Lab;
import Room.emergencyExit;
import Room.Room;

import java.util.Scanner;

public class Main 
{
    private static boolean
            gameOn = true;
    
    public static void main(String[] args)
    {
        Room[][] School = new Room[8][4];

        Student Survivalist = new Student(" "," ", 0, 0);
        School[0][0].enterSchool(Survivalist);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W");
            String move = in.nextLine();
            if(validMove(move, Survivalist, School))
            {
                System.out.println("Your coordinates: row = " + Survivalist.getxLoc() + " col = " + Survivalist.getyLoc());
            }
            else
            {
                System.out.println("Please choose a valid move.");
            }
        }
    }

    public static boolean validMove(String move, Student x, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move)
        {
            case "n":
            if (x.getxLoc() > 0)
            {
                map[x.getxLoc()][x.getyLoc()].leaveSchool(x);
                map[x.getxLoc()-1][x.getyLoc()].enterSchool(x);
                return true;
            }
            else
            {
                return false;
            }
            case "e":
                if (x.getyLoc() < map[x.getyLoc()].length - 1)
                {
                    map[x.getxLoc()][x.getyLoc()].leaveSchool(x);
                    map[x.getxLoc()][x.getyLoc() + 1].enterSchool(x);
                    return true;
                }
                else
                {
                    return false;
                }
            case "s":
                if (x.getxLoc() < map.length - 1)
                {
                    map[x.getxLoc()][x.getyLoc()].leaveSchool(x);
                    map[x.getxLoc() + 1][x.getyLoc()].enterSchool(x);
                    return true;
                }
                else
                {
                    return false;
                }
            case "w":
                if (x.getyLoc() > 0)
                {
                    map[x.getxLoc()][x.getyLoc()].leaveSchool(x);
                    map[x.getxLoc()][x.getyLoc() - 1].enterSchool(x);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;
        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }
}
