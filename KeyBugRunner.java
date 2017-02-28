package Game;
/*
 * Written By: Sam Gross & Thomas Dorsey
 * 
 * This class contains two bugs that are controllable by the user. One
 * is controlled by the arrow keys and the other by the WASD keys. The
 * code for them can be found in "KeyBug" and "WASDKeyBug." In order
 * to move, the run button must be clicked. 
 * 
 * This class, and the others contaiend within the package 
 * "KeyBugDistro" may not be sold or commercialized in any way. If
 * published, attribution must be made to the authors of the work.
 * Do not remove this message when modifying or distributing this code.
 */
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import java.awt.Color;
public class KeyBugRunner
{
    public static void main(String[] args)
    {  	
        
    	KeyWorld world = new KeyWorld();
    	
    	Actor alice = new KeyBug();
    	Actor joe = new WASDKeyBug();
    	
    	
        alice.setColor(Color.GREEN);
        world.add(new Location(7, 8), alice);
        joe.setColor(Color.ORANGE);
        world.add(new Location(2, 1), joe);
        world.show();
    }
}