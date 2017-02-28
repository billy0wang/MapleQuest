package Game;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class Tornado6 extends BossReg
{
	public void act()
	{
		hurt();
	}
	public void teleport()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		ArrayList temp = gr.getOccupiedLocations();
		for (int i=0; i<temp.size(); i++)
		{
			BossReg boss= new BossReg();
			BossAttackRight1 atckRight= new BossAttackRight1();
			Location los = (Location)temp.get(i);
			Actor stuff= gr.get(los);
			if(((stuff instanceof Fighter) 
					|| (stuff instanceof LeftFighter)
					&& (!(stuff instanceof BossReg))))
			{
				Location fighterLoc=stuff.getLocation();
				if( loc.getCol()>fighterLoc.getCol())
				{
					boss.putSelfInGrid(gr,loc);
				}
				else if(loc.getCol()<fighterLoc.getCol())
				{
					atckRight.putSelfInGrid(gr,loc);
				}
				
			}
	
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
			teleport();
	}
	
}