package Game;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class CloudHeadQuarters extends Actor 
{
	public void act()
	{
		reviveFighter();
		reviveBoss();
	}
	public void reviveFighter()
	{
		Grid<Actor> gr= getGrid();
		ArrayList temp = gr.getOccupiedLocations();
		int fighterCount=0;
		for (int i=0; i<temp.size(); i++)
		{
			Location los = (Location)temp.get(i);
			Actor stuff= gr.get(los);
			if((stuff instanceof Fighter))
			{
				fighterCount++;

			}
		} 
		
		if(fighterCount==0)
		{
			
			Fighter reg= new Fighter();
			
			if(reg.getLives()<=0)
			{
				JOptionPane.showMessageDialog(null, "Sorry you've lost the game!");
				System.exit(0);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Oh no! You've been killed!"
					+ "\n But it's ok because you still have" + reg.getLives() + " left");
			reg.setLives(reg.getLives()-1);
			}
			reg.putSelfInGrid(gr,new Location(3,1));
			
		}
	}
	public void reviveBoss()
	{
		
		Grid<Actor> gr= getGrid();
		ArrayList temp = gr.getOccupiedLocations();
		int bossCount=0;
		
		for (int i=0; i<temp.size(); i++)
		{
			Location los = (Location)temp.get(i);
			Actor stuff= gr.get(los);
			if(stuff instanceof BossReg)
			{
				bossCount++;

			}
			
		} 
		if(bossCount==0 && itsTime())
		{
			Tornado1 bossAir= new Tornado1();
			bossAir.putSelfInGrid(gr, new Location(6,11));
		}
	}
	public boolean itsTime()
	{
		Fighter reg= new Fighter();
		int currentStage=reg.getStage();
		if(currentStage==5)
			return true;
		else
			return false;
		
	}
	
}
