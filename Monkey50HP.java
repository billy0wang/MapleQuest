package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Monkey50HP extends MonkeyReg  
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
		MonkeyHit hitMush= new MonkeyHit();
		if(gr.isValid(revNext))
		{
		if((gr.get(revNext)instanceof NinjaStars)
				|| (gr.get(loc) instanceof NinjaStars)
				|| (gr.get(right)instanceof NinjaStars))
		{
			health=health-25;
			hitMush.putSelfInGrid(gr,loc);
			
		}
		else
			super.act();
		}
		if(gr.get(right)instanceof NinjaStars)
		{
			health=health-25;
			if(!(gr.isValid(hitMush.getLocation())))
				hitMush.putSelfInGrid(gr,loc);
			
		}
		else
			super.act();
		
	}
}