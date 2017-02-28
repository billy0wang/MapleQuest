package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossWalk2 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		BossWalk3 bossWalk3= new BossWalk3();
		bossWalk3.setColor(null);
		bossWalk3.putSelfInGrid(gr,loc);
		
	}
	
}