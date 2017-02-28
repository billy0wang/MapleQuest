package Game;
import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftWalkingStance3 extends LeftFighter implements KeyboardControllable
{
	

	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		freeze();
	}
	public void freeze()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location right= loc.getAdjacentLocation(90);
		Location left=loc.getAdjacentLocation(-90);
		LeftWalkingStance4 walk4 = new LeftWalkingStance4();
		if(gr!=null)
		{
		if(gr.get(left)instanceof IceRain1
				|| gr.get(right)instanceof IceRain1
				|| gr.get(loc.getAdjacentLocation(0))instanceof IceRain1)
		{
			try
			{
				walk4.setColor(Color.BLUE);
				walk4.putSelfInGrid(gr,loc);
				
			}
			catch(Exception ex){}
		}
		else
		walk4.putSelfInGrid(gr,loc);
		}
	}
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftWalkingStance4 left4= new LeftWalkingStance4();
		left4.setColor(null);
		
		if(description.equals("W")){

			//moveTo(next);
			//moveTo(getLocation().getAdjacentLocation(180));

		}



		else if(description.equals("LEFT")) {
			

			try {  
				left4.putSelfInGrid(gr,loc);
				   Thread.sleep(50L);
				 

				 }  

				 catch (Exception e) {}      

		}
	}

	
}