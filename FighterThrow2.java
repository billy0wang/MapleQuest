package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class FighterThrow2 extends Fighter 
{
	


	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		FighterThrow3 attack3= new FighterThrow3();
		attack3.putSelfInGrid(gr,loc);
		Location next=loc.getAdjacentLocation(90);
		FlameThrower flame= new FlameThrower();
		if(!(gr.get(next)instanceof SummerGround)
				&& !(gr.get(next)instanceof Portal))
		flame.putSelfInGrid(gr, next);
	}
	
}