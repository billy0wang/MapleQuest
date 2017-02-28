package Game;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;

//Billy Wang 
// Pd 4 Comp Sci

public class RockHound extends Critter
{
	
	    public void processActors(ArrayList<Actor> actors)
	    {
	        for (Actor a : actors)
	        {
	            if ((a instanceof Rock))
	                a.removeSelfFromGrid();
	        }
	    }

}