package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class NinjaStars extends Actor implements KeyboardControllable
{
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(90);
		Location nextNext = next.getAdjacentLocation(90);
		Location revNext = loc.getAdjacentLocation(-90);
		if(gr.get(next)instanceof Portal)
			removeSelfFromGrid();
		else
		{
			if((gr.get(next) instanceof Actor)
					||((gr.get(loc)instanceof Actor) && (!(gr.get(loc) instanceof NinjaStars))))
			{
				removeSelfFromGrid();
			}
			else if(gr.isValid(next))
			{
				moveTo(next);
			}
			else
				removeSelfFromGrid();
		}


	}

	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(90);
		Location revNext = loc.getAdjacentLocation(-90);
		Location doubleRevNext= revNext.getAdjacentLocation(-90);
		Location nextNext = next.getAdjacentLocation(90);
		checkStuff();
		

		//		if(gr.isValid(nextNext))
		//		{
		//			if((gr.get(next) instanceof OrangeMushroomRegular))			
		//				removeSelfFromGrid();
		//			else
		//			move();
		//			
		//		}

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
	public void checkStuff()
	{
		Grid<Actor> gr= getGrid();
		Location loc=getLocation();
		Location next=getLocation().getAdjacentLocation(90);
		Location nextNext=next.getAdjacentLocation(90);
		if(gr.get(next)instanceof Portal)
			removeSelfFromGrid();
		else if((getGrid().get(next) instanceof Actor)
				|| (getGrid().get(next) instanceof Monster)
				|| (!(getGrid().isValid(nextNext))))
		{
			removeSelfFromGrid();
		}
		else                                 
			move();
	}

}