package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class PigA50HP extends Pig1 
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
		PigHit hit = new PigHit();
		PigB50HP pigB= new PigB50HP();
		if(gr.isValid(loc.getAdjacentLocation(-90)))
		{
			Actor something= gr.get(loc.getAdjacentLocation(-90));
			if((something instanceof NinjaStars)|| 
					gr.get(right)instanceof NinjaStars)
			{
				try {  
					health=health-50;
					hit.putSelfInGrid(gr,loc);
					Thread.sleep(100L);   

				}  
				catch(Exception e) {}


			}
			else
				pigB.putSelfInGrid(gr, loc);
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
			pigB.putSelfInGrid(gr, loc);
			
	}
}
