package Game;
/*
 * Do not change this class.
 * If you do, it may break all keyboard-based controls that you have
 * written for other programs.
 */
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class KeyWorld extends ActorWorld
{
	
	public KeyWorld()
	{
		super();
	}
	public KeyWorld(Grid g)
	{
		super(g);
	}
	
	 public boolean keyPressed(String description, Location loc)
	{
		 Grid<Actor> gr=getGrid();
		 ArrayList<Actor> actors= new ArrayList<Actor>();
		 for(Location location : gr.getOccupiedLocations())
			 actors.add(gr.get(location));
		 for(Actor a : actors)
			 if(a.getGrid() == gr && a instanceof KeyboardControllable)
				 ((KeyboardControllable) a).actionToPerform(description);
		 return true;
	}
}