package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossAttack1 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		BossAttack2 bossAttack2= new BossAttack2();
		bossAttack2.setColor(null);
		bossAttack2.putSelfInGrid(gr,loc);
		
		
	}
	
}