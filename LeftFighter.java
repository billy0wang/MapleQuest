package Game;
import java.awt.Color;

import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class LeftFighter extends Fighter implements KeyboardControllable
{
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();

	}

	public void act()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Actor under= gr.get(loc.getAdjacentLocation(180));
		injured();
		if(!(under instanceof SummerGround) && !(under instanceof Portal)
				&& !(under instanceof Monster))
		{
			moveTo(loc.getAdjacentLocation(180));
		}
		
		
	}
	public void injured()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation(); 
		if(gr.isValid(loc.getAdjacentLocation(-90)))
		{
		if((gr.get(loc.getAdjacentLocation(-90)) instanceof SnowBall)
				|| (gr.get(loc.getAdjacentLocation(-90)) instanceof OrangeMushroomRegular)
				|| (gr.get(loc.getAdjacentLocation(0))instanceof IceRain5)
				||(gr.get(loc.getAdjacentLocation(90)) instanceof SnowBall)
				|| (gr.get(loc.getAdjacentLocation(90)) instanceof OrangeMushroomRegular))
		{

			health = health -30;
			LeftFighterHurt hurt = new LeftFighterHurt();
			hurt.setColor(Color.RED);
			hurt.putSelfInGrid(gr, loc);
			if (health == 0) 
			{
				if(lives==0)
				{
					JOptionPane.showMessageDialog(null,"You've lost the game!");
					System.exit(0);
				}
				lives=lives-1;
				JOptionPane.showMessageDialog(null,"You have died, but " +
						"its ok since you still have" + (lives+1) + " lives left");
				setHealth(500);

			}
		}
		else
			setColor(null);
		}
	}
	public void touchedWind()
	{
		Grid<Actor> gr = getGrid();
		Location loc=getLocation();
		Location left=loc.getAdjacentLocation(-90);
		if(gr.get(left)instanceof BossReg)
			moveTo(loc.getAdjacentLocation(90));
	}
	public void actionToPerform(String description)
	{

		Location loc = getLocation();
		Grid<Actor> gr= getGrid();
		LeftWalkingStance1 left1= new LeftWalkingStance1();
		left1.setColor(null);
		LeftFighter tPort= new LeftFighter();
		LeftAttack1 leftAttack1= new LeftAttack1();
		LeftAttack3 leftAttack3= new LeftAttack3();
		Location nextLeft=loc.getAdjacentLocation(-90);
		Location moreNextLeft=nextLeft.getAdjacentLocation(-90);
		WalkingFighterStance1 rightWalk= new WalkingFighterStance1();
		LeftVampire1 vamp= new LeftVampire1();
		
		if(description.equals("UP") ){


			try {  
				Actor above= gr.get(loc.getAdjacentLocation(0));
				Location up=loc.getAdjacentLocation(0);
				Actor under= gr.get(loc.getAdjacentLocation(180));
				if(gr.get(nextLeft) instanceof SummerGround)
				{
					if(!(gr.get(loc.getAdjacentLocation(315))instanceof Actor))
					{
						removeSelfFromGrid();
						(this).putSelfInGrid(gr, loc.getAdjacentLocation(315));
					}
				}
				else if(above instanceof SummerGround)
				{
					if(!(gr.get(up.getAdjacentLocation(0))instanceof Actor))
					{
						removeSelfFromGrid();
						Thread.sleep(50L);
						tPort.putSelfInGrid(gr,up.getAdjacentLocation(0));
						removeSelfFromGrid();
					}
				}
				else if(under instanceof SummerGround)
				{
					if(!(gr.get(loc.getAdjacentLocation(0))instanceof Actor))
					{
						removeSelfFromGrid();
						Thread.sleep(50L);
						tPort.putSelfInGrid(gr,loc.getAdjacentLocation(0));
						removeSelfFromGrid();
					}
				}
			}
			catch(Exception ex){}
		}
		if(description.equals("DOWN") ){


			try {  

				Location below=loc.getAdjacentLocation(180);
				Location doublebelow=below.getAdjacentLocation(180);
				Actor under= gr.get(loc.getAdjacentLocation(180));			
				Actor tripleUnder= gr.get(doublebelow.getAdjacentLocation(180));
				if((under instanceof SummerGround)
						&& (tripleUnder instanceof SummerGround))
				{
					if(!(gr.get(below.getAdjacentLocation(180))instanceof Actor))
					{
						removeSelfFromGrid();
						Thread.sleep(50L);
						tPort.putSelfInGrid(gr,below.getAdjacentLocation(180));
						removeSelfFromGrid();
					}

				}

			}  
			catch(Exception e) {}			
		}

		else if(description.equals("LEFT") && walkThroughLeft()
				&& (gr.isValid(nextLeft))
				&& (!(gr.get(loc.getAdjacentLocation(-90))instanceof Actor))) {

			try {  
				left1.putSelfInGrid(gr,loc);
				Thread.sleep(50L);   

			}  
			catch(Exception e) {}
		}
		else if(description.equals("RIGHT")) {

			try {  
				Fighter regular = new Fighter();
				regular.putSelfInGrid(gr, loc);
				Thread.sleep(50L);   

			}  
			catch(Exception e) {}
		}

		else if(description.equals("Z")) {

			try {  

				leftAttack1.putSelfInGrid(gr,loc);
				Thread.sleep(50L);   

			}  

			catch (Exception e) {}      

		}
		else if(description.equals("X") && stage>=2 &&
				mana>=30) {

			try {  
				LeftFighterThrow1 leftThrow= new LeftFighterThrow1();
				leftThrow.putSelfInGrid(gr,loc);
				Thread.sleep(50L);  
			} 
			catch (Exception e) {}      

		}
		else if(description.equals("C") && stage>=3
				&& mana>=40) {
			vamp.putSelfInGrid(gr,nextLeft.getAdjacentLocation(-90)); 
			mana=mana-40;
			if((gr.get(nextLeft)instanceof Monster
					|| gr.get(nextLeft)instanceof SnowBall
					|| gr.get(nextLeft)instanceof BossReg)
					&& (health<maxHealth))
				health=health+50;	
		}else if((description.equals("V")&& (stage>=4)
				&& mana>=100))
		{
			mana=mana-100;
			LeftLightning sharkie= new LeftLightning();
			LeftLightning light1= new LeftLightning();
			LeftLightning light2= new LeftLightning();
			LeftFighterLightning lightPose= new LeftFighterLightning();
			lightPose.putSelfInGrid(gr, loc);
			sharkie.putSelfInGrid(gr,loc.getAdjacentLocation(-90));
			light1.putSelfInGrid(gr, moreNextLeft);
			light2.putSelfInGrid(gr, moreNextLeft.getAdjacentLocation(90));
		}
	}
}
	

	



