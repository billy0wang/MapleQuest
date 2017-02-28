package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftAttack2 extends LeftFighter implements KeyboardControllable
{
	

	public void act()
	{
		Location loc = getLocation();
		Location next= loc.getAdjacentLocation(-90);
		Location nextNext=next.getAdjacentLocation(-90);
		Grid<Actor> gr= getGrid();
		LeftAttack3 attack3= new LeftAttack3();	
		attack3.putSelfInGrid(gr,loc);
		NinjaStarsLeft cIlbi1= new NinjaStarsLeft();
		NinjaStarsLeft cIlbi2= new NinjaStarsLeft();
		NinjaStarsLeft cIlbi3= new NinjaStarsLeft();
		if(!(gr.get(next)instanceof SummerGround)
				&& !(gr.get(next)instanceof Portal))
		cIlbi1.putSelfInGrid(gr, next);
	}
	
	public void actionToPerform(String description)
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		Location next= loc.getAdjacentLocation(-90);
		Location nextNext=next.getAdjacentLocation(-90);
		LeftWalkingStance2 left2= new LeftWalkingStance2();
		LeftAttack3 attack3= new LeftAttack3();
		NinjaStarsLeft cIlbi1= new NinjaStarsLeft();
		NinjaStarsLeft cIlbi2= new NinjaStarsLeft();
		NinjaStarsLeft cIlbi3= new NinjaStarsLeft();
		
		
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
				cIlbi1.putSelfInGrid(gr, next);
//				cIlbi2.putSelfInGrid(gr,nextNext.getAdjacentLocation(225));
//				cIlbi3.putSelfInGrid(gr,nextNext.getAdjacentLocation(315));


			}  
			catch(Exception e) {}
		}
	}

	
}