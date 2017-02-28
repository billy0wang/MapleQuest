package Game;
import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class FinalRunner
{
	public static String str;
	public static void main(String[] args)
	{
		KeyWorld world = new KeyWorld(new BoundedGrid<Actor>(8,19));
		Fighter jack = new Fighter();
		BossReg boss = new BossReg();
		boss.bossHealth=1000;
		jack.health=200;
		jack.maxHealth=200;
		jack.mana=100;
		jack.stage=1;
		jack.lives=3;
		jack.setWorld(world);
		Portal portal= new Portal();
		CloudHeadQuarters hQ= new CloudHeadQuarters();
		portal.setColor(null);
		OrangeMushroom100HP orMushie= new OrangeMushroom100HP();
		world.add(new Location(5,1), jack );
		world.add(new Location(4,18), portal); //4, 18
		world.add(new Location(6,0), new SummerGround());
		world.add(new Location(6,1), new SummerGround());
		world.add(new Location(6,2), new SummerGround());
		world.add(new Location(6,3), new SummerGround());
		world.add(new Location(6,4), new SummerGround());
		world.add(new Location(6,5), new SummerGround());
		world.add(new Location(6,6), new SummerGround());
		world.add(new Location(4,1), new SummerGround());
		world.add(new Location(4,2), new SummerGround());
		world.add(new Location(4,3), new SummerGround());
		world.add(new Location(4,4), new SummerGround());
		world.add(new Location(4,5), new SummerGround());
		world.add(new Location(7,7), new SummerGround());
		world.add(new Location(7,8), new SummerGround());
		world.add(new Location(7,9), new SummerGround());
		world.add(new Location(7,10), new SummerGround());
		world.add(new Location(7,11), new SummerGround());
		world.add(new Location(7,12), new SummerGround());
		world.add(new Location(6,12), new SummerGround());
		world.add(new Location(6,13), new SummerGround());
		world.add(new Location(6,14), new SummerGround());
		world.add(new Location(6,15), new SummerGround());
		world.add(new Location(6,16), new SummerGround());
		world.add(new Location(5,16), new SummerGround());
		world.add(new Location(5,17), new SummerGround());
		world.add(new Location(5,18), new SummerGround());
		//world.add(new Location(5,19), new SummerGround());
		world.add(new Location(6,11), new OrangeMushroom100HP());
		world.add(new Location(5,15), new OrangeMushroom100HP());
		//world.add(new Location(5,9), new OrangeMushroom100HP());
		world.add(new Location(3,5), new OrangeMushroom100HP());
		world.add(new Location(0,4), hQ);
		world.add(new Location(5,6), orMushie);
		JOptionPane.showMessageDialog(null,"Welcome to MapleQuest!"+
				"\n Use the Arrow Keys to Move & Jump" +
				"\n Use Z to Throw Ninja Stars to Attack" +
				"\n Get to the portal to advance to th next stage. When" +
				"you have advance to a new stage, you gain an extra 100 health" +
				"and mana as well as a new ability!" + "\n " +
						"You lose hzzealth if you bump into a monster or get hit by" +
						"the projectiles of the boss" + "\n You lose mana by using" +
								"the new abilities you have gained, which will be " +
								"set to your X,C,& V keys, corresponding to the stage you are at" );
		world.show();
		
	}
	
	



}