package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossWalk4 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		BossReg bossReg= new BossReg();
		bossReg.setColor(null);
		double rando= Math.random();
		if((rando>0.5) && gr.isValid(loc.getAdjacentLocation(90)))
		{
		bossReg.putSelfInGrid(gr,loc.getAdjacentLocation(90));
		removeSelfFromGrid();
		}
		else if(gr.isValid(loc.getAdjacentLocation(-90)))
		{
		bossReg.putSelfInGrid(gr,loc.getAdjacentLocation(-90));
		removeSelfFromGrid();
		}
		
	}
	
}