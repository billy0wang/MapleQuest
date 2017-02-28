package Game;
import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class WalkingFighterStance1 extends Fighter
{
	public void act()
	{
		Grid<Actor> gr= getGrid();
		WalkingFighterStance2 walk2= new WalkingFighterStance2();
		Location loc = getLocation();
		Actor under=gr.get(loc.getAdjacentLocation(180));
		setStage();
		if(!(under instanceof SummerGround) && !(under instanceof Portal)
				&& !(under instanceof Monster))
		{
			moveTo(loc.getAdjacentLocation(180));
		}
		else
		walk2.putSelfInGrid(gr,loc);
	}

	public void setStage()
	{
		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		if(gr.get(loc.getAdjacentLocation(90))instanceof Portal
				|| gr.get(loc.getAdjacentLocation(180))instanceof Portal)
		{
			stage=stage+1;	
			maxHealth=maxHealth+100;
			health=health+100;
			mana=mana+100;
			
		}
	}

}