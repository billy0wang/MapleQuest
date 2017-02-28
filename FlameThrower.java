package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class FlameThrower extends NinjaStars 
{
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(90);
		if (gr.isValid(next))
			moveTo(next);
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
		//whichDirection();


		//		if((gr.get(next) instanceof OrangeMushroomRegular))			
		//		{
		//			removeSelfFromGrid();
		//		}


		//		if(!(nextNext==null))
		//		{
		//			removeSelfFromGrid();
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
//	public void whichDirection()
//	{
//		Grid<Actor> gr= getGrid();
//		Location loc = getLocation();
//		Location next = loc.getAdjacentLocation(90);
//		Location revNext=next.getAdjacentLocation(-90);
//		Location doubleRevNext=revNext.getAdjacentLocation(-90);
//		NinjaStars nStar= new NinjaStars();
//
//		if(gr.get(doubleRevNext) instanceof Fighter)
//		{
//			System.out.println("reg fighter");
//			moveTo(next);
//		}
//		else if(gr.get(doubleRevNext) instanceof LeftFighter)
//		{
//			removeSelfFromGrid();
//			System.out.println("left fighter");
//		}
//	}
	public void checkStuff()
	{
		Location next=getLocation().getAdjacentLocation(90);
		Location nextNext=next.getAdjacentLocation(90);
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