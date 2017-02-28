package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftWalkingStance2 extends LeftFighter implements KeyboardControllable
{
	

	public void act()
	{
		LeftWalkingStance3 left3= new LeftWalkingStance3();
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		left3.putSelfInGrid(gr,loc);
	}
	
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftWalkingStance3 left3= new LeftWalkingStance3();
		left3.setColor(null);
		
		if(description.equals("W")){

			//moveTo(next);
			//moveTo(getLocation().getAdjacentLocation(180));

		}



		else if(description.equals("LEFT")) {
			

			try {  
				left3.putSelfInGrid(gr,loc);
				   Thread.sleep(50L);   

				 }  

				 catch (Exception e) {}      

		}
	}

	
}