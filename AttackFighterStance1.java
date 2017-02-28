package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class AttackFighterStance1 extends Fighter implements KeyboardControllable
{
	


	public void act()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		AttackFighterStance2 attack2= new AttackFighterStance2();
		attack2.setColor(null);
		attack2.putSelfInGrid(gr,loc);
	}
	
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftWalkingStance2 left2= new LeftWalkingStance2();
		AttackFighterStance2 attack2= new AttackFighterStance2();
		if(description.equals("W")){

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
		else if(description.equals("Z")) {

			try {  
				attack2.putSelfInGrid(gr,loc);
				Thread.sleep(50L);   

			}  
			catch(Exception e) {}
		}
	}

	
}