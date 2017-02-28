package Game;
import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class WalkingFighterStance3 extends Fighter implements KeyboardControllable
{

	
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();

	}

	public void act()
	{	
		freeze();
	}
	public void freeze()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location right= loc.getAdjacentLocation(90);
		WalkingFighterStance4 walk4 = new WalkingFighterStance4();
		if(gr.isValid(loc.getAdjacentLocation(-90)))
		{
		Location left=loc.getAdjacentLocation(-90);
		if(gr.get(left)instanceof IceRain1
				|| gr.get(right)instanceof IceRain1
				|| gr.get(loc.getAdjacentLocation(0))instanceof IceRain1)
		{
			try
			{
				walk4.setColor(Color.BLUE);
				walk4.putSelfInGrid(gr,loc);
				
			}	
			catch(Exception ex){}
		}
		else 
			walk4.putSelfInGrid(gr, loc);
		
		}
		else
			walk4.putSelfInGrid(gr,loc);
	}
	
	public void actionToPerform(String description)
	{
		

		  
		if(description.equals("W")){

			//moveTo(next);
			//moveTo(getLocation().getAdjacentLocation(180));

		}



		else if(description.equals("A")) {

			
		//moveTo(loc.getAdjacentLocation(-90));
//			putSelfInGrid(gr, loc);
//			for(int i=0; i<10000000; i++)
//			{
//				
//			}
//			removeSelfFromGrid();
		}
		else if(description.equals("RIGHT")) {
			
			Location loc = getLocation();
			Grid<Actor> gr= getGrid();
			WalkingFighterStance4 walk4 = new WalkingFighterStance4();
			try {  
				walk4.putSelfInGrid(gr,loc);
				  Thread.sleep(10L);   

				 }  
				 catch (Exception e) {}    
		}
	}
}
