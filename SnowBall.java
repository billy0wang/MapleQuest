package Game;
                                                                     
                                                                     
                                                                     
                                             
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class SnowBall extends Actor 
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
		
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(-90);
		Location nextR = next.getAdjacentLocation(-90);
		Grid<Actor> gr= getGrid();
		if(!(gr.isValid(nextR)) || !(gr.isValid(next)))
				removeSelfFromGrid();
		else if(gr.get(next) instanceof Actor)
		{
			this.removeSelfFromGrid();
		}
		else if(gr.isValid(next))
			moveTo(next);
		else if(gr.get(next)instanceof IceRain1)
			moveTo(nextR);
		else
			removeSelfFromGrid();

	}

	}
