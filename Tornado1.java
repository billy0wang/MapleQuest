package Game;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class Tornado1 extends BossReg
{
	public void act()
	{
		hurt();
	}
	public void evade()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location left= loc.getAdjacentLocation(-90);
		Location right= loc.getAdjacentLocation(90);
		Tornado2 tornado2= new Tornado2();
		if((gr.get(left)instanceof Actor)
				|| (gr.get(right)instanceof Actor))
				{
					int somethingNew= (int)((Math.random()*13))+1;
					Location otherLoc= new Location(6, somethingNew);
					moveTo(otherLoc);
					tornado2.putSelfInGrid(gr, otherLoc);
					
				}
		else
		{
			Tornado2 Tornado2= new Tornado2();
			Tornado2.putSelfInGrid(gr,loc);
		}
	}
	public void hurt()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(gr.get(loc.getAdjacentLocation(-90)) instanceof NinjaStars
				|| gr.get(loc.getAdjacentLocation(90)) instanceof NinjaStars)
		{
			
			bossHealth = bossHealth -50;
			BossHurt hurt= new BossHurt();
			hurt.setColor(Color.RED);
			hurt.putSelfInGrid(gr,loc);
			if (bossHealth == 0) 
			{
				JOptionPane.showMessageDialog(null,"You've beat the boss! Yay!");
				System.exit(0);
			}
		}
		else
			setColor(null);
			Tornado2 Tornado2= new Tornado2();
			Tornado2.putSelfInGrid(gr,loc);
		
	}
	
}