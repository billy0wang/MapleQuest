package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class FighterLightning extends Fighter implements KeyboardControllable
{
	

	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		Fighter reg= new Fighter();
		try
		{
			Thread.sleep(100L);
			reg.putSelfInGrid(gr,loc);
		}
		catch(Exception ex){}
	}
	
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftWalkingStance2 left2= new LeftWalkingStance2();
		Fighter reg= new Fighter();
		
		if((description.equals("V")||
				(description.equals("LEFT") || (description.equals("RIGHT")||
				(description.equals("Z"))))))
		{
			reg.putSelfInGrid(gr,loc);
			//moveTo(next);
			//moveTo(getLocation().getAdjacentLocation(180));

		}



		else if(description.equals("A")) {
			

			try {  
				left2.putSelfInGrid(gr,loc);
				   Thread.sleep(50L);   

				 }  

				 catch (Exception e) {}      

		}
		
	}

	
}