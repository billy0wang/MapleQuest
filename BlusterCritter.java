package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;
//Billy Wang
// PD 4 Comp Sci
public class BlusterCritter extends Critter
{
	private int courage;
	private static final double COLOR_FACTOR = 0.52;
	public BlusterCritter(int c)
	{
		courage=c;
	}
	public int getCourage() {
		return courage;
	}
	public void setCourage(int courage) {
		this.courage = courage;
	}
	public ArrayList<Actor> getActors()
	{

		Grid<Actor> gr= getGrid();
		ArrayList<Actor> newCritters = new ArrayList<Actor>();
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		for(int i=0; i<8; i++)
		{
			ArrayList<Actor> oldCritters = getGrid().getNeighbors(
					loc.getAdjacentLocation(getDirection()+(45*i)));
			for(int j=0; j<oldCritters.size(); j++)
			{
				if(!(newCritters.contains(oldCritters.get(j)))&&
						(!(oldCritters.get(j).equals(this))))
					newCritters.add(oldCritters.get(j));
			}
		}
		return newCritters;
		
	}
	public void processActors(ArrayList<Actor> critters)
	{
		int countCritter = 0;
		
		for (Actor a : critters)
		{
			if((a instanceof Critter))
			{

				countCritter++;
			}
		}
		
		if(countCritter>=courage)
		{
			
			Color c = getColor();
			int red = (int) (c.getRed() * (1 - COLOR_FACTOR));
			int green = (int) (c.getGreen() * (1 - COLOR_FACTOR));
			int blue = (int) (c.getBlue() * (1 - COLOR_FACTOR));

			setColor(new Color(red, green, blue));

		}
		else if(countCritter<courage)
		{
			
			Color c = getColor();
			int red = (int) Math.rint((c.getRed() * (1 + COLOR_FACTOR)));
			if(red==0)
			{
				red=1;
			}
			else if(red>255)
			{
				red=255;
			}

			int green = (int) Math.rint((c.getGreen() * (1 + COLOR_FACTOR)));
			if(green==0)
			{
				green=1;
			}
			else if(green>255)
			{
				green=255;
			}

			int blue = (int) Math.rint((c.getBlue() * (1 + COLOR_FACTOR)));
			if(blue==0)
			{
				blue=1;
			}
			else if(blue>255)
			{
				blue=255;
			}


			setColor(new Color(red, green, blue));
			
			

		}
	}

}

