package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftFighterThrow2 extends LeftFighter 
{
	
	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftFighterThrow3 attack3= new LeftFighterThrow3();
		attack3.putSelfInGrid(gr,loc);
		Location next=loc.getAdjacentLocation(-90);
		FlameThrowerLeft leftFlame= new FlameThrowerLeft();
		if(!(gr.get(next)instanceof SummerGround)
				&& !(gr.get(next)instanceof Portal))
		leftFlame.putSelfInGrid(gr, next);
	}
	
}