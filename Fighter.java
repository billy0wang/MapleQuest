package Game;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Fighter extends Actor implements KeyboardControllable
{
	public static int health;
	public static int maxHealth;
	public static int mana;
	public static ActorWorld world;
	public static int stage;
	public static int lives;

	public static int getHealth() {
		return health;
	}

	public static void setHealth(int health) {
		Fighter.health = health;
	}

	public static ActorWorld getWorld() {
		return world;
	}
	public static void setWorld(ActorWorld world) {
		Fighter.world = world;
	}
	
	public static int getStage() {
		return stage;
	}

	public static void setStage(int stage) {
		Fighter.stage = stage;
	}
	public boolean walkThroughRight()
	{
		Grid<Actor> gr = getGrid();
		Location loc=getLocation();
		Location right=loc.getAdjacentLocation(90);
		if((gr.get(right)instanceof SummerGround)
				|| (gr.get(right)instanceof Monster))	
			return false;
		else
			return true;
	}

	public boolean walkThroughLeft()
	{
		Grid<Actor> gr = getGrid();
		Location loc=getLocation();
		if(gr.isValid(loc.getAdjacentLocation(-90)))
		{
		Location left=loc.getAdjacentLocation(-90);
		
		if((gr.get(left)instanceof SummerGround) ||
				(gr.get(left)instanceof Monster))
			return false;
		else
			return true;
		}
		return true;
		
	}

	public static int getLives() {
		return lives;
	}

	public static void setLives(int lives) {
		Fighter.lives = lives;
	}

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
		BossReg boss=  new BossReg();
		//noJumpOnStuff();
		injured();
		death();
		manaRegen();
		chillay();
		//frostBitten();
		if(health>maxHealth)
			health=maxHealth;
		world.setMessage("Health :" + health + 
				"              	 " +
				"Mana: "+mana +  "          	 " +
				"Boss Health: " +boss.getbossHealth() +
				"\nLives : " + lives  +
				"              	 " + "              	 " +
				"Stage: " +stage);

		if(!(under instanceof SummerGround) && !(under instanceof Portal)
				&& !(under instanceof Monster))
		{
			moveTo(loc.getAdjacentLocation(180));
		}
		
	}	

	public void manaRegen()
	{
		if(mana<(100*stage))
			mana=mana+1;

		if(mana<0)
			mana=0;
	}
	//	public void levelUp()
	//	{
	//		Grid<Actor> gr = getGrid();
	//		Location loc = getLocation();
	//		ArrayList temp = gr.getOccupiedLocations();
	//		int monsterCount=0;
	//		int experience=0;
	//		for (int i=0; i<temp.size(); i++)
	//		{
	//			Location los = (Location)temp.get(i);
	//			Actor stuff= gr.get(los);
	//			if(stuff instanceof OrangeMushroomRegular)
	//				//In school form, OrangeMushroomRegular would be Monster 
	//				monsterCount++;		
	//		}
	//		System.out.println(monsterCount);
	//		if(monsterCount<monsterCount)
	//			experience=experience+20;
	//	}
	public void injured()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(gr.isValid(loc.getAdjacentLocation(-90))
				&& gr.isValid(loc.getAdjacentLocation(90)))
		{
		if((gr.get(loc.getAdjacentLocation(90)) instanceof SnowBall)
				|| (gr.get(loc.getAdjacentLocation(90)) instanceof Monster)
				|| ((gr.isValid(loc.getAdjacentLocation(0))) && (gr.get(loc.getAdjacentLocation(0))instanceof IceRain5))
				|| (gr.get(loc.getAdjacentLocation(-90)) instanceof SnowBall)
				|| (gr.get(loc.getAdjacentLocation(-90)) instanceof Monster))
		{

			health = health -30;
			FighterHurt hurt = new FighterHurt();
			hurt.setColor(Color.RED);
			hurt.putSelfInGrid(gr, loc);
		}
		else
			setColor(null);
		}
	}
	public void death()
	{
		if (health <= 0) 
		{
			if(lives<=0)
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
	public void noJumpOnStuff()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(gr.get(loc.getAdjacentLocation(180))instanceof Monster
				|| gr.get(loc.getAdjacentLocation(135))instanceof Monster)
		{
			health = health -30;
			FighterHurt hurt = new FighterHurt();
			hurt.setColor(Color.RED);
			if(!(gr.get(loc.getAdjacentLocation(180))instanceof Actor))
			{
					hurt.putSelfInGrid(gr, loc.getAdjacentLocation(180));
					removeSelfFromGrid();
			}
			else
				hurt.putSelfInGrid(gr, loc.getAdjacentLocation(225));
		}
		if(gr.get(loc.getAdjacentLocation(180))instanceof Portal
				|| gr.get(loc.getAdjacentLocation(135))instanceof Portal)
		{
			moveTo(loc.getAdjacentLocation(225));
		}
	}
	public void frostBitten()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(gr.get(loc.getAdjacentLocation(0))instanceof IceRain5)
		{
			health = health -50;
			FighterHurt hurt = new FighterHurt();
			hurt.setColor(Color.BLUE);
			hurt.putSelfInGrid(gr, loc);
		}
		else
		{
			setColor(null);
		}
	}
	public void chillay()
	{
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(loc!=null)
		{
			Location right=loc.getAdjacentLocation(90);
			if(gr.get(right)instanceof BossReg)
			{
				FighterHurt hurt=new FighterHurt();
				hurt.setColor(Color.RED);
				hurt.putSelfInGrid(gr,loc.getAdjacentLocation(-90));
				removeSelfFromGrid();
			}
		}
	}
	public void checkForGround()
	{
		Grid<Actor> gr = getGrid();
		Location loc=getLocation();
		Location underLoc=loc.getAdjacentLocation(180);
		if(!(gr.get(underLoc)instanceof SummerGround))
		{
			try
			{
				Thread.sleep(100L);
				moveTo(underLoc);
			}
			catch(Exception ex){}

		}

	}
	public void actionToPerform(String description)
	{
		WalkingFighterStance1 walk1 = new WalkingFighterStance1();
		Location loc = getLocation();
		Location nextLeft = loc.getAdjacentLocation(-90);
		Location nextRight = loc.getAdjacentLocation(90);
		Location morenextRight = nextRight.getAdjacentLocation(90);
		Grid<Actor> gr= getGrid();
		LeftFighter leftGuy= new LeftFighter();
		if(getGrid() == null)
			return;
		Fighter regular= new Fighter();
		JumpFighter tPort= new JumpFighter();
		AttackFighterStance1 attack1= new AttackFighterStance1();
		Lightning sharkie= new Lightning();
		Vampire1 vamp= new Vampire1();
		Lightning light1= new Lightning();
		Lightning light2= new Lightning();
		FighterLightning lightPose= new FighterLightning();
		FlameThrower flame= new FlameThrower();

		if(description.equals("UP") ){
			
		
			try {  
				Actor above= gr.get(loc.getAdjacentLocation(0));
				Location up=loc.getAdjacentLocation(0);
				Actor under= gr.get(loc.getAdjacentLocation(180));
				if(gr.get(nextRight) instanceof SummerGround)
				{
					if(!(gr.get(loc.getAdjacentLocation(45))instanceof Actor))
					{
						removeSelfFromGrid();
						(this).putSelfInGrid(gr, loc.getAdjacentLocation(45));
					}
					else
					{
						removeSelfFromGrid();
						tPort.putSelfInGrid(gr,loc.getAdjacentLocation(0));
						removeSelfFromGrid();
					}
				}
				else if(above instanceof SummerGround)
				{
					if(!(gr.get(up.getAdjacentLocation(0))instanceof Actor))
					{
						removeSelfFromGrid();
						tPort.putSelfInGrid(gr,up.getAdjacentLocation(0));
						removeSelfFromGrid();
					}
				}
				else if(under instanceof SummerGround)
				{
					if(!(gr.get(loc.getAdjacentLocation(0))instanceof Actor))
					{
						removeSelfFromGrid();
						tPort.putSelfInGrid(gr,loc.getAdjacentLocation(0));
						removeSelfFromGrid();
					}
				}
			}
				catch(Exception ex){}
	}
		if(description.equals("DOWN") ){


			try {  
				Actor above= gr.get(loc.getAdjacentLocation(0));
				Location up=loc.getAdjacentLocation(0);
				Location below=loc.getAdjacentLocation(180);
				Location doublebelow=below.getAdjacentLocation(180);
				Actor under= gr.get(loc.getAdjacentLocation(180));
				Actor doubleUnder= gr.get(below.getAdjacentLocation(180));
				Actor tripleUnder= gr.get(doublebelow.getAdjacentLocation(180));
				if((under instanceof SummerGround)
						&& (tripleUnder instanceof SummerGround))
				{
					if(!(gr.get(below.getAdjacentLocation(180))instanceof Actor))
					{
					removeSelfFromGrid();
					Thread.sleep(50L);
					regular.putSelfInGrid(gr,below.getAdjacentLocation(180));
					removeSelfFromGrid();
					}

				}




			}  
			catch(Exception e) {}
			//			moveTo(getLocation().getAdjacentLocation(180));


		}


		if (description.equals("LEFT") && getGrid().isValid(nextLeft)) {
			//	&& (!(gr.get(loc.getAdjacentLocation(90))instanceof Actor))

			try {  
				leftGuy.putSelfInGrid(gr,loc);
				Thread.sleep(50L);   

			}  
			catch(Exception e) {}
		}
		if(description.equals("RIGHT") && getGrid().isValid(nextRight)
				&& walkThroughRight()) {

			try {  
				walk1.putSelfInGrid(gr,loc);
				Thread.sleep(10L);   

			}  

			catch (Exception e) {}      



		}
		else if(description.equals("Z")) {

			try {  
				attack1.putSelfInGrid(gr,loc);

			}  
			catch(Exception e) {}
		}

		else if((description.equals("X") && (stage>=2)
				&& mana>=30)){
			try {  
				mana=mana-30;
				FighterThrow1 throw1= new FighterThrow1();
				throw1.putSelfInGrid(gr,loc);

			}  
			catch(Exception e) {}
		}
		else if((description.equals("C")&& (stage>=3)
				&& mana>=40)){

				if((gr.get(morenextRight)instanceof Monster
						|| gr.get(morenextRight)instanceof SnowBall
						|| gr.get(morenextRight)instanceof BossReg
						&& (health<maxHealth)))
					health=health+50;			
//				else if (gr.get(morenextRight)instanceof SnowBall
//					&& (health<maxHealth))
//					health=health+50;
//				else if ((gr.get(morenextRight)instanceof BossReg)
//						&& (health<maxHealth))
//					health=health+50;
				
				
				mana=mana-40;
				vamp.putSelfInGrid(gr,morenextRight); 
				
				
				
		}
		else if((description.equals("V")&& (stage>=4)
				&& mana>=100))
		{
			mana=mana-100;
			lightPose.putSelfInGrid(gr, loc);
			sharkie.putSelfInGrid(gr,loc.getAdjacentLocation(90));
			light1.putSelfInGrid(gr, morenextRight);
			light2.putSelfInGrid(gr, morenextRight.getAdjacentLocation(90));
		}

	}




}
