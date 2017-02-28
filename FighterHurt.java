package Game;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;

public class FighterHurt extends Fighter
{

	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location left=loc.getAdjacentLocation(-90);
		KeyWorld world = new KeyWorld(new BoundedGrid<Actor>(7,18));
		Fighter fighter= new Fighter();
		try{
			
			world.setMessage("Health: "+ health);
			Thread.sleep(200L);
			fighter.putSelfInGrid(gr,loc);
		}
		
		catch(Exception ex){}
		
	}



}