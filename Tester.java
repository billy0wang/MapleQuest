package Game;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.grid.BoundedGrid;

/**
 * Generated  by SaveWorld
 * By Eric Rosenberg and Steven Miller.
 */
public class Tester extends Actor{
	public void act()
	{
		boolean canBreed= checkBreeding();
		boolean madeLife= isBreeding(canBreed);
		ArrayList<Location>moveLocs=getMoveLocations();
		Location loc=selectMoveLocation(moveLocs);
		makeMove(loc,madeLife);
		boolean shouldDie=checkDying();
		isDying(shouldDie);
	}
private Location selectMoveLocation(ArrayList<Location> moveLocs) {
		// TODO Auto-generated method stub
		return null;
	}
private ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}
private void isDying(boolean shouldDie) {
		// TODO Auto-generated method stub
		
	}
private void makeMove(Location loc, boolean madeLife) {
		// TODO Auto-generated method stub
		
	}
private boolean checkDying() {
		// TODO Auto-generated method stub
		return false;
	}
//	public static void main(String[] args){
//		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(30,30));
//		
//
//		world.show();
//	}

	private boolean isBreeding(boolean canBreed) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean checkBreeding() {
		// TODO Auto-generated method stub
		return false;
	}
}
