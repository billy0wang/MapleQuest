package Game;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Pig3 extends Pig1 
{
	
	public void act()
	{
		checkForSpells();
		
	}
	
	public void checkForSpells()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location right=loc.getAdjacentLocation(90);
		Pig1 pig1= new Pig1();
		PigHit hit = new PigHit();
		Location left= loc.getAdjacentLocation(-90);
		if(gr.isValid(left))
		{
		Actor thingRight= gr.get(loc.getAdjacentLocation(90));
		Actor thingLeft= gr.get(loc.getAdjacentLocation(-90));
		Actor thingRightBelow= gr.get(loc.getAdjacentLocation(135));
		Actor thingLeftBelow= gr.get(loc.getAdjacentLocation(225));
		double r = Math.random();
		int angle;
		if (r < 0.5)
			angle = Location.LEFT;
		else
			angle = Location.RIGHT;
		
		if(gr.isValid((loc.getAdjacentLocation(angle))))
		{
			if((!(thingRightBelow instanceof Actor))
					|| (thingRight instanceof SummerGround))
			{
				
				pig1.putSelfInGrid(gr,loc.getAdjacentLocation(-90));
				removeSelfFromGrid();
			}
			
			else if((!(thingLeftBelow instanceof Actor))
					|| (thingLeft instanceof SummerGround))
			{
				
				pig1.putSelfInGrid(gr,loc.getAdjacentLocation(90));
				removeSelfFromGrid();
			}
			else
			{
				pig1.putSelfInGrid(gr,loc.getAdjacentLocation(angle));
				removeSelfFromGrid();
			}
			if((gr.get(left) instanceof NinjaStars)|| 
					gr.get(right)instanceof NinjaStars)
			{
				try {  
					health=health-50;
					hit.putSelfInGrid(gr,loc);
					Thread.sleep(100L);   
				}  
				catch(Exception e) {}
			}
		}
	}
		else if(gr.get(right)instanceof NinjaStars)
		{
			try {  
				health=health-50;
				hit.putSelfInGrid(gr,loc);
				Thread.sleep(100L);   
			}  
			catch(Exception e) {}
		}
		else
		{
			pig1.putSelfInGrid(gr, loc.getAdjacentLocation(90));
			removeSelfFromGrid();
		}
	}
	
	
}
	
