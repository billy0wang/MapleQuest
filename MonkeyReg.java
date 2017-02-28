package Game;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class MonkeyReg extends Monster 
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
		if (loc != null)
		{
			Location right=loc.getAdjacentLocation(90);
			Location revNext=loc.getAdjacentLocation(-90);
			MonkeyHit hit = new MonkeyHit();
			if(gr.isValid(revNext))
			{
				if(gr.get(revNext)instanceof NinjaStars
						|| gr.get(right)instanceof NinjaStars)
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
			else if(gr.get(right)instanceof NinjaStars)
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
	}
}
//public void level2()
//{
//Grid<Actor> gr = getGrid();
//Location loc= getLocation();			
//for(int i=0; i<gr.getNumRows(); i++)
//{
//ArrayList<Actor> oldCritters = getGrid().getNeighbors(
//loc.getAdjacentLocation(getDirection()+(45*i)));
//for(int j=0; j<gr.getNumCols(); j++)
//{
//if(!(gr.get(loc) instanceof Portal))
//removeSelfFromGrid();
//}
//}
//}

