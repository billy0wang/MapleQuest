package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class IceRain3 extends IceRain1
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		IceRain4 IceRain4= new IceRain4();
		//IceRain4.setColor(null);
		IceRain4.putSelfInGrid(gr,loc);
		
	}
	
}