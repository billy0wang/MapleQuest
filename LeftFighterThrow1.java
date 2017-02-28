package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftFighterThrow1 extends LeftFighter 
{
	
	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftFighterThrow2 attack2= new LeftFighterThrow2();
		attack2.putSelfInGrid(gr,loc);
	}
	
}