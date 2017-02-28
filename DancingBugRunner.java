package Game;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        int jams [] = {3,2,1};
        DancingBug bob = new DancingBug(1, jams);
        DancingBug coray= new DancingBug(1, jams);
        Rock geodude= new Rock();
        bob.setColor(Color.ORANGE);
        world.add(new Location(5, 5), bob);
        world.add(new Location(2,2), coray);
        world.add(new Location(3,3), geodude);
        world.show();
    }
}
//{1,2,5,6,8,12,15,4,7,11,0}