package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class OrangeMushroomHit extends OrangeMushroomRegular 
{
	private KeyWorld world;
	
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc= getLocation();				
		OrangeMushroom67HP orReg= new OrangeMushroom67HP();
		OrangeMushroom33HP orReg33= new OrangeMushroom33HP();
		try
		{
			if(health>50)
			{
			Thread.sleep(100L);
			orReg.putSelfInGrid(gr,loc);
			removeSelfFromGrid();
			}
			else if((health<50) && (health>0))
			{
				orReg33.putSelfInGrid(gr,loc);
				removeSelfFromGrid();
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

	}
