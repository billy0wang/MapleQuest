package Game;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;

public class BossHurt extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location left=loc.getAdjacentLocation(-90);
		BossReg boss= new BossReg();
		if(gr.get(left)instanceof NinjaStars)
		{
			FighterHurt hurt= new FighterHurt();
			hurt.putSelfInGrid(gr,loc);
		}
		try{
			Thread.sleep(100L);
			boss.putSelfInGrid(gr,loc);
		}
		catch(Exception ex){}
		
	}

}