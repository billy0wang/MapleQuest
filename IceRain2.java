package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class IceRain2 extends IceRain1
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		IceRain3 IceRain3= new IceRain3();
		//IceRain3.setColor(null);
		IceRain3.putSelfInGrid(gr,loc);
		
	}
	
}