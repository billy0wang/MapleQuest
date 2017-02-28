package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class DeadFighter extends Actor
{

	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Fighter alive= new Fighter();
		//IceRain2.setColor(null);
		alive.putSelfInGrid(gr,loc);
		
	}
	
}