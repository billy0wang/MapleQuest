package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Tiger100HP extends Tiger  
{
	
	public void act()
	{
		takeDamage();
	
	}	
	public void takeDamage()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location revNext = loc.getAdjacentLocation(-90);
		TigerHit hitMush= new TigerHit();
		if((gr.get(revNext)instanceof NinjaStars)
				|| (gr.get(loc) instanceof NinjaStars))
		{
			hitMush.putSelfInGrid(gr,loc);
			health=health-20;
			
			
		}
		else
			super.act();
	}
}