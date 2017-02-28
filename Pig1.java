package Game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Pig1 extends Monster 
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
		Location right=loc.getAdjacentLocation(90);
		PigHit hit = new PigHit();
		Pig2 pig2= new Pig2();
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
				pig2.putSelfInGrid(gr, loc);
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
			pig2.putSelfInGrid(gr, loc);
			
			
	}
}
