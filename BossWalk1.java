package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossWalk1 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		BossWalk2 bosswalk2= new BossWalk2();
		bosswalk2.setColor(null);
		bosswalk2.putSelfInGrid(gr,loc);
		
	}
	
}