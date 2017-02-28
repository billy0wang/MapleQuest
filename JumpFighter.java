package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class JumpFighter extends Fighter 
{

	public void act()
	{
		Grid<Actor> gr= getGrid();
		Location loc = getLocation();
		Fighter regular= new Fighter();
		try {  
			Thread.sleep(50L);
			checkForGround();
			
		}
		catch(Exception ex){}
		
		
	
	
	
	}
	public void checkForGround()
	{
		Grid<Actor> gr= getGrid();
		Location loc= getLocation();
		Fighter regular= new Fighter();
		Actor under= gr.get(loc.getAdjacentLocation(180));
		Location above= loc.getAdjacentLocation(0);
		if(!(under instanceof SummerGround) && !(under instanceof Portal)
				&& !(under instanceof Monster))
		{
			moveTo(loc.getAdjacentLocation(180));
		}
		if(gr.get(above) instanceof SummerGround)
			removeSelfFromGrid();
		if(under instanceof SummerGround)
			regular.putSelfInGrid(gr,loc);
			//regular.putSelfInGrid(gr,above.getAdjacentLocation(0));
	}
	
	
	
}


