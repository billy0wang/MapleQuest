package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Vampire1 extends Actor implements KeyboardControllable
{
	


	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(90);
		Location revNext = loc.getAdjacentLocation(-90);
		Location doubleRevNext= revNext.getAdjacentLocation(-90);
		Location nextNext = next.getAdjacentLocation(90);
		Vampire2 vamp2= new Vampire2();
		vamp2.putSelfInGrid(gr, loc);
		


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
	public void whichDirection()
	{
		Grid<Actor> gr= getGrid();
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(90);
		Location revNext=next.getAdjacentLocation(-90);
		Location doubleRevNext=revNext.getAdjacentLocation(-90);
		NinjaStars nStar= new NinjaStars();
		
		if(gr.get(doubleRevNext) instanceof Fighter)
		{
			moveTo(next);
		}
		else if(gr.get(doubleRevNext) instanceof LeftFighter)
		{
			removeSelfFromGrid();
		}
	}
	public void checkStuff()
	{
		Location next=getLocation().getAdjacentLocation(90);
		if(getGrid().get(next) instanceof SummerGround)
		{
			removeSelfFromGrid();
		}
	}
	

}