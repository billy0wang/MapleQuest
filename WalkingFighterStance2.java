package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class WalkingFighterStance2 extends Fighter implements KeyboardControllable
{
	
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();

	}

	public void act()
	{
		WalkingFighterStance3 walk3 = new WalkingFighterStance3();
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		walk3.putSelfInGrid(gr,loc);
	}
	
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		WalkingFighterStance3 walk3 = new WalkingFighterStance3();
		walk3.setColor(null);
		
		if(description.equals("RIGHT"))
		{
			try {  
				walk3.putSelfInGrid(gr,loc);
				Thread.sleep(10L);   

			}  

			catch (Exception e) {}      
		}
	}	
}



