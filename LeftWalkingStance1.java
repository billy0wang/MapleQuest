package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftWalkingStance1 extends LeftFighter implements KeyboardControllable
{
	

	public void act()
	{
		LeftWalkingStance2 left2= new LeftWalkingStance2();
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		left2.putSelfInGrid(gr,loc);
	}
	
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftWalkingStance2 left2= new LeftWalkingStance2();
		left2.setColor(null);
		
		if(description.equals("W")){

			//moveTo(next);
			//moveTo(getLocation().getAdjacentLocation(180));

		}



		else if(description.equals("LEFT")) {
			

			try {  
				left2.putSelfInGrid(gr,loc);
				   Thread.sleep(50L);   

				 }  

				 catch (Exception e) {}      

		}
	}

	
}