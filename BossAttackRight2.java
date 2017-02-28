package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossAttackRight2 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		fire();
		int randoLoc=(int) (Math.random()*10)+1;;
		Location randoPlace=new Location(6,randoLoc);
		Tornado1 wind1= new Tornado1();
		if(!(gr.get(randoPlace)instanceof BossReg))
		{
			wind1.putSelfInGrid(gr, randoPlace);
			removeSelfFromGrid();
		}
	}
	public void fire()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location next= loc.getAdjacentLocation(90);
		SnowBallRight sBall= new SnowBallRight();
		if(!(gr.get(next)instanceof Fighter))
		sBall.putSelfInGrid(gr, next);
		
	}
	
}