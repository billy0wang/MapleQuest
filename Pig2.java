package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Pig2 extends Pig1 
{
	
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc=getLocation();
		checkForSpells();
		
		
	}
	public void checkForSpells()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Pig3 pig3= new Pig3();
		Location left=loc.getAdjacentLocation(-90);
		if(gr.isValid(left))
		{
		Location right=loc.getAdjacentLocation(90);
		PigHit hit = new PigHit();
		if((gr.get(left)instanceof NinjaStars)|| 
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
			pig3.putSelfInGrid(gr, loc);
		}
		else	
			pig3.putSelfInGrid(gr, loc);
		
			
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
