package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class PigHit extends Pig1 
{

	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc= getLocation();				
		if(health==50)
		try
		{
			Thread.sleep(100L);
			PigA50HP pig= new PigA50HP();
			pig.putSelfInGrid(gr,loc);
			removeSelfFromGrid();

		}
		catch(Exception ex){}
		else if(health<=0)
			removeSelfFromGrid();
		


	}

}
