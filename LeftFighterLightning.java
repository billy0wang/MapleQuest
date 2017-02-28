package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftFighterLightning extends Fighter 
{
	

	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		Fighter reg= new Fighter();
		try
		{
			Thread.sleep(100L);
			reg.putSelfInGrid(gr,loc);
		}
		catch(Exception ex){}
	}
	
}