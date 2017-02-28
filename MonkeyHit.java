package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class MonkeyHit extends MonkeyReg 
{
	private KeyWorld world;
	
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc= getLocation();	
		Location right=loc.getAdjacentLocation(90);
		Monkey75HP monk75= new Monkey75HP();
		Monkey50HP monk50= new Monkey50HP();
		Monkey25HP monk25= new Monkey25HP();
		try
		{
			if(health==75)
			{
			Thread.sleep(100L);
			monk75.putSelfInGrid(gr,loc);
			removeSelfFromGrid();
			}
			else if((health==50))
			{
				monk50.putSelfInGrid(gr,loc);
				removeSelfFromGrid();
			}
			else if(health==25) 
			{
				monk25.putSelfInGrid(gr,loc);
				removeSelfFromGrid();
			}
			else
			{
				health=100;
				removeSelfFromGrid();
			}
		}
		catch(Exception ex){}
		
		
		Location revNext = loc.getAdjacentLocation(-90);
		if(gr.isValid(revNext))
		{
		if((gr.get(revNext)instanceof NinjaStars)
				|| (gr.get(loc) instanceof NinjaStars)
				|| (gr.get(right)instanceof NinjaStars))
			health=health-25;
		}
		else if(gr.get(right)instanceof NinjaStars)
			health=health-25;

	}
	
}
	
		
	
