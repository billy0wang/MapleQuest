package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class IceRain5 extends IceRain1
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		removeSelfFromGrid();
//		IceRain1 IceRain1= new IceRain1();
//		IceRain1.setColor(null);
//		IceRain1.putSelfInGrid(gr,loc);
		
	}
	
}