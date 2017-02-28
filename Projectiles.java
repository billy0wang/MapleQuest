package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Projectiles extends Actor implements KeyboardControllable
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

	}
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Grid<Actor> gr= getGrid();
		



	 if(description.equals("A")) {

			
			moveTo(loc.getAdjacentLocation(-90));
		}
		else if(description.equals("D")) {
			
			moveTo(loc.getAdjacentLocation(90));
		}
	}
}