package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class FlameThrowerLeft extends NinjaStars 
{
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(-90);
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();

	}

	public void act()
	{
		checkStuff();
	}
	

	public void checkStuff()
	{
		Location next=getLocation().getAdjacentLocation(-90);
		Grid<Actor> gr= getGrid();
		if(gr.isValid(next))
		{
			if((getGrid().get(next) instanceof SummerGround)
					|| getGrid().get(next) instanceof Monster
					|| getGrid().get(next) instanceof BossReg)
			{
				(this).removeSelfFromGrid();
			}
			else if(gr.get(next)instanceof Portal)
				removeSelfFromGrid();
			else
				move();
		}
		else
			removeSelfFromGrid();
	}

}