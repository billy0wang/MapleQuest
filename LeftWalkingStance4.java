package Game;
import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftWalkingStance4 extends LeftFighter
{
	
	
	public void act()
	{
		freeze();
	}
	public void freeze()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location right= loc.getAdjacentLocation(90);
		Location left=loc.getAdjacentLocation(-90);
		if((!(gr.get(left)instanceof Actor)))
		{
			if(gr!=null)
			{
				if(gr.get(left)instanceof IceRain1
						|| gr.get(right)instanceof IceRain1
						|| gr.get(loc.getAdjacentLocation(0))instanceof IceRain1)
				{
					try
					{
						health=health-10;
						Thread.sleep(300L);
						LeftFighter reg= new LeftFighter();
						reg.putSelfInGrid(gr, loc.getAdjacentLocation(-90));
						removeSelfFromGrid();
						
					}
					catch(Exception ex){}
				}
				else
				{
					LeftFighter reg= new LeftFighter();
					reg.putSelfInGrid(gr, loc.getAdjacentLocation(-90));
					removeSelfFromGrid();
				}
			}
		}
	}
	
}