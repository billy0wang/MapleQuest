package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Monster extends Actor 
{
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location left = loc.getAdjacentLocation(-90);
		Location right = loc.getAdjacentLocation(90);
		if(gr.isValid(left))
		{
			
			
//			if(thingRight instanceof Monster || thingRight instanceof Fighter)
//			moveTo(left);
//			else if(thingLeft instanceof Monster || thingLeft instanceof Fighter)
//			moveTo(right);
//			
			
			if ((loc.equals(getLocation()) && (gr.isValid(left)
					&& (gr.isValid(right)))))
			{
				double r = Math.random();
				int angle;
				if (r < 0.5)
					angle = Location.LEFT;
				else
					angle = Location.RIGHT;
				Location rando= loc.getAdjacentLocation(angle);
				if(gr.isValid(loc.getAdjacentLocation(angle)))
				{
					if(!(gr.get(rando)instanceof Actor))
					{	
						if((gr.isValid(loc.getAdjacentLocation(angle))
								&& canMove()))
						{ 
							
							double q = Math.random();
							if (q < 0.2)
							{
								moveTo(loc.getAdjacentLocation(angle));
							}
						}
					}
					else
						moveTo(loc.getAdjacentLocation(-angle));
				}
				else
					moveTo(loc.getAdjacentLocation(-angle));
			}
			
		}
		//Need to move back
		else 
		{
			moveTo(right);
		}
	}
	
	public void act()
	{
		
		otherMove();
		if(canMove())
			move();
	}	
	public void otherMove()
	{
		Grid<Actor> gr = getGrid();
		Location loc=getLocation();
		Actor thingRight= gr.get(loc.getAdjacentLocation(90));
		Location left= loc.getAdjacentLocation(-90);
		if(gr.isValid(left))
		{
			Actor thingRightBelow= gr.get(loc.getAdjacentLocation(135));
			Actor thingLeftBelow= gr.get(loc.getAdjacentLocation(225));
			if((!(thingRightBelow instanceof Actor))
					|| (thingRight instanceof SummerGround)
					&& (!(gr.get(left) instanceof Fighter)&& !(gr.get(left) instanceof Monster)))
				moveTo(loc.getAdjacentLocation(-90));
			else if((!(thingLeftBelow instanceof Actor))
					|| (gr.get(left) instanceof SummerGround)
					&& (!(thingRight instanceof Fighter)&& !(thingRight instanceof Monster)))
				moveTo(loc.getAdjacentLocation(90));
			if((thingRight instanceof Portal)
					&& !(gr.get(left) instanceof Fighter))
				moveTo(loc.getAdjacentLocation(-90));
			else if((gr.get(left) instanceof Portal)
					&& !(thingRight instanceof Fighter))
				moveTo(loc.getAdjacentLocation(90));
		}
		else
			moveTo(loc.getAdjacentLocation(90));
		
	}
	//	public void checkForStars()
	//	{
	//		Grid<Actor> gr = getGrid();
	//		Location loc = getLocation();
	//		Actor something= gr.get(loc.getAdjacentLocation(-90));
	//		Actor rightHere= gr.get(loc);
	//		Actor rightAfter= gr.get(loc.getAdjacentLocation(90));
	//		OrangeMushroomHit hit = new OrangeMushroomHit();
	//		if((something instanceof NinjaStars)
	//				|| (rightHere instanceof NinjaStars)
	//				|| (rightAfter instanceof NinjaStars))
	//		{
	//			hit.putSelfInGrid(gr,loc);
	//
	//		}
	//
	//	}
	public void spawning()
	{
		Grid<Actor> gr= getGrid();
		Location loc= getLocation();
		OrangeMushroomRegular orReg= new OrangeMushroomRegular();
		double r = Math.random();
		
		if(r<0.2)
		{
			double q= Math.random();
			int angle;
			if(q<0.5)
			{
				angle=Location.LEFT;
				Location randoLoc=loc.getAdjacentLocation(angle);
				if(!(gr.get(randoLoc)instanceof Actor))
					orReg.putSelfInGrid(gr,loc.getAdjacentLocation(angle));
				else
					orReg.putSelfInGrid(gr,loc.getAdjacentLocation(-angle));
			}
			else
			{
				angle=Location.RIGHT;
				Location randoLoc=loc.getAdjacentLocation(angle);
				if(!(gr.get(randoLoc)instanceof Actor))
					orReg.putSelfInGrid(gr,loc.getAdjacentLocation(angle));
				else
					orReg.putSelfInGrid(gr,loc.getAdjacentLocation(-angle));
			}
			
		}
	}
	public boolean canMove()
	{
		Grid<Actor> gr= getGrid();
		Location loc=getLocation();
		Actor thingBelow= gr.get(loc.getAdjacentLocation(180));
		Actor thingRightBelow= gr.get(loc.getAdjacentLocation(135));
		Actor thingLeftBelow= gr.get(loc.getAdjacentLocation(225));
		Actor thingRight= gr.get(loc.getAdjacentLocation(90));
		Actor thingLeft= gr.get(loc.getAdjacentLocation(-90));
		if((thingRight instanceof SummerGround && thingLeft instanceof Fighter)
				|| (thingLeft instanceof SummerGround && thingRight instanceof Fighter))
		{
			return false;
		}
		else if((thingBelow instanceof SummerGround)
				&& (thingRightBelow instanceof SummerGround)
				&& (thingLeftBelow instanceof SummerGround))
			return true;
		if((thingRight instanceof Monster)
				|| (thingLeft instanceof Monster))
			return false;
		
		else
			return false;
	}
}

