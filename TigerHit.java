package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class TigerHit extends Tiger 
{
	
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc= getLocation();				
		Tiger80HP tig80= new Tiger80HP();
		Tiger60HP tig60= new Tiger60HP();
		Tiger40HP tig40= new Tiger40HP();
		Tiger20HP tig20= new Tiger20HP();
		try
		{
			if(health==80)
			{
			Thread.sleep(100L);
			tig80.putSelfInGrid(gr,loc);
			}
			else if(health==60)
			{
				Thread.sleep(100L);
				tig60.putSelfInGrid(gr,loc);
			}
			else if(health==40)
			{
				Thread.sleep(100L);
				tig40.putSelfInGrid(gr,loc);
			}
			else if(health==20)
			{
				Thread.sleep(100L);
				tig20.putSelfInGrid(gr,loc);
			}
			else
			{
				health=100;
				removeSelfFromGrid();
			}
			
			//Put in bottom code to create hit animation
			//orReg.putSelfInGrid(gr, loc);
			
		}
		catch(Exception ex){}
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
