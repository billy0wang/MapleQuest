package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class FighterThrow3 extends Fighter 
{
	
	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		Fighter reg = new Fighter();
		reg.putSelfInGrid(gr,loc);
	}
	
}