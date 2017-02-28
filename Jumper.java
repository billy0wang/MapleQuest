package Game;
import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
//Billy Wang & Marc Eastman & Stephen Lee
// Checked by Ben Epstein
public class Jumper extends Bug
{
	public Jumper()
	{
		setColor(Color.green);
	}
	public Jumper(Color color)
	{
		setColor(color);
	}
	public boolean canMove()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location nextNext=next.getAdjacentLocation(getDirection());
		if (!gr.isValid(nextNext))
			return false;
		Actor neighbor = gr.get(nextNext);
		return (neighbor == null)  ;
	}
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation((getDirection()));
		Location nextNext=next.getAdjacentLocation(getDirection());
		if (gr.isValid(nextNext))
			moveTo(nextNext);
		else
			removeSelfFromGrid();
	}

	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location nextNext=next.getAdjacentLocation(getDirection());


		Actor neighbor;
		Actor current = gr.get(loc);
		


		if (canMove()){
			move();
			if(gr.isValid(next) && gr.get(next) instanceof Actor)
					
			{
				this.setColor(gr.get(next).getColor());
				if(gr.get(next) instanceof Flower)
				{
				gr.get(next).removeSelfFromGrid();
				}
			}
		}
	

		else  if(gr.isValid(nextNext) && gr.get(nextNext) instanceof Jumper)
		{
			neighbor = gr.get(nextNext);
			current.removeSelfFromGrid();
			neighbor.removeSelfFromGrid();
			neighbor.putSelfInGrid(gr,loc);
			current.putSelfInGrid(gr, nextNext);


		}
		else if(!(gr.isValid(nextNext)) || !(gr.isValid(next)))
		{
			turn();
			setColor(Color.black);

		}
		else
			turn();








	}

		
	}
