package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossAttack2 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		fire();
		BossReg bossReg= new BossReg();
		bossReg.setColor(null);
		bossReg.putSelfInGrid(gr,loc);
		
	}
	public void fire()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location next= loc.getAdjacentLocation(-90);
		Location nextNext= next.getAdjacentLocation(-90);
		SnowBall sBall= new SnowBall();
		if(!(gr.get(next)instanceof Fighter))
		sBall.putSelfInGrid(gr, next);
		
	}
	
}