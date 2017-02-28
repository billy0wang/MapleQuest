package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class OrangeMushroom67HP extends OrangeMushroomRegular  
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
		Location right=loc.getAdjacentLocation(90);
		OrangeMushroomHit hitMush= new OrangeMushroomHit();
		if(gr.get(revNext)instanceof NinjaStars|| 
				gr.get(right)instanceof NinjaStars)
		{
			health=health-47;
			hitMush.putSelfInGrid(gr, loc);
			
		}
		else
			super.act();
	}
}