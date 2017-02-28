package Game;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

public class Tornado5 extends BossReg
{
	public void act()
	{
		hurt();
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
			Tornado6 Tornado6= new Tornado6();
			Tornado6.putSelfInGrid(gr,loc);
	}
}