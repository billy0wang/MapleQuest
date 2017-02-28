package Game;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class AttackFighterStance3 extends Fighter 
{
	
	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		Fighter regular= new Fighter();
		Actor under= gr.get(loc.getAdjacentLocation(180));
		if(!(under instanceof SummerGround) && !(under instanceof Portal)
				&& !(under instanceof Monster))
		{
			moveTo(loc.getAdjacentLocation(180));
		}
		else
		regular.putSelfInGrid(gr, loc);
	}
	
}