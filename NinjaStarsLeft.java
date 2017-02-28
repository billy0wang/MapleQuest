package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class NinjaStarsLeft extends NinjaStars 
{
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(-90);
		
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
	public void checkStuff()
	{
		Grid<Actor> gr= getGrid();
		Location next=getLocation().getAdjacentLocation(-90);
		Location nextNext=next.getAdjacentLocation(-90);
		if(gr.isValid(next))
		{
		if((getGrid().get(next) instanceof SummerGround)
				|| (getGrid().get(next) instanceof Monster)
				|| (!(getGrid().isValid(nextNext))))
		{
			(this).removeSelfFromGrid();
		}
		else                                 
			move();
		}
	}

}