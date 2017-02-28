package Game;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class BossAttackRight1 extends BossReg
{
	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		BossAttackRight2 bossAttack2= new BossAttackRight2();
		bossAttack2.putSelfInGrid(gr,loc);
		
		
	}
	
}