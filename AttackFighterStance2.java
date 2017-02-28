package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class AttackFighterStance2 extends Fighter implements KeyboardControllable
{
	public void act()
	{
		Location loc = getLocation();
		Location next= loc.getAdjacentLocation(90);
		Grid<Actor> gr= getGrid();
		AttackFighterStance3 attack3= new AttackFighterStance3();
		attack3.putSelfInGrid(gr,loc);
		NinjaStars cIlbi1= new NinjaStars();
		if(!(gr.get(next)instanceof SummerGround)
				&& !(gr.get(next)instanceof Portal))
		cIlbi1.putSelfInGrid(gr, next);
				
	}
	
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		Location next= loc.getAdjacentLocation(90);
		LeftWalkingStance2 left2= new LeftWalkingStance2();
		AttackFighterStance3 attack3= new AttackFighterStance3();
		attack3.setColor(null);
		left2.setColor(null);
		NinjaStars cIlbi1= new NinjaStars();
		NinjaStars cIlbi2= new NinjaStars();
		NinjaStars cIlbi3= new NinjaStars();
		cIlbi1.setColor(null);
		cIlbi2.setColor(null);
		cIlbi3.setColor(null);
		
		
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
				attack3.putSelfInGrid(gr,loc);
				Thread.sleep(50L);   
				if(!(gr.get(next)instanceof Portal))	
					cIlbi1.putSelfInGrid(gr, next);


			}  
			catch(Exception e) {}
		}
	}

	
}