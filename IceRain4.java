package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class IceRain4 extends IceRain1
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		IceRain5 IceRain5= new IceRain5();
		//IceRain5.setColor(null);
		IceRain5.putSelfInGrid(gr,loc);
		
	}
	
}