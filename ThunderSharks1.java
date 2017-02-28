package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class ThunderSharks1 extends Actor implements KeyboardControllable
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
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(90);
		Grid<Actor> gr= getGrid();
		if(gr.isValid(next))
		{
			moveTo(next);
		}
		else
			removeSelfFromGrid();

	}
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(90);
		Grid<Actor> gr= getGrid();
		if(description.equals("Z")) {
			
			//moveTo(loc.getAdjacentLocation(90));
		}

	}
}