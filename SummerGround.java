package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class SummerGround extends Actor 
{
	public void act()
	{
//		Location loc=getLocation();
//		Location under= loc.getAdjacentLocation(180);
//		Grid<Actor> gr= getGrid();
//		Fighter reg= new Fighter();
//		Location fightLoc= reg.getLocation();
//
//		if(gr.get(fightLoc.getAdjacentLocation(180)) instanceof SummerGround)
//		{
//			System.out.println("fighter stepping on ground");
//		}
//		else
//			System.out.println("not touching ground");
	}
	
	public void checkforFighter()
	{
		Location loc=getLocation();
		Grid<Actor> gr= getGrid();
	}
}