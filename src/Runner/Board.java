package Runner;

import Room.Classroom;
import Room.Closet;
import Room.Hallway;
import Room.Lab;
import Room.emergencyExit;

public class Board
{
    Classroom[][] map;
    Closet[][] map1;
    Hallway[][] map2;
    Lab[][] map3;
    emergencyExit[][] map4;
    public Board (Classroom[][] map, Closet[][] map1, Hallway[][] map2, Lab[][] map3, emergencyExit[][] map4)
    {
        this.map = map;
        this.map1 = map1;
        this.map2 = map2;
        this.map3 = map3;
        this.map4 = map4;
    }
    public Board (int height, int width)
    {
        map = new Classroom[height][width];
        map1 = new Closet[height-2][width-2];
        map2 = new Hallway[height+2][width-3];
        map3 = new Lab[height+2][width+2];
        map4 = new emergencyExit[height-4][width-4];
    }
}
