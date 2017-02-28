package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftLightning extends Lightning 
{
	


	public void act()
	{
		try
		{
			Thread.sleep(100L);
			removeSelfFromGrid();
		}
		catch(Exception ex){}
		

	}
}