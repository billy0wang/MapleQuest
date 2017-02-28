package Game;

import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BossReg extends Actor
{
	public static int bossHealth;
	
	public void act()
	{
		setColor(null);
		hurt();
		double rando= Math.random();
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		//		Location left=loc.getAdjacentLocation(-90);
		attack();
		//		else
		//			walk();
	}
	public void walk()
	{
		
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		//BossWalk1 bossWalk1= new BossWalk1(world);
		BossWalk1 bossWalk1= new BossWalk1();
		bossWalk1.putSelfInGrid(gr,loc);
		bossWalk1.setColor(null);
	}
	public void hurt()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(gr.get(loc.getAdjacentLocation(-90)) instanceof NinjaStars
				|| gr.get(loc.getAdjacentLocation(90)) instanceof NinjaStars ||
				gr.get(loc.getAdjacentLocation(-90)) instanceof Lightning
				|| gr.get(loc.getAdjacentLocation(90)) instanceof Lightning)
		{
			
			bossHealth = bossHealth -30;
			BossHurt hurt= new BossHurt();
			hurt.setColor(Color.RED);
			hurt.putSelfInGrid(gr,loc);
			if (bossHealth <= 0) 
			{
				JOptionPane.showMessageDialog(null,"You've beat the boss! Yay!");
				System.exit(0);
			}
		}
		else
			setColor(null);
		
	}
	public void attack()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(loc!=null)
		{
			Location right= loc.getAdjacentLocation(90);
			Location left=loc.getAdjacentLocation(-90);
			Location rightRight=right.getAdjacentLocation(90);
			Location leftLeft=left.getAdjacentLocation(-90);
			if(loc!=null)
			{
				int randoLoc=(int)(Math.random()*13)+1;
				double rando=Math.random();
				if((rando<0.5))
				{
					BossAttack1 bossAtck= new BossAttack1();
					bossAtck.putSelfInGrid(gr,loc);
					bossAtck.setColor(null);
				}
				
				
				if ((rando>0.5) && (rando<0.8))
				{
					Location randoPlace=new Location(6,randoLoc);
					IceRain1 rain= new IceRain1();
					if(gr.isValid(randoPlace))
					{	
						if(!(gr.get(randoPlace)instanceof BossReg)
								&& !(gr.get(randoPlace)instanceof Fighter))
						{
							rain.putSelfInGrid(gr,randoPlace);
						}
						else if(gr.get(randoPlace)instanceof Fighter)
						{
							rain.putSelfInGrid(gr,new Location(5,randoLoc));
						}
						else
						{
							IceRain1 iceRain1= new IceRain1();
							if((gr.get(right)instanceof Fighter)
									|| (gr.get(rightRight)instanceof Fighter)
									|| (gr.get(right)instanceof BossReg)
									|| (gr.get(rightRight)instanceof BossReg))
							{
								iceRain1.putSelfInGrid(gr,rightRight.getAdjacentLocation(90));
							}
							else if ((gr.get(left)instanceof Fighter)
									|| (gr.get(leftLeft)instanceof Fighter)
									|| (gr.get(left)instanceof BossReg)
									|| (gr.get(leftLeft)instanceof BossReg))
							{
								iceRain1.putSelfInGrid(gr,leftLeft.getAdjacentLocation(-90));
							}
							
							
						}
						
					}
				}
				if(rando>0.8)
				{
					
					Tornado1 tornado1= new Tornado1();
					Location randoPlace=new Location(6,randoLoc);
					Location randoRight=new Location(6,randoLoc+1);
					Location randoLeft= new Location(6,randoLoc-1);
					if(gr.isValid(randoPlace))
					{
						if((gr.get(randoPlace)instanceof Fighter)
								|| (gr.get(randoRight)instanceof Fighter)
								|| (gr.get(randoLeft)instanceof Fighter)
								&& (gr.isValid(getLocation())))
						{
							if(gr.get(new Location(6,11))instanceof BossReg)
							tornado1.putSelfInGrid(gr, new Location(6, 11));
							else
							{
								tornado1.putSelfInGrid(gr, new Location(6, 11));
								removeSelfFromGrid();
							}
						}
						else
						{
							if(gr.get(randoPlace)instanceof BossReg)
							{
								if((gr.get(right)instanceof Fighter)
										|| (gr.get(rightRight)instanceof Fighter))
									tornado1.putSelfInGrid(gr,rightRight.getAdjacentLocation(90));	
								else if ((gr.get(left)instanceof Fighter)
										|| (gr.get(leftLeft)instanceof Fighter))
									tornado1.putSelfInGrid(gr,leftLeft.getAdjacentLocation(-90));
								else
									tornado1.putSelfInGrid(gr,randoPlace);
							}
							
							else
							{
								if((gr.get(right)instanceof Fighter)
										|| (gr.get(rightRight)instanceof Fighter))
								{
									tornado1.putSelfInGrid(gr,rightRight.getAdjacentLocation(90));
									removeSelfFromGrid();
								}
								else if ((gr.get(left)instanceof Fighter)
										|| (gr.get(leftLeft)instanceof Fighter))
								{
									tornado1.putSelfInGrid(gr,leftLeft.getAdjacentLocation(-90));
									removeSelfFromGrid();
								}
								
								else
								{
									tornado1.putSelfInGrid(gr,randoPlace);
									removeSelfFromGrid();
								}
								
							}
						}
						
					}
					
				}
			}
			
		}
	}
	
	
	
	public static int getbossHealth() {
		return bossHealth;
	}
	public static void setbossHealth(int bossHealth) {
		BossReg.bossHealth = bossHealth;
	}
}