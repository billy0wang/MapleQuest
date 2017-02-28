package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossWalk3 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		BossWalk4 bosswalk4= new BossWalk4();
		bosswalk4.setColor(null);
		bosswalk4.putSelfInGrid(gr,loc);
		
	}
	
}