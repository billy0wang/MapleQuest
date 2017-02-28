package Game;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.gui.WorldFrame;

public class WalkingFighterStance4 extends Fighter
{
	
	public void act()
	{
		freeze();
	}
//	public void bewareMonster()
//	{
//	Location loc = getLocation();
//	Grid<Actor> gr= getGrid();
//	Location right= loc.getAdjacentLocation(90);
//	if(gr.get(right)instanceof Monster)
//	{
//	health = health -30;
//	FighterHurt hurt = new FighterHurt();
//	hurt.setColor(Color.RED);
//	hurt.putSelfInGrid(gr, loc.getAdjacentLocation(-90));
//	removeSelfFromGrid();
//	}
//	}
	public void freeze()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location right= loc.getAdjacentLocation(90);
		Location left=loc.getAdjacentLocation(-90);
		if((!(gr.get(right)instanceof Actor)))
		{
			if(gr.isValid(left))
			{
				if(gr!=null)
				{
					if(gr.get(left)instanceof IceRain1
							|| gr.get(right)instanceof IceRain1
							|| gr.get(loc.getAdjacentLocation(0))instanceof IceRain1)
					{
						try
						{
							health=health-10;
							Thread.sleep(300L);
							Fighter reg= new Fighter();
							reg.putSelfInGrid(gr, loc.getAdjacentLocation(90));
							removeSelfFromGrid();
							
						}
						catch(Exception ex){}
					}
					else
					{
						Fighter reg= new Fighter();
						reg.putSelfInGrid(gr, loc.getAdjacentLocation(90));
						removeSelfFromGrid();
					}
				}
			}
			else
			{
				Fighter reg= new Fighter();
				reg.putSelfInGrid(gr, loc.getAdjacentLocation(90));
				removeSelfFromGrid();
			}
		}
	}
		public void injured()
		{
			Grid<Actor> gr = getGrid();
			Location loc = getLocation();
			if(gr.isValid(loc.getAdjacentLocation(-90))
					&& gr.isValid(loc.getAdjacentLocation(90)))
			{
				if((gr.get(loc.getAdjacentLocation(90)) instanceof SnowBall)
						|| (gr.get(loc.getAdjacentLocation(90)) instanceof OrangeMushroomRegular)
						|| (gr.get(loc.getAdjacentLocation(0))instanceof IceRain5)
						|| (gr.get(loc.getAdjacentLocation(-90)) instanceof SnowBall)
						|| (gr.get(loc.getAdjacentLocation(-90)) instanceof OrangeMushroomRegular))
				{
					
					//			health = health -30;
					//			FighterHurt hurt = new FighterHurt();
					//			hurt.setColor(Color.RED);
					//			hurt.putSelfInGrid(gr, loc);
					//			if (health == 0) 
					//			{
					//				if(lives==0)
					//				{
					//					JOptionPane.showMessageDialog(null,"You've lost the game!");
					//					System.exit(0);
					//				}
					//				lives=lives-1;
					//				JOptionPane.showMessageDialog(null,"You have died, but " +
					//						"its ok since you still have" + (lives+1) + " lives left");
					//				setHealth(500);
					//
					//			}
				}
				else
				{
					Fighter reg= new Fighter();
					reg.putSelfInGrid(gr, loc.getAdjacentLocation(90));
					removeSelfFromGrid();
				}
			}
		}
		
	}