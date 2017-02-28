package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Tiger extends Monster 
{
	public static int health=100;
	
	public void act()
	{
		checkForSpells();
		
	}
	public void checkForSpells()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		
		Actor something= gr.get(loc.getAdjacentLocation(-90));
		TigerHit hit = new TigerHit();
		if((something instanceof NinjaStars)
				|| (something instanceof FlameThrower))
		{
			try {  
				hit.putSelfInGrid(gr,loc);
				Thread.sleep(100L);   

			}  
			catch(Exception e) {}
			
			
		}
		else
			super.act();
			
	}
//	public void level2()
//	{
//		Grid<Actor> gr = getGrid();
//		Location loc= getLocation();			
//		for(int i=0; i<gr.getNumRows(); i++)
//		{
//			ArrayList<Actor> oldCritters = getGrid().getNeighbors(
//					loc.getAdjacentLocation(getDirection()+(45*i)));
//			for(int j=0; j<gr.getNumCols(); j++)
//			{
//				if(!(gr.get(loc) instanceof Portal))
//				removeSelfFromGrid();
//			}
//		}
//		}
	}
